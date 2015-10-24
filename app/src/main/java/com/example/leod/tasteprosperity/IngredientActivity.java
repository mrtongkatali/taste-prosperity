package com.example.leod.tasteprosperity;

import android.app.ActionBar;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

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

        getAllIngredients();
    }

    public void backToHome(View view) {
        startActivity(new Intent(IngredientActivity.this, HomeActivity.class));
        finish();
    }

    public void getAllIngredients() {
        TableLayout ingredientsTblLayout = (TableLayout) findViewById(R.id.ingredientsTbl);

        TableRow.LayoutParams tlParams = new TableRow.LayoutParams(
                TableRow.LayoutParams.MATCH_PARENT,
                TableRow.LayoutParams.WRAP_CONTENT
        );


        int testCount = 100;
        for(int i=0; i<testCount; i++) {
            TableRow tr = new TableRow(this);

            tr.setId(100 + i);
            tr.setLayoutParams(tlParams);

            TextView labelTV = new TextView(this);
            labelTV.setId(200+i);
            labelTV.setText("TV1");
            labelTV.setTextColor(Color.RED);
            labelTV.setLayoutParams(tlParams);
            tr.addView(labelTV);

            TextView valueTV = new TextView(this);
            valueTV.setId(i);
            valueTV.setText("TV2");
            valueTV.setTextColor(Color.RED);
            valueTV.setLayoutParams(tlParams);
            tr.addView(valueTV);

            ingredientsTblLayout.addView(tr, tlParams);
        }
    }


}
