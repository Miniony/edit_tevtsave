package com.example.prefconfig;

import android.content.Context;
import android.content.SharedPreferences;

public class prefconfig {
    private static final String MY_PREFERENCE_NAME = "com.iot.smart_home";
    private static final String PREF_AIRTIME_KEY = "pref_airtime_key";
    // for air setting time
    public static void saveAIRTimeKey(Context context, String airTime) {
        SharedPreferences pref = context.getSharedPreferences(MY_PREFERENCE_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString(PREF_AIRTIME_KEY, airTime);
        editor.apply();
    }
    public static String loadAIRTimeKey(Context context) {
        SharedPreferences pref = context.getSharedPreferences(MY_PREFERENCE_NAME, Context.MODE_PRIVATE);
        return pref.getString(PREF_AIRTIME_KEY, "");
    }

}
