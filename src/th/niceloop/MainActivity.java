package th.niceloop;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		 
		
		WebView myWebView = (WebView) findViewById(R.id.webview);
		myWebView.loadUrl("http://demo.niceloop.com/home/Logindemo");
		myWebView.setWebChromeClient(new WebChromeClient());
		myWebView.setWebViewClient(new MyWebViewClient());
		WebSettings webSettings = myWebView.getSettings();
		webSettings.setJavaScriptEnabled(true);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
