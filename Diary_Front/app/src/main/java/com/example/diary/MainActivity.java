package com.example.diary;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    private CallRetrofit callRetrofit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_member);

        callRetrofit = new CallRetrofit();
        callRetrofit.callUserInfo("www");
        callRetrofit.callPostUserInfo("rrrr");

    }
}