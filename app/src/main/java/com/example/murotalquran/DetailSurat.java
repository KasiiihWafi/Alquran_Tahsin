package com.example.murotalquran;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.example.murotalquran.Adapter.AyatAdapter;
import com.example.murotalquran.Model.ModelAyat;

import java.util.ArrayList;

import static com.example.murotalquran.Ayat.AyatAbasa.ArabAbasa;
import static com.example.murotalquran.Ayat.AyatAbasa.ArtiAbasa;
import static com.example.murotalquran.Ayat.AyatAbasa.IdAbasa;
import static com.example.murotalquran.Ayat.AyatAbasa.LatinAbasa;
import static com.example.murotalquran.Ayat.AyatAbasa.NoAbasa;
import static com.example.murotalquran.Ayat.AyatAdDuha.ArabAdDuha;
import static com.example.murotalquran.Ayat.AyatAdDuha.ArtiAdDuha;
import static com.example.murotalquran.Ayat.AyatAdDuha.IdAdDuha;
import static com.example.murotalquran.Ayat.AyatAdDuha.LatinAdDuha;
import static com.example.murotalquran.Ayat.AyatAdDuha.NoAdDuha;
import static com.example.murotalquran.Ayat.AyatAlAdiyat.ArabAlAdiyat;
import static com.example.murotalquran.Ayat.AyatAlAdiyat.ArtiAlAdiyat;
import static com.example.murotalquran.Ayat.AyatAlAdiyat.IdAlAdiyat;
import static com.example.murotalquran.Ayat.AyatAlAdiyat.LatinAlAdiyat;
import static com.example.murotalquran.Ayat.AyatAlAdiyat.NoAlAdiyat;
import static com.example.murotalquran.Ayat.AyatAlAla.ArabAlAla;
import static com.example.murotalquran.Ayat.AyatAlAla.ArtiAlAla;
import static com.example.murotalquran.Ayat.AyatAlAla.IdAlAla;
import static com.example.murotalquran.Ayat.AyatAlAla.LatinAlAla;
import static com.example.murotalquran.Ayat.AyatAlAla.NoAlAla;
import static com.example.murotalquran.Ayat.AyatAlAlaq.ArabAlAlaq;
import static com.example.murotalquran.Ayat.AyatAlAlaq.ArtiAlAlaq;
import static com.example.murotalquran.Ayat.AyatAlAlaq.IdAlAlaq;
import static com.example.murotalquran.Ayat.AyatAlAlaq.LatinAlAlaq;
import static com.example.murotalquran.Ayat.AyatAlAlaq.NoAlAlaq;
import static com.example.murotalquran.Ayat.AyatAlAsr.ArabAlAsr;
import static com.example.murotalquran.Ayat.AyatAlAsr.ArtiAlAsr;
import static com.example.murotalquran.Ayat.AyatAlAsr.IdAlAsr;
import static com.example.murotalquran.Ayat.AyatAlAsr.LatinAlAsr;
import static com.example.murotalquran.Ayat.AyatAlAsr.NoAlAsr;
import static com.example.murotalquran.Ayat.AyatAlBalad.ArabAlBalad;
import static com.example.murotalquran.Ayat.AyatAlBalad.ArtiAlBalad;
import static com.example.murotalquran.Ayat.AyatAlBalad.IdAlBalad;
import static com.example.murotalquran.Ayat.AyatAlBalad.LatinAlBalad;
import static com.example.murotalquran.Ayat.AyatAlBalad.NoAlBalad;
import static com.example.murotalquran.Ayat.AyatAlBayyinah.ArabAlBayyinah;
import static com.example.murotalquran.Ayat.AyatAlBayyinah.ArtiAlBayyinah;
import static com.example.murotalquran.Ayat.AyatAlBayyinah.IdAlBayyinah;
import static com.example.murotalquran.Ayat.AyatAlBayyinah.LatinAlBayyinah;
import static com.example.murotalquran.Ayat.AyatAlBayyinah.NoAlBayyinah;
import static com.example.murotalquran.Ayat.AyatAlBuruj.ArabAlBuruj;
import static com.example.murotalquran.Ayat.AyatAlBuruj.ArtiAlBuruj;
import static com.example.murotalquran.Ayat.AyatAlBuruj.IdAlBuruj;
import static com.example.murotalquran.Ayat.AyatAlBuruj.LatinAlBuruj;
import static com.example.murotalquran.Ayat.AyatAlBuruj.NoAlBuruj;
import static com.example.murotalquran.Ayat.AyatAlFajr.ArabAlFajr;
import static com.example.murotalquran.Ayat.AyatAlFajr.ArtiAlFajr;
import static com.example.murotalquran.Ayat.AyatAlFajr.IdAlFajr;
import static com.example.murotalquran.Ayat.AyatAlFajr.LatinAlFajr;
import static com.example.murotalquran.Ayat.AyatAlFajr.NoAlFajr;
import static com.example.murotalquran.Ayat.AyatAlFalaq.ArabAlFalaq;
import static com.example.murotalquran.Ayat.AyatAlFalaq.ArtiAlFalaq;
import static com.example.murotalquran.Ayat.AyatAlFalaq.IdAlFalaq;
import static com.example.murotalquran.Ayat.AyatAlFalaq.LatinAlFalaq;
import static com.example.murotalquran.Ayat.AyatAlFalaq.NoAlFalaq;
import static com.example.murotalquran.Ayat.AyatAlFiil.ArabAlFiil;
import static com.example.murotalquran.Ayat.AyatAlFiil.ArtiAlFiil;
import static com.example.murotalquran.Ayat.AyatAlFiil.IdAlFiil;
import static com.example.murotalquran.Ayat.AyatAlFiil.LatinAlFiil;
import static com.example.murotalquran.Ayat.AyatAlFiil.NoAlFiil;
import static com.example.murotalquran.Ayat.AyatAlGhasyiyah.ArabAlGhasyiyah;
import static com.example.murotalquran.Ayat.AyatAlGhasyiyah.ArtiAlGhasyiyah;
import static com.example.murotalquran.Ayat.AyatAlGhasyiyah.IdAlGhasyiyah;
import static com.example.murotalquran.Ayat.AyatAlGhasyiyah.LatinAlGhasyiyah;
import static com.example.murotalquran.Ayat.AyatAlGhasyiyah.NoAlGhasyiyah;
import static com.example.murotalquran.Ayat.AyatAlHumazah.ArabAlHumazah;
import static com.example.murotalquran.Ayat.AyatAlHumazah.ArtiAlHumazah;
import static com.example.murotalquran.Ayat.AyatAlHumazah.IdAlHumazah;
import static com.example.murotalquran.Ayat.AyatAlHumazah.LatinAlHumazah;
import static com.example.murotalquran.Ayat.AyatAlHumazah.NoAlHumazah;
import static com.example.murotalquran.Ayat.AyatAlIkhlas.ArabAlIkhlas;
import static com.example.murotalquran.Ayat.AyatAlIkhlas.ArtiAlIkhlas;
import static com.example.murotalquran.Ayat.AyatAlIkhlas.IdAlIkhlas;
import static com.example.murotalquran.Ayat.AyatAlIkhlas.LatinAlIkhlas;
import static com.example.murotalquran.Ayat.AyatAlIkhlas.NoAlIkhlas;
import static com.example.murotalquran.Ayat.AyatAlInfitar.ArabAlInfitar;
import static com.example.murotalquran.Ayat.AyatAlInfitar.ArtiAlInfitar;
import static com.example.murotalquran.Ayat.AyatAlInfitar.IdAlInfitar;
import static com.example.murotalquran.Ayat.AyatAlInfitar.LatinAlInfitar;
import static com.example.murotalquran.Ayat.AyatAlInfitar.NoAlInfitar;
import static com.example.murotalquran.Ayat.AyatAlInsyiqaq.ArabAlInsyiqaq;
import static com.example.murotalquran.Ayat.AyatAlInsyiqaq.ArtiAlInsyiqaq;
import static com.example.murotalquran.Ayat.AyatAlInsyiqaq.IdAlInsyiqaq;
import static com.example.murotalquran.Ayat.AyatAlInsyiqaq.LatinAlInsyiqaq;
import static com.example.murotalquran.Ayat.AyatAlInsyiqaq.NoAlInsyiqaq;
import static com.example.murotalquran.Ayat.AyatAlKafirun.ArabAlKafirun;
import static com.example.murotalquran.Ayat.AyatAlKafirun.ArtiAlKafirun;
import static com.example.murotalquran.Ayat.AyatAlKafirun.IdAlKafirun;
import static com.example.murotalquran.Ayat.AyatAlKafirun.LatinAlKafirun;
import static com.example.murotalquran.Ayat.AyatAlKafirun.NoAlKafirun;
import static com.example.murotalquran.Ayat.AyatAlKautsar.ArabAlKautsar;
import static com.example.murotalquran.Ayat.AyatAlKautsar.ArtiAlKautsar;
import static com.example.murotalquran.Ayat.AyatAlKautsar.IdAlKautsar;
import static com.example.murotalquran.Ayat.AyatAlKautsar.LatinAlKautsar;
import static com.example.murotalquran.Ayat.AyatAlKautsar.NoAlKautsar;
import static com.example.murotalquran.Ayat.AyatAlLail.ArabAlLail;
import static com.example.murotalquran.Ayat.AyatAlLail.ArtiAlLail;
import static com.example.murotalquran.Ayat.AyatAlLail.IdAlLail;
import static com.example.murotalquran.Ayat.AyatAlLail.LatinAlLail;
import static com.example.murotalquran.Ayat.AyatAlLail.NoAlLail;
import static com.example.murotalquran.Ayat.AyatAlMasad.ArabAlMasad;
import static com.example.murotalquran.Ayat.AyatAlMasad.ArtiAlMasad;
import static com.example.murotalquran.Ayat.AyatAlMasad.IdAlMasad;
import static com.example.murotalquran.Ayat.AyatAlMasad.LatinAlMasad;
import static com.example.murotalquran.Ayat.AyatAlMasad.NoAlMasad;
import static com.example.murotalquran.Ayat.AyatAlMaun.ArabAlMaun;
import static com.example.murotalquran.Ayat.AyatAlMaun.ArtiAlMaun;
import static com.example.murotalquran.Ayat.AyatAlMaun.IdAlMaun;
import static com.example.murotalquran.Ayat.AyatAlMaun.LatinAlMaun;
import static com.example.murotalquran.Ayat.AyatAlMaun.NoAlMaun;
import static com.example.murotalquran.Ayat.AyatAlMutaffifin.ArabAlMutaffifin;
import static com.example.murotalquran.Ayat.AyatAlMutaffifin.ArtiAlMutaffifin;
import static com.example.murotalquran.Ayat.AyatAlMutaffifin.IdAlMutaffifin;
import static com.example.murotalquran.Ayat.AyatAlMutaffifin.LatinAlMutaffifin;
import static com.example.murotalquran.Ayat.AyatAlMutaffifin.NoAlMutaffifin;
import static com.example.murotalquran.Ayat.AyatAlQadr.ArabAlQadr;
import static com.example.murotalquran.Ayat.AyatAlQadr.ArtiAlQadr;
import static com.example.murotalquran.Ayat.AyatAlQadr.IdAlQadr;
import static com.example.murotalquran.Ayat.AyatAlQadr.LatinAlQadr;
import static com.example.murotalquran.Ayat.AyatAlQadr.NoAlQadr;
import static com.example.murotalquran.Ayat.AyatAlQariah.ArabAlQariah;
import static com.example.murotalquran.Ayat.AyatAlQariah.ArtiAlQariah;
import static com.example.murotalquran.Ayat.AyatAlQariah.IdAlQariah;
import static com.example.murotalquran.Ayat.AyatAlQariah.LatinAlQariah;
import static com.example.murotalquran.Ayat.AyatAlQariah.NoAlQariah;
import static com.example.murotalquran.Ayat.AyatAlZalzalah.ArabAlZalzalah;
import static com.example.murotalquran.Ayat.AyatAlZalzalah.ArtiAlZalzalah;
import static com.example.murotalquran.Ayat.AyatAlZalzalah.IdAlZalzalah;
import static com.example.murotalquran.Ayat.AyatAlZalzalah.LatinAlZalzalah;
import static com.example.murotalquran.Ayat.AyatAlZalzalah.NoAlZalzalah;
import static com.example.murotalquran.Ayat.AyatAnNaba.ArabAnNaba;
import static com.example.murotalquran.Ayat.AyatAnNaba.ArtiAnNaba;
import static com.example.murotalquran.Ayat.AyatAnNaba.IdAnNaba;
import static com.example.murotalquran.Ayat.AyatAnNaba.LatinAnNaba;
import static com.example.murotalquran.Ayat.AyatAnNaba.NoAnNaba;
import static com.example.murotalquran.Ayat.AyatAnNas.ArabAnNas;
import static com.example.murotalquran.Ayat.AyatAnNas.ArtiAnNas;
import static com.example.murotalquran.Ayat.AyatAnNas.IdAnNas;
import static com.example.murotalquran.Ayat.AyatAnNas.LatinAnNas;
import static com.example.murotalquran.Ayat.AyatAnNas.NoAnNas;
import static com.example.murotalquran.Ayat.AyatAnNasr.ArabAnNasr;
import static com.example.murotalquran.Ayat.AyatAnNasr.ArtiAnNasr;
import static com.example.murotalquran.Ayat.AyatAnNasr.IdAnNasr;
import static com.example.murotalquran.Ayat.AyatAnNasr.LatinAnNasr;
import static com.example.murotalquran.Ayat.AyatAnNasr.NoAnNasr;
import static com.example.murotalquran.Ayat.AyatAnNaziat.ArabAnNaziat;
import static com.example.murotalquran.Ayat.AyatAnNaziat.ArtiAnNaziat;
import static com.example.murotalquran.Ayat.AyatAnNaziat.IdAnNaziat;
import static com.example.murotalquran.Ayat.AyatAnNaziat.LatinAnNaziat;
import static com.example.murotalquran.Ayat.AyatAnNaziat.NoAnNaziat;
import static com.example.murotalquran.Ayat.AyatAsySyams.ArabAsySyams;
import static com.example.murotalquran.Ayat.AyatAsySyams.ArtiAsySyams;
import static com.example.murotalquran.Ayat.AyatAsySyams.IdAsySyams;
import static com.example.murotalquran.Ayat.AyatAsySyams.LatinAsySyams;
import static com.example.murotalquran.Ayat.AyatAsySyams.NoAsySyams;
import static com.example.murotalquran.Ayat.AyatAsySyarh.ArabAsySyarh;
import static com.example.murotalquran.Ayat.AyatAsySyarh.ArtiAsySyarh;
import static com.example.murotalquran.Ayat.AyatAsySyarh.IdAsySyarh;
import static com.example.murotalquran.Ayat.AyatAsySyarh.LatinAsySyarh;
import static com.example.murotalquran.Ayat.AyatAsySyarh.NoAsySyarh;
import static com.example.murotalquran.Ayat.AyatAtTakasur.ArabAtTakasur;
import static com.example.murotalquran.Ayat.AyatAtTakasur.ArtiAtTakasur;
import static com.example.murotalquran.Ayat.AyatAtTakasur.IdAtTakasur;
import static com.example.murotalquran.Ayat.AyatAtTakasur.LatinAtTakasur;
import static com.example.murotalquran.Ayat.AyatAtTakasur.NoAtTakasur;
import static com.example.murotalquran.Ayat.AyatAtTakwir.ArabAtTakwir;
import static com.example.murotalquran.Ayat.AyatAtTakwir.ArtiAtTakwir;
import static com.example.murotalquran.Ayat.AyatAtTakwir.IdAtTakwir;
import static com.example.murotalquran.Ayat.AyatAtTakwir.LatinAtTakwir;
import static com.example.murotalquran.Ayat.AyatAtTakwir.NoAtTakwir;
import static com.example.murotalquran.Ayat.AyatAtTariq.ArabAtTariq;
import static com.example.murotalquran.Ayat.AyatAtTariq.ArtiAtTariq;
import static com.example.murotalquran.Ayat.AyatAtTariq.IdAtTariq;
import static com.example.murotalquran.Ayat.AyatAtTariq.LatinAtTariq;
import static com.example.murotalquran.Ayat.AyatAtTariq.NoAtTariq;
import static com.example.murotalquran.Ayat.AyatAtTin.ArabAtTin;
import static com.example.murotalquran.Ayat.AyatAtTin.ArtiAtTin;
import static com.example.murotalquran.Ayat.AyatAtTin.IdAtTin;
import static com.example.murotalquran.Ayat.AyatAtTin.LatinAtTin;
import static com.example.murotalquran.Ayat.AyatAtTin.NoAtTin;
import static com.example.murotalquran.Ayat.AyatQuraisy.ArabQuraisy;
import static com.example.murotalquran.Ayat.AyatQuraisy.ArtiQuraisy;
import static com.example.murotalquran.Ayat.AyatQuraisy.IdQuraisy;
import static com.example.murotalquran.Ayat.AyatQuraisy.LatinQuraisy;
import static com.example.murotalquran.Ayat.AyatQuraisy.NoQuraisy;

public class DetailSurat extends AppCompatActivity {

    public static final String KEY_SURAT = "KEY";
    private AyatAdapter ayatAdapter;
    RecyclerView rvMainayat;
    TextView tvPengertian, tvTurun, tvJumlahAyat;
    ArrayList<ModelAyat> arrayList;
    int count = 0;
    String idAyat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_surat);
        idAyat = getIntent().getStringExtra("KEY");
        tvPengertian = findViewById(R.id.pengertian);
        tvTurun = findViewById(R.id.turunnya);
        tvJumlahAyat = findViewById(R.id.jumlahayat);
        rvMainayat = findViewById(R.id.rvMainayat);
        arrayList = new ArrayList<>();
        if (idAyat.equals("1001")){
            setDataAnNaba();
            getSupportActionBar().setTitle("An-Naba");
            tvTurun.setText("Mekah");
            tvPengertian.setText("Berita Besar");
            tvJumlahAyat.setText("40 Ayat");
        }
        else if(idAyat.equals("1002")) {
            setDataAnNaziat();
            getSupportActionBar().setTitle("An-Naziat");
            tvTurun.setText("Mekah");
            tvPengertian.setText("Malaikat Yang Mencabut");
            tvJumlahAyat.setText("46 Ayat");
        }
        else if(idAyat.equals("1003")) {
            setDataAbasa();
            getSupportActionBar().setTitle("Abasa");
            tvTurun.setText("Mekah");
            tvPengertian.setText("Bermuka Masam");
            tvJumlahAyat.setText("42 Ayat");
        }
        else if(idAyat.equals("1004")) {
            setDataAtTakwir();
            getSupportActionBar().setTitle("At-Takwir");
            tvTurun.setText("Mekah");
            tvPengertian.setText("Menggulung");
            tvJumlahAyat.setText("29 Ayat");
        }
        else if(idAyat.equals("1005")) {
            setDataAlInfitar();
            getSupportActionBar().setTitle("Al-Infitar");
            tvTurun.setText("Mekah");
            tvPengertian.setText("Terbelah");
            tvJumlahAyat.setText("19 Ayat");
        }
        else if(idAyat.equals("1006")) {
            setDataAlMutaffifin();
            getSupportActionBar().setTitle("Al-Mutaffifin");
            tvTurun.setText("Mekah");
            tvPengertian.setText("Orang-Orang Yang Curang");
            tvJumlahAyat.setText("36 Ayat");
        }
        else if(idAyat.equals("1007")) {
            setDataAlinsyiqaq();
            getSupportActionBar().setTitle("Al-Insyiqaq");
            tvTurun.setText("Mekah");
            tvPengertian.setText("Terbelah");
            tvJumlahAyat.setText("25 Ayat");
        }
        else if(idAyat.equals("1008")) {
            setDataAlBuruj();
            getSupportActionBar().setTitle("Al-Buruj");
            tvTurun.setText("Mekah");
            tvPengertian.setText("Gugusan Bintang");
            tvJumlahAyat.setText("22 Ayat");
        }
        else if(idAyat.equals("1009")) {
            setDataAtTariq();
            getSupportActionBar().setTitle("At-Tariq");
            tvTurun.setText("Mekah");
            tvPengertian.setText("Yang Datang Di Malam Hari");
            tvJumlahAyat.setText("17 Ayat");
        }
        else if(idAyat.equals("1010")) {
            setDataAlAla();
            getSupportActionBar().setTitle("Al-Ala");
            tvTurun.setText("Mekah");
            tvPengertian.setText("Yang Paling Tinggi");
            tvJumlahAyat.setText("19 Ayat");
        }
        else if(idAyat.equals("1011")) {
            setDataAlGasiyah();
            getSupportActionBar().setTitle("Al-Ghasyiyah");
            tvTurun.setText("Mekah");
            tvPengertian.setText("Hari Pembalasan");
            tvJumlahAyat.setText("26 Ayat");
        }
        else if(idAyat.equals("1012")) {
            setDataAlFajr();
            getSupportActionBar().setTitle("Al-Fajr");
            tvTurun.setText("Mekah");
            tvPengertian.setText("Fajar");
            tvJumlahAyat.setText("30 Ayat");
        }
        else if(idAyat.equals("1013")) {
            setDataAlBalad();
            getSupportActionBar().setTitle("Al-Balad");
            tvTurun.setText("Mekah");
            tvPengertian.setText("Negeri");
            tvJumlahAyat.setText("20 Ayat");
        }
        else if(idAyat.equals("1014")) {
            setDataAsySyams();
            getSupportActionBar().setTitle("Asy-Syams");
            tvTurun.setText("Mekah");
            tvPengertian.setText("Matahari");
            tvJumlahAyat.setText("15 Ayat");
        }
        else if(idAyat.equals("1015")) {
            setDataAlLail();
            getSupportActionBar().setTitle("Al-Lail");
            tvTurun.setText("Mekah");
            tvPengertian.setText("Malam");
            tvJumlahAyat.setText("21 Ayat");
        }
        else if(idAyat.equals("1016")) {
            setDataAdDuha();
            getSupportActionBar().setTitle("Ad-Duha");
            tvTurun.setText("Mekah");
            tvPengertian.setText("Waktu Duha");
            tvJumlahAyat.setText("11 Ayat");
        }
        else if(idAyat.equals("1017")) {
            setDataAsySyarh();
            getSupportActionBar().setTitle("Asy-Syarh");
            tvTurun.setText("Mekah");
            tvPengertian.setText("Kelapangan");
            tvJumlahAyat.setText("8 Ayat");
        }
        else if(idAyat.equals("1018")) {
            setDataAtTin();
            getSupportActionBar().setTitle("At-Tin");
            tvTurun.setText("Mekah");
            tvPengertian.setText("Buah Tin");
            tvJumlahAyat.setText("8 Ayat");
        }
        else if(idAyat.equals("1019")) {
            setDataAlAlaq();
            getSupportActionBar().setTitle("Al-Alaq");
            tvTurun.setText("Mekah");
            tvPengertian.setText("Segumpal Darah");
            tvJumlahAyat.setText("19 Ayat");
        }
        else if(idAyat.equals("1020")) {
            setDataAlQadr();
            getSupportActionBar().setTitle("Al-Qadr");
            tvTurun.setText("Mekah");
            tvPengertian.setText("Kemuliaan");
            tvJumlahAyat.setText("5 Ayat");
        }
        else if(idAyat.equals("1021")) {
            setDataAlBayyinah();
            getSupportActionBar().setTitle("Al-Bayyinah");
            tvTurun.setText("Madinah");
            tvPengertian.setText("Bukti Yang Nyata");
            tvJumlahAyat.setText("8 Ayat");
        }
        else if(idAyat.equals("1022")) {
            setDataAlZalzalah();
            getSupportActionBar().setTitle("Al-Zalzalah");
            tvTurun.setText("Madinah");
            tvPengertian.setText("Keguncangan");
            tvJumlahAyat.setText("8 Ayat");
        }
        else if(idAyat.equals("1023")) {
            setDataAlAdiyat();
            getSupportActionBar().setTitle("Al-Adiyat");
            tvTurun.setText("Mekah");
            tvPengertian.setText("Kuda Perang Yang Berlari Kencang");
            tvJumlahAyat.setText("11 Ayat");
        }
        else if(idAyat.equals("1024")) {
            setDataAlQariah();
            getSupportActionBar().setTitle("Al-Qariah");
            tvTurun.setText("Mekah");
            tvPengertian.setText("Hari Kiamat");
            tvJumlahAyat.setText("11 Ayat");
        }
        else if(idAyat.equals("1025")) {
            setDataAtTakasur();
            getSupportActionBar().setTitle("AT-Takasur");
            tvTurun.setText("Mekah");
            tvPengertian.setText("Bermegah-Megahan");
            tvJumlahAyat.setText("8 Ayat");
        }
        else if(idAyat.equals("1026")) {
            setDataAlAsr();
            getSupportActionBar().setTitle("Al-Asr");
            tvTurun.setText("Mekah");
            tvPengertian.setText("Masa");
            tvJumlahAyat.setText("3 Ayat");
        }
        else if(idAyat.equals("1027")) {
            setDataAlHumazah();
            getSupportActionBar().setTitle("Al-Humazah");
            tvTurun.setText("Mekah");
            tvPengertian.setText("Pengumpat");
            tvJumlahAyat.setText("9 Ayat");
        }
        else if(idAyat.equals("1028")) {
            setDataAlFiil();
            getSupportActionBar().setTitle("Al-Fiil");
            tvTurun.setText("Mekah");
            tvPengertian.setText("Gajah");
            tvJumlahAyat.setText("5 Ayat");
        }
        else if(idAyat.equals("1029")) {
            setDataQuraisy();
            getSupportActionBar().setTitle("Quraisy");
            tvTurun.setText("Mekah");
            tvPengertian.setText("Suku Quraisy");
            tvJumlahAyat.setText("4 Ayat");
        }
        else if(idAyat.equals("1030")) {
            setDataAlMaun();
            getSupportActionBar().setTitle("Al-Maun");
            tvTurun.setText("Mekah");
            tvPengertian.setText("Barang-Barang Yang Berguna");
            tvJumlahAyat.setText("7 Ayat");
        }
        else if(idAyat.equals("1031")) {
            setDataAlKautsar();
            getSupportActionBar().setTitle("Al-Kautsar");
            tvTurun.setText("Mekah");
            tvPengertian.setText("Nikmat Yang Banyak");
            tvJumlahAyat.setText("3 Ayat");
        }
        else if(idAyat.equals("1032")) {
            setDataAlKafirun();
            getSupportActionBar().setTitle("Al-Kafirun");
            tvTurun.setText("Mekah");
            tvPengertian.setText("Orang-Orang Kafir");
            tvJumlahAyat.setText("6 Ayat");
        }
        else if(idAyat.equals("1033")) {
            setDataAnNasr();
            getSupportActionBar().setTitle("An-Nasr");
            tvTurun.setText("Madinah");
            tvPengertian.setText("Pertolongan");
            tvJumlahAyat.setText("3 Ayat");
        }
        else if(idAyat.equals("1034")) {
            setDataAlMasad();
            getSupportActionBar().setTitle("Al-Masad");
            tvTurun.setText("Mekah");
            tvPengertian.setText("Gejolak Api");
            tvJumlahAyat.setText("5 Ayat");
        }
        else if(idAyat.equals("1035")) {
            setDataAlIkhlas();
            getSupportActionBar().setTitle("Al-Ikhlas");
            tvTurun.setText("Mekah");
            tvPengertian.setText("Kemurnian Keesaan Allah");
            tvJumlahAyat.setText("4 Ayat");
        }
        else if(idAyat.equals("1036")) {
            setDataAlFalaq();
            getSupportActionBar().setTitle("Al-Falaq");
            tvTurun.setText("Mekah");
            tvPengertian.setText("Waktu Shubuh");
            tvJumlahAyat.setText("5 Ayat");
        }
        else if(idAyat.equals("1037")) {
            setDataAnNas();
            getSupportActionBar().setTitle("An-Nas");
            tvTurun.setText("Mekah");
            tvPengertian.setText("Manusia");
            tvJumlahAyat.setText("6 Ayat");
        }
        rvMainayat.setLayoutManager(new LinearLayoutManager(this));
        rvMainayat.setHasFixedSize(true);
        ayatAdapter = new AyatAdapter(arrayList);
        rvMainayat.setAdapter(ayatAdapter);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    private void setDataAnNaba(){
        for (String idayat : IdAnNaba){
            arrayList.add(new ModelAyat(idayat, NoAnNaba[count], ArabAnNaba[count], LatinAnNaba[count], ArtiAnNaba[count]));
            count++;
        }
    }

    private void setDataAnNaziat(){
        for (String idayat : IdAnNaziat){
            arrayList.add(new ModelAyat(idayat, NoAnNaziat[count], ArabAnNaziat[count], LatinAnNaziat[count], ArtiAnNaziat[count]));
            count++;
        }
    }

    private void setDataAbasa(){
        for (String idayat : IdAbasa){
            arrayList.add(new ModelAyat(idayat, NoAbasa[count], ArabAbasa[count], LatinAbasa[count], ArtiAbasa[count]));
            count++;
        }
    }

    private void setDataAtTakwir(){
        for (String idayat : IdAtTakwir){
            arrayList.add(new ModelAyat(idayat, NoAtTakwir[count], ArabAtTakwir[count], LatinAtTakwir[count], ArtiAtTakwir[count]));
            count++;
        }
    }

    private void setDataAlInfitar(){
        for (String idayat : IdAlInfitar){
            arrayList.add(new ModelAyat(idayat, NoAlInfitar[count], ArabAlInfitar[count], LatinAlInfitar[count], ArtiAlInfitar[count]));
            count++;
        }
    }

    private void setDataAlMutaffifin(){
        for (String idayat : IdAlMutaffifin){
            arrayList.add(new ModelAyat(idayat, NoAlMutaffifin[count], ArabAlMutaffifin[count], LatinAlMutaffifin[count], ArtiAlMutaffifin[count]));
            count++;
        }
    }

    private void setDataAlinsyiqaq(){
        for (String idayat : IdAlInsyiqaq){
            arrayList.add(new ModelAyat(idayat, NoAlInsyiqaq[count], ArabAlInsyiqaq[count], LatinAlInsyiqaq[count], ArtiAlInsyiqaq[count]));
            count++;
        }
    }

    private void setDataAlBuruj(){
        for (String idayat : IdAlBuruj){
            arrayList.add(new ModelAyat(idayat, NoAlBuruj[count], ArabAlBuruj[count], LatinAlBuruj[count], ArtiAlBuruj[count]));
            count++;
        }
    }
    private void setDataAtTariq(){
        for (String idayat : IdAtTariq){
            arrayList.add(new ModelAyat(idayat, NoAtTariq[count], ArabAtTariq[count], LatinAtTariq[count], ArtiAtTariq[count]));
            count++;
        }
    }
    private void setDataAlAla(){
        for (String idayat : IdAlAla){
            arrayList.add(new ModelAyat(idayat, NoAlAla[count], ArabAlAla[count], LatinAlAla[count], ArtiAlAla[count]));
            count++;
        }
    }

    private void setDataAlGasiyah(){
        for (String idayat : IdAlGhasyiyah){
            arrayList.add(new ModelAyat(idayat, NoAlGhasyiyah[count], ArabAlGhasyiyah[count], LatinAlGhasyiyah[count], ArtiAlGhasyiyah[count]));
            count++;
        }
    }

    private void setDataAlFajr(){
        for (String idayat : IdAlFajr){
            arrayList.add(new ModelAyat(idayat, NoAlFajr[count], ArabAlFajr[count], LatinAlFajr[count], ArtiAlFajr[count]));
            count++;
        }
    }

    private void setDataAlBalad(){
        for (String idayat : IdAlBalad){
            arrayList.add(new ModelAyat(idayat, NoAlBalad[count], ArabAlBalad[count], LatinAlBalad[count], ArtiAlBalad[count]));
            count++;
        }
    }

    private void setDataAsySyams(){
        for (String idayat : IdAsySyams){
            arrayList.add(new ModelAyat(idayat, NoAsySyams[count], ArabAsySyams[count], LatinAsySyams[count], ArtiAsySyams[count]));
            count++;
        }
    }

    private void setDataAlLail(){
        for (String idayat : IdAlLail){
            arrayList.add(new ModelAyat(idayat, NoAlLail[count], ArabAlLail[count], LatinAlLail[count], ArtiAlLail[count]));
            count++;
        }
    }

    private void setDataAdDuha(){
        for (String idayat : IdAdDuha){
            arrayList.add(new ModelAyat(idayat, NoAdDuha[count], ArabAdDuha[count], LatinAdDuha[count], ArtiAdDuha[count]));
            count++;
        }
    }

    private void setDataAsySyarh(){
        for (String idayat : IdAsySyarh){
            arrayList.add(new ModelAyat(idayat, NoAsySyarh[count], ArabAsySyarh[count], LatinAsySyarh[count], ArtiAsySyarh[count]));
            count++;
        }
    }

    private void setDataAtTin(){
        for (String idayat : IdAtTin){
            arrayList.add(new ModelAyat(idayat, NoAtTin[count], ArabAtTin[count], LatinAtTin[count], ArtiAtTin[count]));
            count++;
        }
    }

    private void setDataAlAlaq(){
        for (String idayat : IdAlAlaq){
            arrayList.add(new ModelAyat(idayat, NoAlAlaq[count], ArabAlAlaq[count], LatinAlAlaq[count], ArtiAlAlaq[count]));
            count++;
        }
    }

    private void setDataAlQadr(){
        for (String idayat : IdAlQadr){
            arrayList.add(new ModelAyat(idayat, NoAlQadr[count], ArabAlQadr[count], LatinAlQadr[count], ArtiAlQadr[count]));
            count++;
        }
    }

    private void setDataAlBayyinah(){
        for (String idayat : IdAlBayyinah){
            arrayList.add(new ModelAyat(idayat, NoAlBayyinah[count], ArabAlBayyinah[count], LatinAlBayyinah[count], ArtiAlBayyinah[count]));
            count++;
        }
    }

    private void setDataAlZalzalah(){
        for (String idayat : IdAlZalzalah){
            arrayList.add(new ModelAyat(idayat, NoAlZalzalah[count], ArabAlZalzalah[count], LatinAlZalzalah[count], ArtiAlZalzalah[count]));
            count++;
        }
    }

    private void setDataAlAdiyat(){
        for (String idayat : IdAlAdiyat){
            arrayList.add(new ModelAyat(idayat, NoAlAdiyat[count], ArabAlAdiyat[count], LatinAlAdiyat[count], ArtiAlAdiyat[count]));
            count++;
        }
    }

    private void setDataAlQariah(){
        for (String idayat : IdAlQariah){
            arrayList.add(new ModelAyat(idayat, NoAlQariah[count], ArabAlQariah[count], LatinAlQariah[count], ArtiAlQariah[count]));
            count++;
        }
    }

    private void setDataAtTakasur(){
        for (String idayat : IdAtTakasur){
            arrayList.add(new ModelAyat(idayat, NoAtTakasur[count], ArabAtTakasur[count], LatinAtTakasur[count], ArtiAtTakasur[count]));
            count++;
        }
    }

    private void setDataAlAsr(){
        for (String idayat : IdAlAsr){
            arrayList.add(new ModelAyat(idayat, NoAlAsr[count], ArabAlAsr[count], LatinAlAsr[count], ArtiAlAsr[count]));
            count++;
        }
    }

    private void setDataAlHumazah(){
        for (String idayat : IdAlHumazah){
            arrayList.add(new ModelAyat(idayat, NoAlHumazah[count], ArabAlHumazah[count], LatinAlHumazah[count], ArtiAlHumazah[count]));
            count++;
        }
    }

    private void setDataAlFiil(){
        for (String idayat : IdAlFiil){
            arrayList.add(new ModelAyat(idayat, NoAlFiil[count], ArabAlFiil[count], LatinAlFiil[count], ArtiAlFiil[count]));
            count++;
        }
    }

    private void setDataQuraisy(){
        for (String idayat : IdQuraisy){
            arrayList.add(new ModelAyat(idayat, NoQuraisy[count], ArabQuraisy[count], LatinQuraisy[count], ArtiQuraisy[count]));
            count++;
        }
    }

    private void setDataAlMaun(){
        for (String idayat : IdAlMaun){
            arrayList.add(new ModelAyat(idayat, NoAlMaun[count], ArabAlMaun[count], LatinAlMaun[count], ArtiAlMaun[count]));
            count++;
        }
    }

    private void setDataAlKautsar(){
        for (String idayat : IdAlKautsar){
            arrayList.add(new ModelAyat(idayat, NoAlKautsar[count], ArabAlKautsar[count], LatinAlKautsar[count], ArtiAlKautsar[count]));
            count++;
        }
    }

    private void setDataAlKafirun(){
        for (String idayat : IdAlKafirun){
            arrayList.add(new ModelAyat(idayat, NoAlKafirun[count], ArabAlKafirun[count], LatinAlKafirun[count], ArtiAlKafirun[count]));
            count++;
        }
    }

    private void setDataAnNasr(){
        for (String idayat : IdAnNasr){
            arrayList.add(new ModelAyat(idayat, NoAnNasr[count], ArabAnNasr[count], LatinAnNasr[count], ArtiAnNasr[count]));
            count++;
        }
    }

    private void setDataAlMasad(){
        for (String idayat : IdAlMasad){
            arrayList.add(new ModelAyat(idayat, NoAlMasad[count], ArabAlMasad[count], LatinAlMasad[count], ArtiAlMasad[count]));
            count++;
        }
    }

    private void setDataAlIkhlas(){
        for (String idayat : IdAlIkhlas){
            arrayList.add(new ModelAyat(idayat, NoAlIkhlas[count], ArabAlIkhlas[count], LatinAlIkhlas[count], ArtiAlIkhlas[count]));
            count++;
        }
    }

    private void setDataAlFalaq(){
        for (String idayat : IdAlFalaq){
            arrayList.add(new ModelAyat(idayat, NoAlFalaq[count], ArabAlFalaq[count], LatinAlFalaq[count], ArtiAlFalaq[count]));
            count++;
        }
    }

    private void setDataAnNas(){
        for (String idayat : IdAnNas){
            arrayList.add(new ModelAyat(idayat, NoAnNas[count], ArabAnNas[count], LatinAnNas[count], ArtiAnNas[count]));
            count++;
        }
    }

}
