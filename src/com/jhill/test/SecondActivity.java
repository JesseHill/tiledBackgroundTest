package com.jhill.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main2);
	}
	
	public void goForward(View v) {
		Intent intent = new Intent(this, ThirdActivity.class);
		startActivity(intent);
	}
	

}
