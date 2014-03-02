package com.example.eventspace;

import com.pushbots.push.Pushbots;

import android.os.Bundle;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {
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

	@Override
	public void onClick(DialogInterface dialog, int which) {
		// TODO Auto-generated method stub

	}
	
	public void showEvent(View view){
		TextView t=(TextView)findViewById(R.id.textArea);
		switch(view.getId()){
		case R.id.mapButton:
			t.setText("map button pressed");
			break;
		case R.id.contactInfoButton:
			t.setText("contact button pressed");
			break;
		case R.id.publicChatButton:
			t.setText("PC button pressed");
			break;
		case R.id.scheduleButton:
			t.setText("schedule button pressed");
			break;
		default:
			break;
			
		}
	}
	

}
