package org.illusion.settings.fragments;

import android.app.Activity;
import org.illusion.settings.SettingsPreferenceFragment;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.Preference.OnPreferenceChangeListener;
import android.os.Bundle;

import org.illusion.settings.R;

public class GeneralUI extends SettingsPreferenceFragment implements OnPreferenceChangeListener {

    private static final String TAG = "General User Interface";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.title_generalui);

        addPreferencesFromResource(R.xml.general_ui_settings);
    }

    @Override
    public boolean onPreferenceChange(Preference preference, Object newValue) {
        return true;
    }
}
