package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Second_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        findViewById(R.id.red_btn).setOnClickListener(view ->
                finishAffinity());
    }
}