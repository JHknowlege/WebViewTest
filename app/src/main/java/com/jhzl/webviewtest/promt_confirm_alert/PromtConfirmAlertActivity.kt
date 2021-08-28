package com.jhzl.webviewtest.promt_confirm_alert

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button
import com.jhzl.webviewtest.R

class PromtConfirmAlertActivity : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_promt_confirm_alert)
        val webView = findViewById<WebView>(R.id.webview)
        webView.loadUrl("file:///android_asset/promt_confirm_alert_assets_index.html")
        webView.settings.javaScriptEnabled = true
        webView.webChromeClient = PromtConfirmAlertWebViewClient()
    }
}