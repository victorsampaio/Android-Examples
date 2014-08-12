package com.example.androidexamples;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.android.examplelistactivity.ExampleListActivity;
import com.example.android.lifetime.ExampleLifetime;
import com.example.android.simpleadapter.SimpleAdapter;
import com.example.android.simpleadaptertwo.SimpleAdapterTwo;
import com.example.android.smileadapter.ExampleSmileAdapter;
import com.example.android.transitionscreen.TransitionScreen;
import com.example.androidexamples.R;
import com.example.androidexamples.R.id;
import com.example.androidexamples.R.menu;

public class MenuAndroidExamples extends ListActivity {

	private static final String[] names = new String[] { "Lifetime", "Transition Screen", "ListActivity", "Smile Adapter", "ListContact SimpleAdapterOne", "ListContact SimpleAdapterTwo", "CursorAdapter 1",
			"CursorAdapter 2", };

	@Override
	protected void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		// setContentView(R.layout.activity_menu_android_examples);

		this.setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1, names));

	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id){
		
		switch (position){
		case 0:
			startActivity(new Intent(this, ExampleLifetime.class));
			break;
		case 1:
			startActivity(new Intent(this, TransitionScreen.class));
			break;
		case 2:
			startActivity(new Intent(this, ExampleListActivity.class));
			break;
		case 3:
			startActivity(new Intent(this, ExampleSmileAdapter.class));
			break;
		case 4:
			startActivity(new Intent(this, SimpleAdapter.class));
			break;
		case 5:
			startActivity(new Intent(this, SimpleAdapterTwo.class));
			
			break;
			// Others Options
			default:
			//Finish Activities
			finish();
		}		
	}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_android_examples, menu);
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
