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
import java.lang.reflect.Field;
import java.util.Random;

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

    public static int randInt(int min, int max) {

        // NOTE: Usually this should be a field rather than a method
        // variable so that it is not re-seeded every call.
        Random rand = new Random();

        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
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

    public boolean loadBoolSettings(String key) {
        SharedPreferences sharedPref =PreferenceManager.getDefaultSharedPreferences(this.context);
        return sharedPref.getBoolean(key, false);
    }


    public static String getValueOf(Object clazz, String lookingForValue) throws Exception {

        Field field = clazz.getClass().getField(lookingForValue);
        Class clazzType = field.getType();
        if (clazzType.toString().equals("double"))
            return String.valueOf(field.getDouble(clazz));
        else if (clazzType.toString().equals("int"))
            return String.valueOf(field.getInt(clazz));
        return (String) field.get(clazz);
    }

}
