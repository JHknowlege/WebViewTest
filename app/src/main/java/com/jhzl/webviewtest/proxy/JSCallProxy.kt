package com.jhzl.webviewtest.proxy

import android.annotation.SuppressLint
import android.webkit.JavascriptInterface
import android.webkit.ValueCallback
import android.webkit.WebView

class JSCallProxy {
    private var webview: WebView? = null

    @SuppressLint("SetJavaScriptEnabled")
    constructor(webView: WebView) {
        this.webview = webView
    }

    fun callJs(callback: ValueCallback<String>) {
        this.webview?.evaluateJavascript("callJs('android')",callback)
    }
}