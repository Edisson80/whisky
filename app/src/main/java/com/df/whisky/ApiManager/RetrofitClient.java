package com.df.whisky.ApiManager;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
public class RetrofitClient {
    private static RetrofitClient instance = null;
    private Api miApi;
    private RetrofitClient(){
        Retrofit retrofit = new Retrofit.Builder().baseUrl(Api.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        miApi = retrofit.create(Api.class);
    }
    public static synchronized RetrofitClient getInstance(){
        if(instance == null){
            instance = new RetrofitClient();
        }
        return instance;
    }
    public Api getMiApi(){
        return miApi;
    }
}
