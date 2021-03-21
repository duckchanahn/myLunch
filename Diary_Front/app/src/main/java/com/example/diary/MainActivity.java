package com.example.diary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.diary.dto.Restaurant;
import com.example.diary.dto.Location;

import java.io.IOException;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private CallRetrofit callRetrofit;
    private Restaurant restaurant;
    private GpsTracker gpsTracker;
    private Geocoder geocoder;

    private Button button_readLocation;
    private TextView textView_resultRestaurant;
    private TextView textView_userLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        this.callRetrofit = new CallRetrofit();
        this.geocoder = new Geocoder(this) ;

        this.button_readLocation = findViewById(R.id.readLocation);
        this.textView_resultRestaurant = findViewById(R.id.resultRestaurant);
        this.textView_userLocation = findViewById(R.id.textview_userLocation);

        this.applyPermission();

        this.button_readLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                gpsTracker = new GpsTracker(MainActivity.this);
                double latitude = gpsTracker.getLatitude(); // 위도
                double longitude = gpsTracker.getLongitude(); //경도
                String address = "";

                try {
                    List<Address> location = geocoder.getFromLocation(latitude, longitude, 1);
                    if(!location.isEmpty())
                    {

                        address = location.get(0).getAddressLine(0).toString(); // 국가명 시 군 구 동 번지
                        textView_userLocation.setText(address);

                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    Log.e("test", "입출력 오류 - 서버에서 주소변환시 에러발생");
                }
                address = "대한민국 서울특별서 서대문구 남가좌2동 318-2";
                restaurant = callRetrofit.callGetRestaurant(address);
                textView_resultRestaurant.setText(restaurant.toString());
            }
        });


    }

    private void applyPermission() {
        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED
                && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            //권한이 없을 경우 최초 권한 요청 또는 사용자에 의한 재요청 확인
            if (ActivityCompat.shouldShowRequestPermissionRationale(this, android.Manifest.permission.ACCESS_FINE_LOCATION) &&
                    ActivityCompat.shouldShowRequestPermissionRationale(this, android.Manifest.permission.ACCESS_COARSE_LOCATION)) {
                // 권한 재요청
                ActivityCompat.requestPermissions(this, new String[]{android.Manifest.permission.ACCESS_FINE_LOCATION, android.Manifest.permission.ACCESS_COARSE_LOCATION}, 100);
                return;
            } else {
                ActivityCompat.requestPermissions(this, new String[]{android.Manifest.permission.ACCESS_FINE_LOCATION, android.Manifest.permission.ACCESS_COARSE_LOCATION}, 100);
                return;
            }
        }
    }
}