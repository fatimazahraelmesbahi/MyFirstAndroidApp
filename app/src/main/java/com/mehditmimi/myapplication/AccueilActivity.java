package com.mehditmimi.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import java.security.PrivateKey;

public class AccueilActivity extends AppCompatActivity {
    private TextView textView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);
        textView = findViewById(R.id.hello);
        finish();
    }
}
//put extra et getExtra