package com.example.echoapp.web;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.webkit.WebView;
import com.example.echoapp.R;

public class WebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        WebView myWebView = findViewById(R.id.webview);
        myWebView.loadUrl("https://www.treedom.net/it/plant-a-tree?gclid=Cj0KCQjwlMaGBhD3ARIsAPvWd6j3P80jvf6tJ-ojjJCyh9PHOIFXUdnLEsXDVwJGaVaym9R21li3-K0aAgfSEALw_wcB");

    }
}
