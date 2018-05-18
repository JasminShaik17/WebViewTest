package cubex.mahesh.webviewtest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    var  et1:EditText? = null
    var  wview:WebView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        et1 = findViewById(R.id.et1)
        wview = findViewById(R.id.wview)
        wview?.webViewClient= WebViewClient()
    }
    fun load(v:View)
    {
        when(v.id){
            R.id.search -> wview?.loadUrl(et1?.text.toString())
            R.id.google -> wview?.loadUrl("http://www.google.com")
            R.id.fb -> wview?.loadUrl("http://www.facebook.com")
            R.id.youtube -> wview?.loadUrl("http://www.youtube.com")
            R.id.html -> wview?.loadUrl("http://www.google.com")
         }
    }
}

