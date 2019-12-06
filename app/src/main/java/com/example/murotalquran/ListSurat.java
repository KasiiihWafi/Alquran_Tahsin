package com.example.murotalquran;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.murotalquran.Adapter.SuratAdapter;
import com.example.murotalquran.Model.ModelSurat;

import java.util.ArrayList;

public class ListSurat extends AppCompatActivity {

    private SuratAdapter suratAdapter;
    RecyclerView rvMain;
    ArrayList<ModelSurat> arrayList;
    int count = 0;
    String idSurat;
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
            "1013",
            "1014",
            "1015",
            "1016",
            "1017",
            "1018",
            "1019",
            "1020",
            "1021",
            "1022",
            "1023",
            "1024",
            "1025",
            "1026",
            "1027",
            "1028",
            "1029",
            "1030",
            "1031",
            "1032",
            "1033",
            "1034",
            "1035",
            "1036",
            "1037",
    };

    private String[] no = {"78",
            "79",
            "80",
            "81",
            "82",
            "83",
            "84",
            "85",
            "86",
            "87",
            "88",
            "89",
            "90",
            "91",
            "92",
            "93",
            "94",
            "95",
            "96",
            "97",
            "98",
            "99",
            "100",
            "101",
            "102",
            "103",
            "104",
            "105",
            "106",
            "107",
            "108",
            "109",
            "110",
            "111",
            "112",
            "113",
            "114",
    };

    private String[] judul = {"An-Naba",
            "An-Naziat",
            "Abasa",
            "At-Takwir",
            "Al-Infitar",
            "Al-Mutaffifin",
            "Al-Insiqaq",
            "Al-Buruj",
            "At-Tariq",
            "Al-A'la",
            "Al-Gasyiyah",
            "Al-Fajr",
            "Al-Balad",
            "Asy-Syams",
            "Al-Lail",
            "Ad-Duha",
            "Asy-Syarh",
            "At-Tin",
            "Al-Alaq",
            "Al-Qadr",
            "Al-Bayinah",
            "Al-Zalzalah",
            "Al-Adiyat",
            "Al-Qori'ah",
            "At-Takasur",
            "Al-Asr",
            "Al-Humazah",
            "Al-Fiil",
            "Quraisy",
            "Al-Ma'un",
            "Al-Kautsar",
            "Al-Kafirun",
            "An-Nasr",
            "Al-Masad",
            "Al-Ikhlas",
            "Al-Falaq",
            "An-Naas",
    };

    private String[] subjudul = {
            "Mekah | 40 Ayat",
            "Mekah | 46 Ayat",
            "Mekah | 42 Ayat",
            "Mekah | 29 Ayat",
            "Mekah | 19 Ayat",
            "Mekah | 36 Ayat",
            "Mekah | 25 Ayat",
            "Mekah | 22 Ayat",
            "Mekah | 17 Ayat",
            "Mekah | 19 Ayat",
            "Mekah | 26 Ayat",
            "Mekah | 30 Ayat",
            "Mekah | 20 Ayat",
            "Mekah | 15 Ayat",
            "Mekah | 21 Ayat",
            "Mekah | 11 Ayat",
            "Mekah | 8 Ayat",
            "Mekah | 8 Ayat",
            "Mekah | 19 Ayat",
            "Mekah | 5 Ayat",
            "Madinah | 8 Ayat",
            "Madinah | 8 Ayat",
            "Mekah | 11 Ayat",
            "Mekah | 11 Ayat",
            "Mekah | 8 Ayat",
            "Mekah | 3 Ayat",
            "Mekah | 9 Ayat",
            "Mekah | 5 Ayat",
            "Mekah | 4 Ayat",
            "Mekah | 7 Ayat",
            "Mekah | 3 Ayat",
            "Mekah | 6 Ayat",
            "Madinah | 3 Ayat",
            "Mekah | 5 Ayat",
            "Mekah | 4 Ayat",
            "Mekah | 5 Ayat",
            "Mekah | 6 Ayat",
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_surat);
        idSurat = getIntent().getStringExtra("KEY");
        rvMain = findViewById(R.id.rvMain);
        arrayList = new ArrayList<>();
        setDataSurat();
        getSupportActionBar().setTitle("Baca Al-Qur'an");
        rvMain.setLayoutManager(new LinearLayoutManager(this));
        rvMain.setHasFixedSize(true);
        suratAdapter = new SuratAdapter(arrayList);
        rvMain.setAdapter(suratAdapter);
        rvMain.setHasFixedSize(true);

        getSupportActionBar().setDisplayShowHomeEnabled(true);


    }

    private void setDataSurat(){
        for (String idsurat : id){
            arrayList.add(new ModelSurat(idsurat, no[count], judul[count], subjudul[count]));
            count++;
        }
    }
}
