package com.example.diary;

import com.example.diary.dto.Location;
import com.example.diary.dto.Restaurant;
import com.example.diary.dto.UserInfo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface constants_RestAPI {

    @GET("gettemp/{userId}")
    Call<UserInfo> getUserInfo(@Path("userId") String userId);

    @POST("posttemp/{userInfo}")
    Call<UserInfo> postUserInfo(@Path("userInfo") UserInfo userInfo);

    @GET("getzipcode/{location}")
    Call<String> getZipcode(@Path("location") String location);

    @GET("getrestaurant/{zipcode}")
    Call<Restaurant> getRestaurant(@Path("zipcode") String zipcode);

}
