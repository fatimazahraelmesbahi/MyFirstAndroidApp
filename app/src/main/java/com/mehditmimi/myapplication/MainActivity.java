package com.mehditmimi.myapplication;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.mehditmimi.myapplication.actions.AythentificationAction;
import com.mehditmimi.myapplication.business.Services;

public class MainActivity extends Activity {
    private Button loginButton;
    private Button facebookButton;
    private Button twitterButton;
    private TextView sign_up;
    private EditText emailInput;
    private EditText passwordInput;

    private Services services;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        services= ((MyContext)getApplicationContext()).getServices();
        facebookButton = findViewById(R.id.facebookButton);
        sign_up = findViewById(R.id.sign_up);

        //recuperation des views
        loginButton= findViewById(R.id.register_button);
        emailInput = findViewById(R.id.name_input);
        passwordInput = findViewById(R.id.password_input);

        facebookButton.setOnClickListener(view -> {
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        });

        AythentificationAction aythentificationAction = new AythentificationAction(this);
        loginButton.setOnClickListener(aythentificationAction);

        Log.i("GL-2023","on create called");
    }
    public EditText getEmailInput() {
        return emailInput;
    }

    public EditText getPasswordInput() {
        return passwordInput;
    }

    public Services getServices() {
        return services;
    }
}
//kotlin
