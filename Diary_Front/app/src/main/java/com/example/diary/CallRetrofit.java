package com.example.diary;

import android.util.Log;
import android.widget.TextView;

import com.example.diary.dto.Location;
import com.example.diary.dto.Restaurant;
import com.example.diary.dto.UserInfo;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CallRetrofit {

    private Restaurant restaurant;

    public Restaurant callGetRestaurant(String location, TextView textView_resultRestaurant) { // 주소를 우편번호로 바꾸는 함수

        restaurant = new Restaurant();

        Call<Restaurant> call = retrofitClient.getApiService().getRestaurant_zipcode(location);
        call.enqueue(new Callback<Restaurant>() {
            @Override
            public void onResponse(Call<Restaurant> call, Response<Restaurant> response) {if(!response.isSuccessful()){Log.e("연결이 비정상적 : ", "error code : " + response.code());return;}
                restaurant = response.body();
                Log.d("연결이 성공적 : ", response.body().toString());
                Log.d("연결후레스토랑정보", restaurant.toString());
                textView_resultRestaurant.setText(restaurant.toString());
            }
            @Override public void onFailure(Call<Restaurant> call, Throwable t) {Log.e("연결실패", t.getMessage());}
        });
        return restaurant;
    }



//    public boolean callPostUserInfo(String id){
//
//        UserInfo userInfo = new UserInfo();
//        userInfo.setId("qwq");
//        userInfo.setPw("qeq");
//
//        Call<UserInfo> call_post = retrofitClient.getApiService().postUserInfo(userInfo);
//        call_post.enqueue(new Callback<UserInfo>() {
//            @Override
//            public void onResponse(Call<UserInfo> call_post, Response<UserInfo> response) {
//                if(!response.isSuccessful()){
//                    Log.e("post 연결이 비정상적 : ", "error code : " + response.code());
//                    return;
//                }
//                UserInfo userInfo_response = response.body();
//                Log.d("post 연결이 성공적 : ", response.body().toString());
//
//            }
//            @Override
//            public void onFailure(Call<UserInfo> call_post, Throwable t) {
//                Log.e("post 연결실패", t.getMessage());
//            }
//        });
//
//        return true;
//
//    }
}