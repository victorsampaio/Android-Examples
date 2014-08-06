package com.example.android.examplelistactivity;

import com.example.androidexamples.R;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ExampleListActivity extends ListActivity {

	@Override
	protected void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		//setContentView(R.layout.activity_example_list);
		
		//Array to String for visualize on List
		String[] items = new String[]{"Name 1", "Name 2", "Name 3"};
		
		// Using ArrayAdapter, for show Array of Strings in the screen
		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
		setListAdapter(arrayAdapter);
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id){
		super.onListItemClick(l, v, position, id);
		
		// Get item in a position
		Object o = this.getListAdapter().getItem(position);
		String item = o.toString();
		
		// show alert
		Toast.makeText(this, "You select: " + item, Toast.LENGTH_SHORT).show();
		
	}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.example_list, menu);
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
