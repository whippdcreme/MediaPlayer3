package com.example.mediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity10 extends AppCompatActivity {
    private WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        webview=(WebView) findViewById(R.id.webview1);
        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl("https://www.gaana.com");
        WebSettings webSettings =webview.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
    @Override
    public void onBackPressed(){
        if (webview.canGoBack()){
            webview.goBack();
        }else{
            super.onBackPressed();
        }
    }
}