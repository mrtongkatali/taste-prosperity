package com.example.leod.tasteprosperity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;
import android.view.View;

import com.example.leod.tasteprosperity.Model.Session;
import com.example.leod.tasteprosperity.R;
import com.example.leod.tasteprosperity.Storage.SharedPref;

public class HomeActivity extends AppCompatActivity {
    public SharedPreferences sharedpreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar homeToolbar = (Toolbar) findViewById(R.id.homeToolbar);
        setSupportActionBar(homeToolbar);

        sharedpreferences               = getSharedPreferences(SharedPref.PREFKEY, Context.MODE_PRIVATE);
        if(!Session.isLoggedIn(sharedpreferences)) {
            startActivity(new Intent(HomeActivity.this, LoginActivity.class));
            finish();
        }
    }

    public void exitApp(View view) {
        Session.setIsLoggedIn(sharedpreferences, false);
        startActivity(new Intent(HomeActivity.this, LoginActivity.class));
        finish();
    }

    public void viewIngredient(View view) {
        sharedpreferences               = getSharedPreferences(SharedPref.PREFKEY, Context.MODE_PRIVATE);
        if(!Session.isLoggedIn(sharedpreferences)) {
            startActivity(new Intent(HomeActivity.this, LoginActivity.class));
        } else {
            startActivity(new Intent(HomeActivity.this, IngredientActivity.class));
        }
        finish();
    }

}
