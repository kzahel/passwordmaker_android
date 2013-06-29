package org.graehl.passwordmaker;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends Activity {

    @SuppressLint("SetJavaScriptEnabled")
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        WebView mywebview = (WebView) findViewById(R.id.web_engine);
        mywebview.loadUrl("file:///android_asset/passwordmaker/index.html");
        WebSettings sett = mywebview.getSettings();
        sett.setJavaScriptEnabled(true);
        sett.setSupportZoom(true);
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
