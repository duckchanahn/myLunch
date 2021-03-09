package com.example.diary;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface constants_RestAPI {

    @GET("getTemp/{userId}")
    Call<userInfo> getUserInfo(@Path("userId") String userId);

    @POST("postTemp/{userId}")
    Call<userInfo> postUserInfo(@Path("userId") String userId);

}
