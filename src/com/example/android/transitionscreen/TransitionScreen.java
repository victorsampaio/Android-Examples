package com.example.android.transitionscreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.example.androidexamples.R;

public class TransitionScreen extends Activity  implements OnClickListener{

	protected static final String CATEGORIA = "lifetime";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_transition_screen);
		
		Button b = new Button(this);
		b.setText("Click Here");
		b.setOnClickListener(this);
		setContentView(b);
	}

	@Override
	public void onClick(View v) {
	
		// Send parameters using Bundle
		Intent it= new Intent(this, SecondScreen.class);
		Bundle params = new Bundle();
		params.putString("msg", "Hello - Bundle");
		it.putExtras(params);
		
		// Send parameters using Intent
		//Intent it2 = new Intent(this, SecondScreen.class);
		it.putExtra("msg2", "Hello - Intent");
		startActivity(it);	
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.transition_screen, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
