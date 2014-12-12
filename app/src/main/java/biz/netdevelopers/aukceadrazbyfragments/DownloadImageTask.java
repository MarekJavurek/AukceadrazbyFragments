package biz.netdevelopers.aukceadrazbyfragments;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.PowerManager;
import android.widget.LinearLayout;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;


public class DownloadImageTask extends AsyncTask<String, Integer, Bitmap> {

    private Context context;
    private PowerManager.WakeLock mWakeLock;
    public LinearLayout id;

    public DownloadImageTask(Context context, LinearLayout id) {
        this.context = context;
        this.id = id;
    }

    @Override
    protected Bitmap doInBackground(String... sUrl) {
        InputStream input = null;
        ByteArrayOutputStream output = null;
        HttpURLConnection connection = null;
        try {
            URL url = new URL(sUrl[0]);
            connection = (HttpsURLConnection) url.openConnection();
            connection.connect();

            // expect HTTP 200 OK, so we don't mistakenly save error report instead of the file
            if (connection.getResponseCode() != HttpsURLConnection.HTTP_OK) {
                return null;
            }

            int fileLength = connection.getContentLength();

            // download the file
            input = connection.getInputStream();
            output = new ByteArrayOutputStream();

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
            return null;
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


        if (output != null) {
            return BitmapFactory.decodeByteArray(output.toByteArray(), 0, output.size());
        } else {
            return null;
        }
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        PowerManager pm = (PowerManager) context.getSystemService(Context.POWER_SERVICE);
        mWakeLock = pm.newWakeLock(PowerManager.PARTIAL_WAKE_LOCK, getClass().getName());
        mWakeLock.acquire();
    }

    @Override
    protected void onPostExecute(Bitmap result) {
        mWakeLock.release();
    }
}