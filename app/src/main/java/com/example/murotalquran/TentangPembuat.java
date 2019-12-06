package com.example.murotalquran;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TentangPembuat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang_pembuat);
        getSupportActionBar().setTitle("Hubungi Kami");

        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }
}
