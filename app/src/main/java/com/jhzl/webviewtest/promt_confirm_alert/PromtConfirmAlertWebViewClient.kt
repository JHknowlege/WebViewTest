package com.jhzl.webviewtest.promt_confirm_alert

import android.util.Log
import android.webkit.*

class PromtConfirmAlertWebViewClient : WebChromeClient() {
    override fun onJsAlert(
        view: WebView?,
        url: String?,
        message: String?,
        result: JsResult?
    ): Boolean {
        Log.d("PromtConfirmAlertWebViewClient","onJsAlert=>"+message.toString())
        return super.onJsAlert(view, url, message, result)
    }

    override fun onJsConfirm(
        view: WebView?,
        url: String?,
        message: String?,
        result: JsResult?
    ): Boolean {
        Log.d("PromtConfirmAlertWebViewClient","onJsConfirm=>"+message.toString())
        return super.onJsConfirm(view, url, message, result)
    }

    override fun onJsPrompt(
        view: WebView?,
        url: String?,
        message: String?,
        defaultValue: String?,
        result: JsPromptResult?
    ): Boolean {
        Log.d("PromtConfirmAlertWebViewClient","onJsPrompt=>"+message.toString())
        return super.onJsPrompt(view, url, message, defaultValue, result)
    }


}