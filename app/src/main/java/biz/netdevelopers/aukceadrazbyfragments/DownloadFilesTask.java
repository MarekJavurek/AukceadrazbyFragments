package biz.netdevelopers.aukceadrazbyfragments;

import android.content.Context;
import android.os.AsyncTask;
import android.os.PowerManager;
import android.widget.Toast;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

// trda dedi od AsyncTask takze na 3 zakladni fce doInBackground, onPreExecute, onPostExecute
// pouzita pro stahovani v novem vlakne aby aplikace nezamrzla
public class DownloadFilesTask extends AsyncTask<DownloadFilesTaskObject, Integer, String> {

    private Context context;
    private PowerManager.WakeLock mWakeLock;
    public String id;

    public DownloadFilesTask(Context context, String id) {
        this.context = context;
        this.id = id;
    }

    @Override
    protected String doInBackground(DownloadFilesTaskObject... sUrl) {
        InputStream input = null;
        OutputStream output = null;
        HttpURLConnection connection = null;
        try {
            URL url = sUrl[0].getUrl();
            connection = (HttpURLConnection) url.openConnection();
            connection.connect();

            // expect HTTP 200 OK, so we don't mistakenly save error report instead of the file
            if (connection.getResponseCode() != HttpURLConnection.HTTP_OK) {
                return "Server returned HTTP " + connection.getResponseCode()
                        + " " + connection.getResponseMessage();
            }

            // this will be useful to display download percentage
            // might be -1: server did not report the length
            int fileLength = connection.getContentLength();

            // download the file
            input = connection.getInputStream();
            output = new FileOutputStream(sUrl[0].getDestination());

            byte data[] = new byte[4096];
            long total = 0;
            int count;
            while ((count = input.read(data)) != -1) {
                // allow canceling with back button
                if (isCancelled()) {
                    input.close();
                    return null;
                }
                total += count;
                // publishing the progress...
                if (fileLength > 0) // only if total length is known
                    publishProgress((int) (total * 100 / fileLength));
                output.write(data, 0, count);
            }
        } catch (Exception e) {
            return e.toString();
        } finally {
            try {
                if (output != null)
                    output.close();
                if (input != null)
                    input.close();
            } catch (IOException ignored) {
            }

            if (connection != null)
                connection.disconnect();
        }
        return null;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        // take CPU lock to prevent CPU from going off if the user
        // presses the power button during download
        PowerManager pm = (PowerManager) context.getSystemService(Context.POWER_SERVICE);
        mWakeLock = pm.newWakeLock(PowerManager.PARTIAL_WAKE_LOCK, getClass().getName());
        mWakeLock.acquire();
    }

    @Override
    protected void onPostExecute(String result) {
        mWakeLock.release();
        if (result != null)
            Toast.makeText(context, "Chyba: aktualizace se nezdařila: " + result, Toast.LENGTH_LONG).show();
        else
            Toast.makeText(context, "Data byla aktualizována", Toast.LENGTH_LONG).show();
    }
}