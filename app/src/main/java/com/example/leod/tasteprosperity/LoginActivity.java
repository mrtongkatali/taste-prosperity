package com.example.leod.tasteprosperity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.leod.tasteprosperity.Model.Session;
import com.example.leod.tasteprosperity.R;
import com.example.leod.tasteprosperity.Storage.SharedPref;

/**
 * Created by agtechlabsruel on 10/14/15.
 */
public class LoginActivity extends Activity {
    EditText etUsername, etPassword;
    Button btnlogin,btncancel;
    public SharedPreferences sharedpreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        sharedpreferences               = getSharedPreferences(SharedPref.PREFKEY, Context.MODE_PRIVATE);
        etUsername = (EditText)findViewById(R.id.etUsername);
        etPassword = (EditText)findViewById(R.id.etPassword);
        btnlogin = (Button)findViewById(R.id.btnlogin);
        btncancel = (Button)findViewById(R.id.btncancel);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validateUserCred();
            }
        });
        btncancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    public void validateUserCred(){
        if(etUsername.getText().toString().equals("leo") && etPassword.getText().toString().equals("leo")){
            Session.setIsLoggedIn(sharedpreferences,true);
            startActivity(new Intent(LoginActivity.this, MainActivity.class));
            finish();
        }
        else{
            Toast.makeText(getApplicationContext(), "Invalid User Credentials!", Toast.LENGTH_SHORT).show();
        }

    }

}
