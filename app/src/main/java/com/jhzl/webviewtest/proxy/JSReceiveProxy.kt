package com.jhzl.webviewtest.proxy

import android.webkit.JavascriptInterface
import android.webkit.WebView
import android.widget.Toast

class JSReceiveProxy(webView: WebView) {

    val webView: WebView = webView

    @JavascriptInterface
    fun showToast(param: String) {
        Toast.makeText(webView.context,param,Toast.LENGTH_LONG).show()
    }

    @JavascriptInterface
    fun showPerson(){

    }
}