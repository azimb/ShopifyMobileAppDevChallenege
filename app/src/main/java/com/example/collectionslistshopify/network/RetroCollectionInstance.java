package com.example.collectionslistshopify.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroCollectionInstance {
    private static Retrofit retrofitInstance;
    private static final String BASE_URL = "https://shopicruit.myshopify.com/admin/";


    public static Retrofit getRetroCollectionInstance()
    {
        if(retrofitInstance != null) return  retrofitInstance;
        retrofitInstance = new retrofit2.Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofitInstance;
    }
}
