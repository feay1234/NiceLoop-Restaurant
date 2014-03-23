package th.niceloop;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class PreActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pre);
		
		new CountDownTimer(3000, 1000) {       
			   public void onTick(long millisUntilFinished) {          
			    
			}       

			public void onFinish() {         
				Intent intent = new Intent(getApplicationContext(), MainActivity.class);
			    startActivity(intent);
			    finish();
			}   
		}.start();  
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pre, menu);
		return true;
	}

}
