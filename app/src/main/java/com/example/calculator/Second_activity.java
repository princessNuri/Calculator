package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Second_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView textView = findViewById(R.id.text_policy);
        String text2 =getIntent().getStringExtra("key1");
        textView.setText(text2);
        findViewById(R.id.red_btn).setOnClickListener(view ->
                finishAffinity());
    }
}