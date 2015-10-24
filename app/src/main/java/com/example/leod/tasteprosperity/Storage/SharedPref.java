package com.example.leod.tasteprosperity.Storage;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by agtechlabsruel on 10/14/15.
 */
public class SharedPref {
    private static Context context;
    public static final String PREFKEY = "heliossoftwaredev_rng";

    public static void init(Context context) {
        SharedPref.context = context;
    }

    public static SharedPreferences getInstance() {
        return context.getSharedPreferences(SharedPref.PREFKEY, Context.MODE_PRIVATE);
    }
}