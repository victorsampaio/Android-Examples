package com.example.android.smileadapter;

import com.example.androidexamples.R;

public class Smile {

	public static final int HAPPY = 0;
	public static final int SAD = 1;
	public static final int CRAZY = 2;

	public String name;
	private final int type;

	public Smile(String name, int type) {
		this.name = name;
		this.type = type;

	}

	public int getImage() {
		switch (type) {
		case HAPPY:
			return R.drawable.happy;
		case SAD:
			return R.drawable.sad;
		case CRAZY:
			return R.drawable.crazy;
		}
		// default:
		// break;
		return R.drawable.notfound;
	}

}