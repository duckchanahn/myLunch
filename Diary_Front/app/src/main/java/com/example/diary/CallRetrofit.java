package com.example.diary;

import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CallRetrofit {
    public boolean callUserInfo(String id){
        boolean isRight = false;

        //Retrofit 호출
        userInfo userInfo = new userInfo(id);
        Call<userInfo> call = retrofitClient.getApiService().getUserInfo(id);
        call.enqueue(new Callback<userInfo>() {
            @Override
            public void onResponse(Call<userInfo> call, Response<userInfo> response) {
                if(!response.isSuccessful()){
                    Log.e("연결이 비정상적 : ", "error code : " + response.code());
                    return;
                }
                userInfo userInfo_response = response.body();
                Log.d("연결이 성공적 : ", response.body().toString());

            }
            @Override
            public void onFailure(Call<userInfo> call, Throwable t) {
                Log.e("연결실패", t.getMessage());
            }
        });

        return isRight;
    }
}