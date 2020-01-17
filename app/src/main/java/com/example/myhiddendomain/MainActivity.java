package com.example.myhiddendomain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Base64;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    static {
        System.loadLibrary("keys");
    }
    public native String getFacebookApiKey();
    public native String getBaseApi();
    public native String getBaseUrl();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String facebookApiKey= new String(Base64.decode(getFacebookApiKey(),Base64.DEFAULT));
        Log.d("TAG",facebookApiKey);
        String baseApi = new String(Base64.decode(getBaseApi(), Base64.DEFAULT));
        Log.d("TAG",baseApi);
        String baseUrl = new String(Base64.decode(getBaseUrl(), Base64.DEFAULT));
        Log.d("TAG",baseUrl);
    }
}
