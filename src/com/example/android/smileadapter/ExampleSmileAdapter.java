package com.example.android.smileadapter;

import java.util.ArrayList;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class ExampleSmileAdapter extends ListActivity {

	@Override
	protected void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		// setContentView(R.layout.activity_example_smile_adapter);

		ArrayList<Smile> list = new ArrayList<Smile>();
		list.add(new Smile("Happy", Smile.HAPPY));
		list.add(new Smile("Sad", Smile.SAD));
		list.add(new Smile("Crazy", Smile.CRAZY));

		setListAdapter(new SmileAdapter(this, list));

	}

	protected void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
		Smile smile = (Smile) getListAdapter().getItem(position);
		Toast.makeText(this, "You Select " + smile.name, Toast.LENGTH_SHORT)
				.show();
	}

	/*
	 * @Override public boolean onCreateOptionsMenu(Menu menu) { // Inflate the
	 * menu; this adds items to the action bar if it is present.
	 * getMenuInflater().inflate(R.menu.example_smile_adapter, menu); return
	 * true; }
	 * 
	 * @Override public boolean onOptionsItemSelected(MenuItem item) { // Handle
	 * action bar item clicks here. The action bar will // automatically handle
	 * clicks on the Home/Up button, so long // as you specify a parent activity
	 * in AndroidManifest.xml. int id = item.getItemId(); if (id ==
	 * R.id.action_settings) { return true; } return
	 * super.onOptionsItemSelected(item); }
	 */
}
