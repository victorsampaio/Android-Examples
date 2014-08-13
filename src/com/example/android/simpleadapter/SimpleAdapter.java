/**
 * 
 */
package com.example.android.simpleadapter;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

/**
 * @author VictorSampaio
 *
 */
public class SimpleAdapter extends ListActivity{
	
	@Override
	protected void onCreate(Bundle icicle) {
		super.onCreate(icicle);

		ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String,String>>();
		for (int i = 0; i < 10; i++){
			HashMap<String, String> item = new HashMap<String, String>();
			item.put("name", "Name" + i);
			item.put("fone", "Fone" +i);
			list.add(item);
		}
	
		String[] from = new String[]{"name","fone"};
		// ---> review
		int[] to = new int[]{android.R.id.text1, android.R.id.text2};
		
		int layoutNative = android.R.layout.two_line_list_item;
		
		//setListAdapter(new SimpleAdapter(this, list, layoutNative, from, to));		
	
		setListAdapter(new android.widget.SimpleAdapter(this, list, layoutNative, from, to));
	}

	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
	
	Object obj = this.getListAdapter().getItem(position);
	
	String item = obj.toString();
	
	Toast.makeText(this, "You Select" + item, Toast.LENGTH_SHORT).show();
	}
	
}
