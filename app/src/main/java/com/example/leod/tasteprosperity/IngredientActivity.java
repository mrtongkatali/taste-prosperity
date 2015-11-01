package com.example.leod.tasteprosperity;

import android.app.ActionBar;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
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

        int testCount = 50;
        for(int i=0; i<testCount; i++) {
            TableRow tr = new TableRow(this);

            int modulus = i % 2;

            tr.setId(100 + i);
            tr.setLayoutParams(tlParams);
            tr.setBackgroundColor(((modulus == 0) ? Color.parseColor("#f7f6f4") : Color.WHITE));
            tr.setPadding(0, 5, 0, 5);

            LinearLayout container = new LinearLayout(this);
            container.setOrientation(LinearLayout.VERTICAL);

            TextView ingrdName = new TextView(this);
            ingrdName.setTextSize(18);
            ingrdName.setText("Spinach and Carrots Spinach");
            ingrdName.setTextColor(Color.BLACK);
            ingrdName.setLayoutParams(tlParams);
            ingrdName.setPadding(5, 0, 0, 0);
            container.addView(ingrdName);

            TextView ingrdDescription = new TextView(this);
            //ingrdDescription.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            ingrdDescription.setTextSize(10);
            ingrdDescription.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
            ingrdDescription.setTextColor(Color.BLACK);
            ingrdDescription.setLayoutParams(tlParams);
            ingrdDescription.setPadding(5, 0, 0, 0);
            //ingrdDescription.setWidth(container.getWidth());
            container.addView(ingrdDescription);

            tr.addView(container);
            ingredientsTblLayout.addView(tr, tlParams);
        }
    }


}
