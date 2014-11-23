package biz.netdevelopers.aukceadrazbyfragments.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;

import biz.netdevelopers.aukceadrazbyfragments.R;
import biz.netdevelopers.aukceadrazbyfragments.Utils;

/**
 * Created by Winnie on 23.11.2014.
 */
public class Nastaveni extends Activity {

    Utils u;
    Switch s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nastaveni);

        s = (Switch) findViewById(R.id.switch1);

        u = new Utils(this);

        String nastaveni_3g = u.loadSettings("nastaveni_3g");

        s.setChecked(Boolean.valueOf(nastaveni_3g));
    }


    public void onClick(View v) {
        u.saveSettings("nastaveni_3g", String.valueOf(s.isChecked()));
    }


}