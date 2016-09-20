package com.keepy.saver;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.github.lzyzsd.circleprogress.CircleProgress;

import jonas.tool.saveForOffline.R;


public class tumblrView extends AppCompatActivity {

    WebView web;
    CircleProgress cp;


    @Override
    public void onBackPressed() {



        super.onBackPressed();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_PROGRESS);

        setContentView(R.layout.activity_yahoo_view);
        cp= (CircleProgress) findViewById(R.id.circle_progress);
        getWindow().setFeatureInt(Window.FEATURE_PROGRESS, Window.PROGRESS_VISIBILITY_ON);
        web = (WebView) findViewById(R.id.web);
        web.getSettings().setBuiltInZoomControls(true);

        if (web != null) {
            web.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);

            web.isPrivateBrowsingEnabled();
        }

        web.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        if (Build.VERSION.SDK_INT >= 19) {
            web.setLayerType(View.LAYER_TYPE_HARDWARE, null);
        }
        else {
            web.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
        }
        web.setWebChromeClient(new WebChromeClient() {


            @Override
            public void onProgressChanged(WebView view, final int newProgress) {


                cp.setProgress(99);


                super.onProgressChanged(view, newProgress);
                if (newProgress == 100) {
                    cp.setFinishedColor(Color.parseColor("#fe9700"));
                    cp.setVisibility(View.INVISIBLE);
                }


                }
            }

            );

            web.getSettings().

            setUseWideViewPort(true);

            web.getSettings().

            setLoadWithOverviewMode(true);

            web.getSettings().

            setDomStorageEnabled(true);

            web.getSettings().

            setLoadsImagesAutomatically(true);

            web.loadUrl("https://www.tumblr.com/login");


            WebSettings webSettings = web.getSettings();
            webSettings.setJavaScriptEnabled(true);
            web.setHorizontalScrollBarEnabled(true);
            web.setWebViewClient(new

                                         WebViewClient() {


                                             @Override
                                             public void onPageStarted(WebView view, String url, Bitmap favicon) {

                                                 cp.setProgress(90);

                                                 cp.setVisibility(View.VISIBLE);
                                                 super.onPageStarted(view, url, favicon);
                                             }

                                             @Override
                                             public void onPageFinished(WebView view, String url) {
                                                 cp.setVisibility(View.INVISIBLE);

                                                 super.onPageFinished(view, url);
                                             }
                                         }

            );

        }
    }

