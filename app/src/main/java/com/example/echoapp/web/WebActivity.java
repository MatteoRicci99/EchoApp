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
        myWebView.loadUrl("https://www.treedom.net/it/plant-a-tree?gclid=CjwKCAjwn6GGBhADEiwAruUcKiWg3_TJPjZmMa9hySj_1iNj455tchOpbNoUZFk_2-CqOBNMnlv6HRoC5RcQAvD_BwE");

    }
}
