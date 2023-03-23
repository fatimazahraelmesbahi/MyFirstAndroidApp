package com.mehditmimi.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.mehditmimi.myapplication.models.User;

public class RegisterActivity extends AppCompatActivity {
    private EditText Name, Email, Password, Phone;
    private Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // initialize EditText and Button views
        Name = findViewById(R.id.name_input);
        Email = findViewById(R.id.email_input);
        Password = findViewById(R.id.password_input);
        Phone = findViewById(R.id.phone_input);
        btnRegister = findViewById(R.id.register_button);

        // set onClickListener for Register button
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // get user input from EditText fields
                String name = Name.getText().toString();
                String email = Email.getText().toString();
                String password = Password.getText().toString();
                int phone = Integer.parseInt(Phone.getText().toString());

                User user = new User(email, password, name, phone);

                Toast.makeText(RegisterActivity.this, "Registration successful", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
