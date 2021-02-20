package com.example.diary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.JsonReader;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_member);

        AsyncTask.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    // Create URL
                    URL githubEndpoint = new URL("http://10.0.2.2:1009/Diary_Back/list/5/");

                    HttpURLConnection myConnection =
                            (HttpURLConnection) githubEndpoint.openConnection();
                    Log.v("@@", String.valueOf(githubEndpoint));
                    Log.v("@@", String.valueOf(myConnection));
                    if (myConnection.getResponseCode() == 200) {
                        Log.v("@@", "success");
                        InputStream responseBody = myConnection.getInputStream();
                        Log.v("@@", String.valueOf(responseBody));
                        InputStreamReader responseBodyReader =
                                new InputStreamReader(responseBody, "UTF-8");
                        JsonReader jsonReader = new JsonReader(responseBodyReader);

                        jsonReader.beginObject(); // Start processing the JSON object
                        while (jsonReader.hasNext()) { // Loop through all keys
                            String key = jsonReader.nextName(); // Fetch the next key
                            Log.v("@@", String.valueOf(key));
                            if (key.equals("pw")) { // Check if desired key
                                // Fetch the value as a String
                                String value = jsonReader.nextString();
                                Log.v("@@pw", value);

                            } else if (key.equals("id")) {
                                String value = jsonReader.nextString();
                                Log.v("@@id", value);
                            } else if (key.equals("location")) {
                                String value = jsonReader.nextString();
                                Log.v("@@location", value);
                            } else {
                                Log.v("@@", "failjson");
                                jsonReader.skipValue(); // Skip values of other keys
                                break; // Break out of the loop
                            }
                        }
                    } else {
                        Log.v("!!", "fail");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    Log.e("REST_API", "GET method failed: " + e.getMessage());
                    e.printStackTrace();
                }

            }
        });
    }



}