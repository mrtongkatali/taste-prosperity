package com.example.leod.tasteprosperity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;
import android.view.View;

import com.example.leod.tasteprosperity.Model.Session;
import com.example.leod.tasteprosperity.R;
import com.example.leod.tasteprosperity.Storage.SharedPref;

public class MainActivity extends AppCompatActivity {
    public SharedPreferences sharedpreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedpreferences               = getSharedPreferences(SharedPref.PREFKEY, Context.MODE_PRIVATE);
        if(!Session.isLoggedIn(sharedpreferences)) {
            startActivity(new Intent(MainActivity.this, LoginActivity.class));
        } else {
            startActivity(new Intent(MainActivity.this, HomeActivity.class));
        }

        finish();
    }

}
