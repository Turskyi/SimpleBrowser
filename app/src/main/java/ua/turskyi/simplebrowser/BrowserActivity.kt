package ua.turskyi.simplebrowser

import android.net.Uri
import android.os.Bundle
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_browser.*

class BrowserActivity : AppCompatActivity(R.layout.activity_browser) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        webView.webViewClient = WebViewClient()
        val data: Uri? = intent.data
        webView.loadUrl(data.toString())
    }
}