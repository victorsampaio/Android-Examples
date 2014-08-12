package com.example.android.simpleadaptertwo;

import java.util.ArrayList;
import java.util.HashMap;

import com.example.androidexamples.R;
import com.example.androidexamples.R.id;
import com.example.androidexamples.R.layout;
import com.example.androidexamples.R.menu;

import android.support.v7.app.ActionBarActivity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

public class SimpleAdapterTwo extends ListActivity {

	 @Override
	    protected void onCreate(Bundle icicle) {
	        super.onCreate(icicle);
	        //setContentView(R.layout.activity_example_simple_adapter_two);
	        setContentView(R.layout.layout_listview_contatcts);
	        
	        ListAdapter adapter = createAdapter();
	        setListAdapter(adapter);
	     
	    }
	    
	    private ListAdapter createAdapter() {
	        ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String,String>>();
	        
	        for (int i = 0; i < 10 ; i++){
	        	HashMap<String, String> item = new HashMap<String, String>();
	        	item.put("name", "Name "+ i);
	        	item.put("fone", "Fone "+ i);
	        	list.add(item);
	        }
	        
	        String[] from = new String[]{"name", "fone"};
	        
	        int[] to = new int[]{R.id.nome, R.id.fone};
	       
	        SimpleAdapter adapter = new SimpleAdapter(this, list, R.layout.layout_contacts_fone, from, to);
	        return adapter;
		}
	    
	   	protected void onListItemClick (ListView l, View v, int position, long id){
	    	super.onListItemClick(l, v, position, id);
	    	
	    	Object obj = this.getListAdapter().getItem(position);
	    	String item = obj.toString();
	    	
	    	Toast.makeText(this, "You Select: " + item, Toast.LENGTH_SHORT).show();
	    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.simple_adapter_two, menu);
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
