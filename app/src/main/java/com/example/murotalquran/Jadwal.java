package com.example.murotalquran;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.murotalquran.Service.APIClient;
import com.example.murotalquran.Service.BaseAPIService;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;
import com.tuyenmonkey.mkloader.MKLoader;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Jadwal extends AppCompatActivity {

    TextView tvFajr, tvSyuruk, tvDzhuhur, tvAshar, tvMaghrib, tvIsya, tvTanggal, tvLocation, tvTime;
    TextView txtFajr, txtSyuruk, txtDzhuhur, txtAshar, txtMaghrib, txtIsya, nointernet;
    BaseAPIService apiService;
    ImageView ivBg, btnChange;
    MKLoader mkLoader;
    RelativeLayout relativeLayout;

    SimpleDateFormat inputParser;
    Date dateFajar, dateSyuruk, dateDzuhur, dateAshar, dateMaghrib, dateIsya;
    String fajar, syuruk, dzuhur, ashar, maghrib, isya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jadwal);

        Locale indonesia = new Locale("in", "ID");
        inputParser = new SimpleDateFormat("kk:mm");

        tvFajr = findViewById(R.id.tvFajr);
        tvTanggal = findViewById(R.id.tvCalendar);
        tvLocation = findViewById(R.id.tvLocation);
        tvSyuruk = findViewById(R.id.tvSunrise);
        tvDzhuhur = findViewById(R.id.tvDhuhr);
        tvAshar = findViewById(R.id.tvAsr);
        tvMaghrib = findViewById(R.id.tvMaghrib);
        tvIsya = findViewById(R.id.tvIsha);
        tvTime = findViewById(R.id.tvTime);
        ivBg = findViewById(R.id.ivBg);
        mkLoader = findViewById(R.id.mkmkmk);
        nointernet = findViewById(R.id.nointernet);
        relativeLayout = findViewById(R.id.layMain);

        txtFajr = findViewById(R.id.fajr);
        txtSyuruk = findViewById(R.id.sunrise);
        txtDzhuhur = findViewById(R.id.dhuhr);
        txtAshar = findViewById(R.id.asr);
        txtMaghrib = findViewById(R.id.maghrib);
        txtIsya = findViewById(R.id.isha);

        apiService = APIClient.getJadwalService();
        getJadwalSholat("Jonggol");

        getSupportActionBar().setTitle("Jadwal Sholat");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        btnChange = findViewById(R.id.btnOK);
        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final EditText etCityName = new EditText(Jadwal.this);
                AlertDialog.Builder alert = new AlertDialog.Builder(Jadwal.this);
                alert.setTitle("Nama Kota").setMessage("Masukan Nama Kota").setView(etCityName);
                alert.setPositiveButton("Ganti Kota", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        final String city = etCityName.getText().toString();
                        getJadwalSholat(city);
                    }
                });
                alert.show();
            }
        });

        showDynamisTime();

    }

    private void showDynamisTime() {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyy");
        tvTanggal.setText(simpleDateFormat.format(new Date()));

        Calendar calendar = Calendar.getInstance();
        int time = calendar.get(Calendar.HOUR_OF_DAY);
        if (time >= 4 && time <= 5) {
            tvTime.setText(getString(R.string.Fajr));
            tvFajr.setTextColor(getResources().getColor(R.color.hijauTua));
            txtFajr.setTextColor(getResources().getColor(R.color.hijauTua));
            ivBg.setImageResource(R.drawable.morning);
        } else if (time >= 5 && time <= 6) {
            tvTime.setText(getString(R.string.Sunrise));
            tvSyuruk.setTextColor(getResources().getColor(R.color.hijauTua));
            txtSyuruk.setTextColor(getResources().getColor(R.color.hijauTua));
        } else if (time >= 6 && time <= 9) {
            tvTime.setText(getString(R.string.selamatpagi));
            tvSyuruk.setTextColor(getResources().getColor(R.color.hitam));
            txtSyuruk.setTextColor(getResources().getColor(R.color.hitam));
        } else if (time >= 9 && time <= 12) {
            tvTime.setText(getString(R.string.selamatsiang));
            tvSyuruk.setTextColor(getResources().getColor(R.color.hitam));
            txtSyuruk.setTextColor(getResources().getColor(R.color.hitam));
            ivBg.setImageResource(R.drawable.afternoon);
        } else if (time >= 12 && time <= 13) {
            tvTime.setText(getString(R.string.Dhuhr));
            tvDzhuhur.setTextColor(getResources().getColor(R.color.hijauTua));
            txtDzhuhur.setTextColor(getResources().getColor(R.color.hijauTua));
            ivBg.setImageResource(R.drawable.afternoon);
        } else if (time >= 13 && time <= 15) {
            tvTime.setText(getString(R.string.selamatsiang));
            tvDzhuhur.setTextColor(getResources().getColor(R.color.hitam));
            txtDzhuhur.setTextColor(getResources().getColor(R.color.hitam));
        } else if (time >= 15 && time <= 16) {
            tvTime.setText(getString(R.string.ashar));
            tvAshar.setTextColor(getResources().getColor(R.color.hijauTua));
            txtAshar.setTextColor(getResources().getColor(R.color.hijauTua));
        } else if (time >= 16 && time <= 18) {
            tvTime.setText(getString(R.string.selamatsore));
            tvAshar.setTextColor(getResources().getColor(R.color.hitam));
            txtAshar.setTextColor(getResources().getColor(R.color.hitam));
        } else if (time >= 18 && time <= 19) {
            tvTime.setText(getString(R.string.maghrib));
            tvMaghrib.setTextColor(getResources().getColor(R.color.hijauTua));
            txtMaghrib.setTextColor(getResources().getColor(R.color.hijauTua));
            ivBg.setImageResource(R.drawable.night);
        } else if (time >= 19 && time <= 20) {
            tvTime.setText(getString(R.string.isyaa));
            tvIsya.setTextColor(getResources().getColor(R.color.hijauTua));
            txtIsya.setTextColor(getResources().getColor(R.color.hijauTua));
        } else if (time >= 20 && time <= 24) {
            tvTime.setText(getString(R.string.selamatmalam));
            tvIsya.setTextColor(getResources().getColor(R.color.hitam));
            txtIsya.setTextColor(getResources().getColor(R.color.hitam));
        }

    }

    private void getJadwalSholat(String namaKota) {
        Call<ResponseBody> requestAPI = apiService.getJadwalSholat(namaKota);
        requestAPI.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if (response.isSuccessful()) {
                    try {
                        JSONObject jsonObject = new JSONObject(response.body().string());
                        if (jsonObject.getString("status").equals("OK")) {
                            mkLoader.setVisibility(View.GONE);
                            relativeLayout.setVisibility(View.VISIBLE);
                            fajar = jsonObject.getJSONObject("data").getString("Fajr");
                            syuruk = jsonObject.getJSONObject("data").getString("Sunrise");
                            dzuhur = jsonObject.getJSONObject("data").getString("Dhuhr");
                            ashar = jsonObject.getJSONObject("data").getString("Asr");
                            maghrib = jsonObject.getJSONObject("data").getString("Maghrib");
                            isya = jsonObject.getJSONObject("data").getString("Isha");
                            String address = jsonObject.getJSONObject("location").getString("address");

                            tvFajr.setText(fajar + " AM");
                            tvSyuruk.setText(syuruk + " AM");
                            tvDzhuhur.setText(dzuhur + " AM");
                            tvAshar.setText(ashar + " PM");
                            tvMaghrib.setText(maghrib + " PM");
                            tvIsya.setText(isya + " PM");
                            tvLocation.setText(address);
                            /*compareTime();*/

                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    Toast.makeText(Jadwal.this, "Respon Gagal", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                t.printStackTrace();
                mkLoader.setVisibility(View.GONE);
                nointernet.setVisibility(View.VISIBLE);
            }
        });
    }

    /*private void compareTime() {
        Calendar calendarNow = Calendar.getInstance();
        int hour = calendarNow.get(Calendar.HOUR);
        int minute = calendarNow.get(Calendar.MINUTE);

        Date date = parseData(hour + ":" + minute);
        dateFajar = parseData(fajar);
        dateSyuruk = parseData(syuruk);
        dateDzuhur = parseData(dzuhur);
        dateAshar = parseData(ashar);
        dateMaghrib = parseData(maghrib);
        dateIsya = parseData(isya);
        if (dateDzuhur.before(date) && dateAshar.after(date)) {
            tvTime.setText("Menuggu Waktu asar");
            ivBg.setImageResource(R.drawable.morning);
        } else if (dateFajar.equals(date)) {
            tvTime.setText("Syuruk");
            tvSyuruk.setTextColor(getResources().getColor(R.color.hijauTua));
            txtSyuruk.setTextColor(getResources().getColor(R.color.hijauTua));
            tvSyuruk.setTypeface(null, Typeface.BOLD);
            txtSyuruk.setTypeface(null, Typeface.BOLD);
            ivBg.setImageResource(R.drawable.morning);
        } else if (dateSyuruk.before(date) && dateDzuhur.after(date)) {
            tvTime.setText("Menuggu Waktu Dzuhur");
            ivBg.setImageResource(R.drawable.afternoon);
        } else if (dateDzuhur.equals(date)) {
            tvTime.setText("Dzuhur");
            tvDzhuhur.setTextColor(getResources().getColor(R.color.hijauTua));
            txtDzhuhur.setTextColor(getResources().getColor(R.color.hijauTua));
            tvDzhuhur.setTypeface(null, Typeface.BOLD);
            txtDzhuhur.setTypeface(null, Typeface.BOLD);
            ivBg.setImageResource(R.drawable.afternoon);
        } else if (dateDzuhur.before(date) && dateAshar.after(date)) {
            tvTime.setText("Menuggu Waktu Ashar");
            ivBg.setImageResource(R.drawable.afternoon);
        } else if (dateAshar.equals(date)) {
            tvTime.setText("Ashar");
            tvAshar.setTextColor(getResources().getColor(R.color.hijauTua));
            txtAshar.setTextColor(getResources().getColor(R.color.hijauTua));
            tvAshar.setTypeface(null, Typeface.BOLD);
            txtAshar.setTypeface(null, Typeface.BOLD);
            ivBg.setImageResource(R.drawable.afternoon);
        } else if (dateAshar.before(date) && dateMaghrib.after(date)) {
            tvTime.setText("Menuggu Waktu Maghrib");
            ivBg.setImageResource(R.drawable.afternoon);
        } else if (dateMaghrib.equals(date)) {
            tvTime.setText("Maghrib");
            tvMaghrib.setTextColor(getResources().getColor(R.color.hijauTua));
            txtMaghrib.setTextColor(getResources().getColor(R.color.hijauTua));
            tvMaghrib.setTypeface(null, Typeface.BOLD);
            txtMaghrib.setTypeface(null, Typeface.BOLD);
            ivBg.setImageResource(R.drawable.night);
        } else if (dateMaghrib.before(date) && dateIsya.after(date)) {
            tvTime.setText("Menuggu Waktu Isya");
            ivBg.setImageResource(R.drawable.afternoon);
        } else if (dateIsya.equals(date)) {
            tvTime.setText("Isya");
            tvIsya.setTextColor(getResources().getColor(R.color.hijauTua));
            txtIsya.setTextColor(getResources().getColor(R.color.hijauTua));
            tvIsya.setTypeface(null, Typeface.BOLD);
            txtIsya.setTypeface(null, Typeface.BOLD);
            ivBg.setImageResource(R.drawable.night);
        } else if (dateIsya.before(date) && dateFajar.after(date)) {
            tvTime.setText("Menuggu Waktu Fajar");
            ivBg.setImageResource(R.drawable.night);
        } else if (dateFajar.equals(date)) {
            tvTime.setText("Fajar");
            tvFajr.setTextColor(getResources().getColor(R.color.hijauTua));
            txtFajr.setTextColor(getResources().getColor(R.color.hijauTua));
            tvFajr.setTypeface(null, Typeface.BOLD);
            txtFajr.setTypeface(null, Typeface.BOLD);
            ivBg.setImageResource(R.drawable.night);
        }
    }

    private Date parseData(String date) {
        try {
            return inputParser.parse(date);
        }catch (java.text.ParseException e) {
            return new Date(0);
        }
    }*/
}
