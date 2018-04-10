package com.example.koloh.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ClassicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_classic );

        // Creating an array of classic songs called classic.
        String[] classic = new String[2];
        classic[0] = "Start Me Up";
        classic[1] = "Sweet Home Alabama";
    }
}
