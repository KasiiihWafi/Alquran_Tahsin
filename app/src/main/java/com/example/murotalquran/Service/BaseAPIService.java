package com.example.murotalquran.Service;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface BaseAPIService {

    @GET("pray/{cityName}")
    Call<ResponseBody> getJadwalSholat(@Path("cityName") String cityName);

}
