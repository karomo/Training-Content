package com.karomo.widgetexample;

import android.os.Bundle;
import android.preference.PreferenceActivity;


/**
 * Created by karomo on 7/20/15.
 */
import android.os.Bundle;
import android.preference.PreferenceActivity;

public class SettingsActivity extends PreferenceActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
    }
}


