package com.jhzl.webviewtest

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.webkit.JavascriptInterface
import android.webkit.ValueCallback
import android.webkit.WebView
import android.widget.Button
import android.widget.Toast

class LoadAssetsActivity : AppCompatActivity() {
    private val TAG = "LoadAssetsActivity"

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_load_assets)
        val webView = findViewById<WebView>(R.id.webview)
        //加载网页
        webView.loadUrl("file:///android_asset/load_assets_index.html")
        webView.settings.javaScriptEnabled = true
        webView.addJavascriptInterface(this, "LoadAssetsActivity")
        findViewById<Button>(R.id.call_js_btn).setOnClickListener {
            Log.d(TAG, "call_js_btn")
            //调用方法
            webView.loadUrl("javascript:callJs(" + "'Android传过来的参数'" + ")");
        }


        findViewById<Button>(R.id.call_js_evaluate_btn).setOnClickListener {
            Log.d(TAG, "call_js_btn")
            //调用方法
            webView.evaluateJavascript("callJs('android')", ValueCallback {
                Toast.makeText(this, Thread.currentThread().name + "=>" + it, Toast.LENGTH_LONG)
                    .show()
            })
        }


    }

    @JavascriptInterface
    fun helloFromJs(jsParams: String) {
        Toast.makeText(this, Thread.currentThread().name + "=>" + jsParams, Toast.LENGTH_LONG)
            .show()
    }
}