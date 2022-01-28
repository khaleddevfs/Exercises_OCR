package com.example.openclasseromeprojet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);


        Intent intent = getIntent();
        String name = intent.getStringExtra("Name");

        TextView nameResult = findViewById(R.id.main_nameResult);

        nameResult.setText("welcome " + name);
    }



}