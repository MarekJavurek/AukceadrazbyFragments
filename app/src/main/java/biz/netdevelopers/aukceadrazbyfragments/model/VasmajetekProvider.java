package biz.netdevelopers.aukceadrazbyfragments.model;

import android.app.ProgressDialog;
import android.content.Context;

import org.json.JSONArray;
import org.json.JSONObject;

import java.lang.Exception;
import java.lang.Integer;
import java.lang.InterruptedException;
import java.lang.Override;
import java.lang.String;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import biz.netdevelopers.aukceadrazbyfragments.DownloadFilesTask;
import biz.netdevelopers.aukceadrazbyfragments.DownloadFilesTaskObject;
import biz.netdevelopers.aukceadrazbyfragments.Utilities;
import biz.netdevelopers.aukceadrazbyfragments.activity.AuctionListActivity;


public class VasmajetekProvider {

    // kontext
    public Context context;
    // je uzivatel online
    public boolean isOnline;

    DownloadFilesTask dft;
    DownloadFilesTaskObject dfto;
    // cesta k souboru kde je ulozen soubor s poslednimy stazenymy daty vsech aukci JSON
    String finalAllDest;
    // progress dialog stahovani
    ProgressDialog mProgressDialog;

    // konstruktor
    public VasmajetekProvider(Context context) {
        this.context = context;
        this.isOnline = new Utilities(this.context).isOnline();
    }

    public static Map<String, AuctionObject> ITEM_MAP = new HashMap<String, AuctionObject>();
    public static List<AuctionObject> ITEMS = new ArrayList<AuctionObject>();

    public static void addItem(AuctionObject item) {
        ITEMS.add(item);
        ITEM_MAP.put(String.valueOf(item.getOffer_id()), item);
    }

    // ziskani seznamu vsech aukci
    public void getAll() throws Exception {
        // ArrayList<AuctionObject> all = new ArrayList<AuctionObject>();

        // je uzivatel online?
        if (isOnline) {

            mProgressDialog = new ProgressDialog(this.context);
            mProgressDialog.setMessage("Aktualizace dat...");
            mProgressDialog.setIndeterminate(true);
            mProgressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
            mProgressDialog.setCancelable(true);

            dfto = new DownloadFilesTaskObject();
            try {
                //dfto.setUrl(new URL("http://netdevelopers.biz/_da/download_test/5.dat"));
                dfto.setUrl(new URL("http://netdevelopers.biz/_da/download.php")); // http://netdevelopers.biz/_da/download.php // http://ipv6.download.thinkbroadband.com/5MB.zip
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }

            finalAllDest = this.context.getFilesDir() + "all.json";
            dfto.setDestination(finalAllDest); // this.context.getFilesDir() + //"/sdcard/all.json"

            dft = new DownloadFilesTask(this.context) {
                @Override
                protected void onPreExecute() {
                    super.onPreExecute();
                    mProgressDialog.show();
                }

                @Override
                protected void onProgressUpdate(Integer... progress) {
                    super.onProgressUpdate(progress);
                    mProgressDialog.setIndeterminate(false);
                    mProgressDialog.setMax(100);
                    mProgressDialog.setProgress(progress[0]);
                }

                @Override
                protected void onPostExecute(String result) {
                    super.onPostExecute(result);
                    mProgressDialog.dismiss();

                    AuctionListActivity a = (AuctionListActivity) context;
                    try {
                        a.DataChanged(getArrayFromJSONAll(context.getFilesDir() + "all.json"));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            };


            // spusteni stahovani v novem vlakne, zatim jsem toto nedoresil
            dft.execute(dfto);

            /*
            String aResultM = dft.get(); // http://stackoverflow.com/questions/16912768/asynctasks-get-method-is-there-any-scenario-where-it-is-actually-the-best-op

            if (aResultM == null)
                try {
                    return getArrayFromJSONAll(finalAllDest); // TODO
                } catch (Exception e) {
                    e.printStackTrace();
                }
            else
                return null;
            */

        } else {
            String lastUpdate = "?";
            new Utilities(this.context).TL("Nejsi online, poslední aktualizace dat: " + lastUpdate);
            // TODO pokud nejsi online nacti data od posledne

            AuctionListActivity a = (AuctionListActivity) this.context;
            a.DataChanged(getArrayFromJSONAll(this.context.getFilesDir() + "all.json"));
        }

    }


    // http://www.androidhive.info/2012/01/android-json-parsing-tutorial/
    // http://www.androidhive.info/2012/01/android-json-parsing-tutorial/
    // konverze z souboru do arraylistu AuctionObject
    private ArrayList<AuctionObject> getArrayFromJSONAll(String dest) throws Exception {

        ArrayList<AuctionObject> all = new ArrayList<AuctionObject>();

        String json = Utilities.getStringFromFile(dest);

        JSONArray data = new JSONArray(json);

        // looping through All nodes
        for (int i = 0; i < data.length(); i++) {
            JSONObject c = data.getJSONObject(i);
            AuctionObject a = new AuctionObject();

            a.setAdvert_name(c.getString("2"));
            a.setAdvert_price(c.getInt("4"));
            a.setAdvert_type(c.getInt("3"));
            a.setLocality_nuts(c.getString("6"));
            a.setOffer_id(c.getInt("1"));

            all.add(a);
            this.addItem(a);
        }

        return all;
    }


    // ziskani objektu konkretni aukce
    public AuctionObject getOne(int id) {
        AuctionObject one = new AuctionObject();

        // TODO

        return one;
    }

}
