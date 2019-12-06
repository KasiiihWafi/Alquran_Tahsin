package com.example.murotalquran.Service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIClient {

    public static Retrofit getJadwal(){
        return new Retrofit.Builder()
                .baseUrl("https://time.siswadi.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static BaseAPIService getJadwalService(){
        return getJadwal().create(BaseAPIService.class);
    }
}
