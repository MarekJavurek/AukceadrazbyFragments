package biz.netdevelopers.aukceadrazbyfragments;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.preference.PreferenceManager;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;import java.lang.Exception;import java.lang.String;import java.lang.StringBuilder;

public class Utilities {

    Context context;

    // konstruktor
    public Utilities(Context context) {
        this.context = context;
    }

    // je zarizeni pripojene k internetu?
    public boolean isOnline() {
        ConnectivityManager cm = (ConnectivityManager) this.context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        return netInfo != null && netInfo.isConnectedOrConnecting();
    }

    // je uzivatel pripojen pres 3G
    public boolean Is3G() {
        ConnectivityManager cm = (ConnectivityManager) this.context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        return netInfo.getType() == ConnectivityManager.TYPE_MOBILE;
    }

    // funkce na rychlejsi vytvoreni toastmessage
    public void TL(String msg) {
        Toast.makeText(this.context, msg, Toast.LENGTH_LONG).show();
    }

    // pomocna fce pro fci getStringFromFile
    public static String convertStreamToString(InputStream is) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        StringBuilder sb = new StringBuilder();
        String line = null;
        while ((line = reader.readLine()) != null) {
            sb.append(line).append("\n");
        }
        reader.close();
        return sb.toString();
    }


    // fce na ziskani obsahu souboru do String promene
    public static String getStringFromFile(String filePath) throws Exception {
        File fl = new File(filePath);
        FileInputStream fin = new FileInputStream(fl);
        String ret = convertStreamToString(fin);
        //Make sure you close all streams.
        fin.close();
        return ret;
    }

    public void saveBoolSettings(String key, Boolean value) {
        SharedPreferences sharedPref =PreferenceManager.getDefaultSharedPreferences(this.context);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putBoolean(key, value);
        editor.commit();
    }

    public String loadBoolSettings(String key) {

    }

}
