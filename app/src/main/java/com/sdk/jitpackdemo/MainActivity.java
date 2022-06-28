package com.sdk.jitpackdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.sdk.actionlibrary.ActionUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionUtils.actionSwitch();
    }
}