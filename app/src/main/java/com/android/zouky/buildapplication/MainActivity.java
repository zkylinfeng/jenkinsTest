package com.android.zouky.buildapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.tv);

        textView.setText("hello world!");
        textView.setText("hello world!    欢迎来到！");
        textView.setText("hello world!");
        textView.setText("hello world!");
        textView.setText("hello world!");
    }
}
