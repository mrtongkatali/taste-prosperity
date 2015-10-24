package com.example.leod.tasteprosperity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.leod.tasteprosperity.Model.Session;
import com.example.leod.tasteprosperity.R;
import com.example.leod.tasteprosperity.Storage.SharedPref;

public class IngredientActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingredient);
        Toolbar toolbar = (Toolbar) findViewById(R.id.ingredientToolbar);
        setSupportActionBar(toolbar);
    }

    public void backToHome(View view) {
        startActivity(new Intent(IngredientActivity.this, HomeActivity.class));
        finish();
    }

}
