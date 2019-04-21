package com.example.a26081.a3;
import android.os.Bundle;
import android.preference.PreferenceFragment;
import java.util.prefs.PreferencesFactory;

public class fragment extends PreferenceFragment {

    @Override

    public void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.preference);

    }

}