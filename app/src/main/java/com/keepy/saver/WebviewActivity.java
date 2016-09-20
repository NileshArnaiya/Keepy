package com.keepy.saver;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import jonas.tool.saveForOffline.R;


public class WebviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Configuration config = getResources().getConfiguration();
                if (config.smallestScreenWidthDp > 120 && config.smallestScreenWidthDp < 160) {


                    setContentView(R.layout.activity_webview);


                } else if (config.smallestScreenWidthDp > 160) {


                    setContentView(R.layout.evenwebview);

                }



            }
        });





    }

    public void google(View view) {
        Intent intent = new Intent(WebviewActivity.this,googleview.class);
        startActivity(intent);


    }

    public void facebook(View view) {

        Intent intent = new Intent(WebviewActivity.this,facebookview.class);
        startActivity(intent);



    }

    public void twitter(View view) {
        Intent intent = new Intent(WebviewActivity.this,TwitterView.class);
        startActivity(intent);
    }

    public void linkedin(View view) {
        Intent intent = new Intent(WebviewActivity.this,quoraView.class);
        startActivity(intent);




    }

    public void microsoft(View view) {
        Intent intent = new Intent(WebviewActivity.this,tumblrView.class);
        startActivity(intent);


    }

    public void pinterest(View view) {
        Intent intent = new Intent(WebviewActivity.this,pinterestView.class);
        startActivity(intent);


    }

    public void reddit(View view) {
        Intent intent = new Intent(WebviewActivity.this,redditView.class);
        startActivity(intent);
    }

    public void instagram(View view) {
        Intent intent = new Intent(WebviewActivity.this,instagramView.class);
        startActivity(intent);
    }
}
