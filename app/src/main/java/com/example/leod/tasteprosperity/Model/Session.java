package com.example.leod.tasteprosperity.Model;

import android.content.SharedPreferences;

/**
 * Created by agtechlabsruel on 10/14/15.
 */
public class Session {

    private static final String ISLOGIN                     = "isLoggedIn";

    public static void setIsLoggedIn(SharedPreferences sharedpreferences,boolean params){
        sharedpreferences.edit().putBoolean(ISLOGIN, params).commit();
    }

    public static boolean isLoggedIn(SharedPreferences sharedpreferences){
        return sharedpreferences.getBoolean(ISLOGIN, false);
    }


}
