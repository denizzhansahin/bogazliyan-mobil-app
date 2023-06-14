package com.bogazliyan.myapplication2

import android.net.http.SslError
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.SslErrorHandler
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity53 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main53)


        val webView = findViewById<WebView>(R.id.web_view_sponsor)
        webView.settings.javaScriptEnabled = true
        webView.settings.loadsImagesAutomatically = true

        webView.webViewClient = object : WebViewClient() {
            override fun onReceivedSslError(view: WebView?, handler: SslErrorHandler?, error: SslError?) {
                handler?.proceed() // SSL hatasını görmezden gel
            }
        }

        webView.clearCache(true)
        webView.loadUrl("https://sites.google.com/view/bogazliyanmobil66/sponsor")


    }
}