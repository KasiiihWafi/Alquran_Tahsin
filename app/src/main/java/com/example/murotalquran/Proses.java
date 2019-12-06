package com.example.murotalquran;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Proses extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proses);

        getSupportActionBar().setTitle("Jadwal Sholat");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }
}
