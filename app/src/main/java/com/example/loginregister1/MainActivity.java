package com.example.loginregister1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        @SuppressLint("MissingInflatedId") TextView welcomeMessage = findViewById(R.id.welcomeMessage);
        welcomeMessage.setText("Welcome to the Main Activity!");
    }
}
