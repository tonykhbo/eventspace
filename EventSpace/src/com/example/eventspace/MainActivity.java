package com.example.eventspace;

import com.pushbots.push.Pushbots;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {
	private String SENDER_ID = "297016747626";
	private String APPLICATION_ID = "531245c11d0ab1292a8b4607";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Pushbots.init(this, SENDER_ID, APPLICATION_ID);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
