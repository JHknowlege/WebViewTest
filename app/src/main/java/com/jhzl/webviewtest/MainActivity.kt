package com.jhzl.webviewtest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.jhzl.webviewtest.promt_confirm_alert.PromtConfirmAlertActivity
import com.jhzl.webviewtest.proxy.JSProxyActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.test_assets_btn).setOnClickListener {
            val intent = Intent(this@MainActivity,LoadAssetsActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.test_proxy_btn).setOnClickListener {
            val intent = Intent(this@MainActivity,JSProxyActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.test_promt_btn).setOnClickListener {
            val intent = Intent(this@MainActivity,PromtConfirmAlertActivity::class.java)
            startActivity(intent)
        }

    }
}