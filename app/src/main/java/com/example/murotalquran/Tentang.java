package com.example.murotalquran;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Tentang extends AppCompatActivity {

    ImageView ivHubungi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);

        getSupportActionBar().setTitle("Tentang Aplikasi");

        getSupportActionBar().setDisplayShowHomeEnabled(true);


    }

    public void pembuat(View view) {
        startActivity(new Intent(Tentang.this, TentangPembuat.class));
    }
}
