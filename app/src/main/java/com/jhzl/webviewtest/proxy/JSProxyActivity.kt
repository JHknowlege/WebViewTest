package com.jhzl.webviewtest.proxy

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.webkit.JavascriptInterface
import android.webkit.ValueCallback
import android.webkit.WebView
import android.widget.Button
import android.widget.Toast
import com.jhzl.webviewtest.R

class JSProxyActivity : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_j_s_bridge_assets)
        val webView = findViewById<WebView>(R.id.webview)
        webView.loadUrl("file:android_asset/proxy_assets_index.html")
        webView.settings.javaScriptEnabled = true
        val jsCallProxy = JSCallProxy(webView)
        findViewById<Button>(R.id.call_js_btn).setOnClickListener {
            jsCallProxy.callJs {
                runOnUiThread {
                    Log.d("JSProxyActivity","${it}")
                    Toast.makeText(
                        this@JSProxyActivity,
                        Thread.currentThread().name + "  =>" + it,
                        Toast.LENGTH_LONG
                    ).show()
                }

            }
        }
    }


}