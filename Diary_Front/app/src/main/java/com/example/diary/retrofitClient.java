package com.example.diary;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class retrofitClient {
    private static final String BASE_URL = "http://10.0.2.2:9909/";
    private static Retrofit retrofit;

    public static constants_RestAPI getApiService(){return getInstance().create(constants_RestAPI.class);}

    private static Retrofit getInstance(){

        Retrofit.Builder builder = new Retrofit.Builder();
        builder.baseUrl( BASE_URL );
        builder.addConverterFactory( GsonConverterFactory.create() );

        retrofit = builder.build();

        return retrofit;
    }
}
