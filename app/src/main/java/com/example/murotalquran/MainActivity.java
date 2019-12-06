package com.example.murotalquran;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    CardView btnBaca, btnAdab, btnTahsin, btnJadwal, btnTentang;
    CarouselView carouselView;
    ImageView imageView;
    TextView textView;
    private int[] mImages = new int[] {
            R.drawable.quote1,
            R.drawable.quote2,
            R.drawable.quote3,
            R.drawable.quote5,
            R.drawable.decacat
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBaca = findViewById(R.id.card1);
        btnTahsin = findViewById(R.id.card2);
        btnAdab = findViewById(R.id.card3);
        btnJadwal = findViewById(R.id.card4);
        btnTentang = findViewById(R.id.card5);
        textView = findViewById(R.id.tvCalendar);
        imageView = findViewById(R.id.ivBackground);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE, dd MMM yyy");
        textView.setText(simpleDateFormat.format(new Date()));
        showTime();

        carouselView = findViewById(R.id.carouselMain);
        carouselView.setPageCount(mImages.length);
        carouselView.setImageListener(new ImageListener() {
            @Override
            public void setImageForPosition(int position, ImageView imageView) {
                imageView.setImageResource(mImages[position]);
            }
        });

        btnBaca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ListSurat.class);
                startActivity(intent);
            }
        });

        btnAdab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Adab.class);
                startActivity(intent);
            }
        });

        btnTahsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Tahsin.class);
                startActivity(intent);
            }
        });

        btnTentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Tentang.class);
                startActivity(intent);
            }
        });

        btnJadwal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Jadwal.class);
                startActivity(intent);
            }
        });
    }

    private void showTime(){

        Calendar calendar = Calendar.getInstance();
        int time = calendar.get(Calendar.HOUR_OF_DAY);
        if (time >= 0 && time <= 5) {
            imageView.setImageResource(R.drawable.night);
        } else if (time >= 5 && time <= 10) {
            imageView.setImageResource(R.drawable.morning);
        } else if (time >= 10 && time <= 18) {
            imageView.setImageResource(R.drawable.afternoon);
        } else if (time >= 18 && time <= 24) {
            imageView.setImageResource(R.drawable.night);
        }
    }
}
