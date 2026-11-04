package com.maodou.deepsea;
import android.app.Activity;import android.os.Bundle;import android.webkit.*;import android.view.*;
public class Main extends Activity{WebView w;
protected void onCreate(Bundle b){super.onCreate(b);getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
w=new WebView(this);WebSettings s=w.getSettings();s.setJavaScriptEnabled(true);s.setDomStorageEnabled(true);s.setMediaPlaybackRequiresUserGesture(false);
w.setWebViewClient(new WebViewClient());w.loadUrl("file:///android_asset/index.html");setContentView(w);}
public void onBackPressed(){if(w.canGoBack())w.goBack();else super.onBackPressed();}}
