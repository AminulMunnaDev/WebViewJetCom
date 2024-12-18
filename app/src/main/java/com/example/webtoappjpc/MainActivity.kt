package com.example.webtoappjpc

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import com.example.webtoappjpc.ui.theme.WebToAppJPCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WebToAppJPCTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    WebScreen()
                }
            }
        }
    }
}
@SuppressLint("SetJavaScriptEnabled")
@Composable
fun WebScreen() {

    AndroidView(factory =
    {
        context->
        WebView(context).apply {
            settings.javaScriptEnabled = true
            WebViewClient()
        }
    },
        update = {
            it.loadUrl("https://www.Google.com/")
        }
    )

}
