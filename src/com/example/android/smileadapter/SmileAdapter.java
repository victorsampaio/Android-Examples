package com.example.android.smileadapter;

import java.util.List;

import com.example.androidexamples.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class SmileAdapter extends BaseAdapter {

	private Context context;
	private List<Smile> lista;
	
	public SmileAdapter(Context context, List<Smile> list) {
	 this.context = context;
	 this.lista = list;
	}

	@Override
	public int getCount() {
		return lista.size();
	}

	@Override
	public Object getItem(int position) {
		return lista.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		Smile smile = lista.get(position);
		
		LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
		View v = inflater.inflate(R.layout.smile_details, null);
		
		TextView textName = (TextView)v.findViewById(R.id.name);
		textName.setText(smile.name);
		
		ImageView img = (ImageView)v.findViewById(R.id.img);
		img.setImageResource(smile.getImage());
		
		return v;
	}
}