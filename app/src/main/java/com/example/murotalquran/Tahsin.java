package com.example.murotalquran;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.murotalquran.Adapter.TahsinAdapter;
import com.example.murotalquran.Model.ModelTahsin;

import java.util.ArrayList;

public class Tahsin extends AppCompatActivity {

    private TahsinAdapter tahsinAdapter;
    RecyclerView rvTahsin;
    ArrayList<ModelTahsin> arrayList;
    int count = 0;
    String idTahsin;
    private String[] id = {"1001",
            "1002",
            "1003",
            "1004",
            "1005",
            "1006",
            "1007",
            "1008",
            "1009",
            "1010",
            "1011",
            "1012",
    };


    private String[] materi = {"1. Huruf Hijaiyyah",
            "2. Makhraj Huruf",
            "3. Makhraj Umum",
            "4. Makhraj Khusus",
            "5. Makhraj Al-Jauf",
            "6. Makhraj Al-Halq",
            "7. Bagian-Bagian Lidah",
            "8. Bagian-Bagian Langit-Langit Mulut",
            "9. Makhraj Lidah",
            "10. Makhraj Asy-Syafatain",
            "11. Makhraj Al-Khaisyum",
            "12. Shifat-shifat huruf",
    };

    private String[] isi = {"ء ب ت ث ج ح خ د ذ ر ز س ش ص ض ط ظ ع غ ف ق ك ل م ن و ه لا ي\n\n" +
            "Hal-hal penting yang harus diketahui tentang huruf Hijaiyyah : \n\n" +
            "1. Huruf Hijaiyyah jumlahnya 29 \n\n" +
            "2. Huruf pertama adalha hamzah bukan alif \n\n" +
            "3. Huruf alif adalah huruf sebelum akhir," +
            "yaitu yang bersambung dengan huruf(لا)." +
            "Hal itu karena alif adalah huruf yang senantiasa sukun," +
            "dan tidak bisa dibunyikan tanpa didahului oleh huruf lain." +
            "Dipilihnya huruf Laam dalam hal ini karena ia adalah huruf yang sering menyertai Alif",

            "Makhraj huruf yaitu tempat keluar huruf hijaiyyah berupa alat ucap," +
                    " seperti dua bibir, lisan dan lainnya",

            "Al-Jauf (Rongga Tenggorokan \n\n" +
                    "2. Al-Halq (Tenggorokan)\n\n" +
                    "3. Al-Lisan (Lidah)\n\n" +
                    "4. Asy-Syafatain (Kedua Bibir)\n\n" +
                    "5. Al-Khaisyum (Rongga Hidung)",

            "Pada setiap makhraj umum terdapat makhraj-makhraj khusus, yaitu makhraj kecil yang darinya keluar satu, dua , atau tiga huruf. Makhraj Khusus jumlahnya tujuh belas",

            "Al-Jauf adalah rongga yang terdapat dalam tenggorokan dan mulut dan berakhir di udara \n\n" +
                    "Pada Al-Jauf terdapat satu makhraj khusus \n\n" +
                    "Darinya keluar tiga huruf mad, yaitu : \n\n" +
                    "1. Alif Madiyyah atau aa panjang (ىَا), yaitu alif yang senantiasa sukun dan tidak didahului kecuali oleh fathah \n\n" +
                    "2. Wawu Madiyyah atau uu panjang (ىُو), yaitu wawu sukun yang didahului dhammah \n\n" +
                    "3. Yaa' Madiyyah atau ii panjang (ىِي), yaitu yaa' sukun yang didahului kasrah",

            "Pada tenggorokan terdapat tiga makhraj khusus, masing-masing memiliki dua huruf, yaitu : \n\n" +
                    "1. Tenggorokan bagian bawah (pita suara)\n" +
                    "Dari keluar dua huruf yaitu : (أ ، ه) \n\n" +
                    "2. Tenggorokan bagian tengah \n" +
                    "Darinya keluar dua huruf yaitu : ( ح ، ع) \n\n" +
                    "3. Tenggorokan bagian atas \n" +
                    "Darinya keluar dua huruf yaitu : (غ ، خ)",

            "Sebelum membahas makhraj-makhraj dan huruf-huruf lidah kita harus memahami bagian-bagian lidah dan langit-langit mulut terlebih dahulu \n\n" +
                    "Bagian-bagian lidah yaitu : \n\n" +
                    "1. Pangkal lidah \n" +
                    "2. Tengah lidah \n" +
                    "3. Tepi lidah samping \n" +
                    "4. Tepi lidah depan \n" +
                    "5. Ujung lidah \n" +
                    "6. Lelancip lidah \n",

            "Bagian-bagian langit-langit mulut yaitu : \n" +
                    "1. Gusi \n" +
                    "2. Langit-langit depan \n" +
                    "3. Langit-langit keras \n" +
                    "4. Langit-langit lunak \n" +
                    "5. Tekak",

            "Pada lidah terdapat 10 Makhraj khusus dan dari sepuluh makhraj ini keluar 18 huruf : \n\n" +
                    "1. Pangkal lidah dengan langit-langit lunak diatasnya (ق) \n\n" +
                    "2. Pangkal lidah dengan langit-langit lunak dan keras diatasnya (ك) \n\n" +
                    "3. Tengah lidah dengan langit-langit diatasnya (ج ، ش ، ي) \n\n" +
                    "4. Tepi lidah samping dengan gigi geraham diatasnya (ض) \n\n" +
                    "5. Tepi lidah depan dengan gusi diatasnya (ل) \n\n" +
                    "6. Ujung lidah dengan gusi diatasnya (ن) \n\n" +
                    "7. Ujung lidah dengan gusi diatasnya sedikit lebih di atas makhraj nun (ر) \n\n" +
                    "8. Ujung lidah dengan tempat tumbuhnya gigi seri atas (ط ، د ، ت) \n\n" +
                    "9. Pucuk lidah dengan bagian bawah dari dinding gigi seri bawah dan suara keluar dari atasnya (ص ، س ، ز) \n\n" +
                    "10. Ujung lidah dengan ujung dua gigi seri atas (ظ ، ذ ، ث)",

                    "Pada dua bibir terdapat dua makhraj : \n\n" +
                            "1. Makhraj huruf (ف). Yaitu : bagian dalam bibir bawah dengan ujung dua gigi seri atas \n\n" +
                            "2. Makhraj huruf (و ، ب ، م). Yaitu : dua bibir. \n\n" +
                            "huruf (و) : dengan memonyongkan dua bibir sehingga membentuk seperti lingkaran disertai dengan naikna pangkal lidah \n\n" +
                            "huruf (ب) : dengan mengatupkan dua bibir \n\n" +
                            "huruf (م) : dengan mengatupkan dua bibir disertai dengan dengug dari rongga hidung",

                    "Rongga hidung adalah satu makhraj untuk Ghunnah \n\n" +
                            "Ghunnah yaitu suara dengung yang dimiliki oleh huruf (م ، ن)",

                    "Shifat-shifat huruf adalah suatau pembahasan mengenai cara mengucapkan huruf-huruf hijaiyyah dari makhraj-nya. Shifat-shifat huruf ada dua kelompok : \n\n" +
                            "A. Sifat-sifat yang memiliki lawan \n\n" +
                            "1. Di tinjau dari sisi mengalirnya huruf : Syiddah >< Rakhawah dan Tawasuth \n\n" +
                            "a. Syiddah : tertahannya aliran huruf\n" +
                            "contoh huruf : أخِدُ قَطٍ بَكَتْ \n\n" +
                            "b. Rakhawah : Mengalirnya huruf\n" +
                            "contoh hurufnya : (Selain huruf syiddah dan tawasuth) \n\n" +
                            "c. Tawasuth : Mengalirnya huruf dengan aliran yang tidak sempurna\n" +
                            "contoh hurufnya : لِنْ عُمَرُ  \n\n" +
                            "2. Di tinjau dari sisi mengalirnya huruf : Hams >< Jahr \n\n" +
                            "a. Hams :  Samarnya suara karena pita suara terbuka dan tidak bergetar\n" +
                            "contoh hurufnya : فَحَثَّهُ شَخْصٌ سَكَتَ  \n\n" +
                            "a. Jahr : Jelasnya suara karena pita suara merapat dan bergetar\n" +
                            "contoh hurufnya : (Selain huruf hams) \n\n" +
                            "3. Ditinjau dari sisi arah suara huruf : Isti'laa >< Istifaal \n\n" +
                            "a. Isti'laa : naiknya suara ke langit mulut\n" +
                            "contoh huruf : خُصَّ ضَغْتٍ قِظْ \n\n" +
                            "b. Istifaal : turunnya suara kearah dasar mulut\n" +
                            "contoh huruf : (Selain huruf isti'laa) \n\n" +
                            "4. Di tinjau dari sisi menggumpalnya huruf : Ithbaaq >< Istilaa \n\n" +
                            "a. Ithbaaq : Menggumpalnya suara diantara lidah dan langit-langit mulut\n" +
                            "contoh hurufnya : ص ض ط ظ \n\n" +
                            "b. Infitaah : Tidak menggumpalnya suara diantara lidah dan langit-langit mulut\n" +
                            "contoh hurufnya: (Selain huruf Ithbaaq) \n\n" +
                            "B. Sifat-sifat yang Tidak memiliki lawan \n\n" +
                            "1. Qolqolah : Membunyikan huruf-huruf qalqalah dengan memantul\n" +
                            "contoh hurufnya : ب ج د ط ق \n\n" +
                            "2. Tafassyi : menyebarnya suara huruf syiin di dalam mulut\n" +
                            "contoh hurufnya : ش \n\n" +
                            "3. Liin : Keluarnya huruf dengan mudah\n" +
                            "contoh hurufnya : يْ وْ \n\n" +
                            "4. Istithalaah : bergersernya lidah dari belakang ke depan \n" +
                            "contoh hurufnya : ض \n\n" +
                            "5. Inhiraaf : Membeloknya suara karena terhalang oleh lidah\n" +
                            "contoh hurufnya : ل، ر \n\n" +
                            "6. Takriir : Bergetarnya ujung lidah saat mengucapkan huruf raa'\n" +
                            "contoh hurufnya : ر \n\n" +
                            "7. Shafiir Suara yang tajam saat mengucapkan huruf\n" +
                            "contoh hurufnya : ص س ز \n\n" +
                            "8. Ghunnah : Suara dengung yang keluar dari rongga hidung\n" +
                            "contoh hurufnya : م ن ",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tahsin);
        idTahsin = getIntent().getStringExtra("KEY");
        rvTahsin = findViewById(R.id.rvTahsin);
        arrayList = new ArrayList<>();
        setDataTahsin();
        getSupportActionBar().setTitle("Belajar Tahsin");
        rvTahsin.setLayoutManager(new LinearLayoutManager(this));
        rvTahsin.setHasFixedSize(true);
        tahsinAdapter = new TahsinAdapter(arrayList);
        rvTahsin.setAdapter(tahsinAdapter);

        getSupportActionBar().setDisplayShowHomeEnabled(true);


    }

    private void setDataTahsin(){
        for (String idTahsin : id) {
            arrayList.add(new ModelTahsin(idTahsin, materi[count], isi[count]));
            count++;
        }
    }
}
