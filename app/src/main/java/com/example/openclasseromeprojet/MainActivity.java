package com.example.openclasseromeprojet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {


    private EditText mEditTe1;
    private EditText mEditTe2;
    private Button mBut1;
    private EditText mName;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mEditTe1 = findViewById(R.id.main_editTe1);
        mEditTe2 = findViewById(R.id.main_editTe2);
        mBut1 = findViewById(R.id.main_but1);
        mBut1.setEnabled(false);
        mName = findViewById(R.id.main_name);


        mEditTe1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s1) {
                mBut1.setEnabled(!s1.toString().isEmpty());

            }
        });

        mEditTe2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s2) {
                mBut1.setEnabled(!s2.toString().isEmpty());

            }
        });

        mBut1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = mEditTe1.getText().toString();
                String passWord = mEditTe2.getText().toString();
                String name = mName.getText().toString();


                if (email.equals("admin@admin.com") && passWord.equals("admin")){
                    Intent welcomeActivityIntent = new Intent(MainActivity.this, WelcomeActivity.class);
                    welcomeActivityIntent.putExtra("Name",name);
                    startActivity(welcomeActivityIntent);
                }else {
                    Toast.makeText(MainActivity.this, "Email ou Mot de Passe Invalide", Toast.LENGTH_LONG).show();
                }



                }

        });
    }








}