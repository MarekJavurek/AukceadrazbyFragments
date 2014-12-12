package biz.netdevelopers.aukceadrazbyfragments.activity;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Switch;

import biz.netdevelopers.aukceadrazbyfragments.R;
import biz.netdevelopers.aukceadrazbyfragments.Utilities;

/**
 * Created by Winnie on 23.11.2014.
 */
public class SettingsActivity extends Activity {

    Utilities u;
    Switch s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        s = (Switch) findViewById(R.id.switch1);

        u = new Utilities(this);

        s.setChecked(u.loadBoolSettings("nastaveni_3g"));
    }


    public void onClick(View v) {

        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);

        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putBoolean("nastaveni_3g", s.isChecked());
        editor.commit();

        u.saveBoolSettings("nastaveni_3g", s.isChecked());

        this.finish();
    }

    public void onClickCancel(View v) {
        this.finish();
    }


}