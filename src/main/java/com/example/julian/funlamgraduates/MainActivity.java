package com.example.julian.funlamgraduates;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String URL = "http://funlamgraduate.azurewebsites.net/";
        WebView myView = (WebView) findViewById(R.id.viewWeb);
        myView.getSettings().setJavaScriptEnabled(true);
        myView.loadUrl(URL);
        myView.setWebViewClient(new WebViewClient());
    }
}
