package com.test.library;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.test.y.SavyourPlugin;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SavyourPlugin.initData(getIntent());

        SavyourPlugin.orderPlaced();
    }
}