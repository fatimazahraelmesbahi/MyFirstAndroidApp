package com.mehditmimi.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.mehditmimi.myapplication.models.User;

import java.security.PrivateKey;

public class AccueilActivity extends AppCompatActivity {
    private TextView textView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);
        textView = findViewById(R.id.hello);
        Intent intent = getIntent();
        textView.setText(intent.getStringExtra("name"));
        finish();
    }
}
//put extra et getExtra