package com.example.rcljava_test_app;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    static {
        Log.i("[RCLJava]", "loading chatter library");
        System.loadLibrary("rcljava_chatter_connections");
    }

    public native void subscribe_from_chatter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.subscribe_from_chatter();
    }
}