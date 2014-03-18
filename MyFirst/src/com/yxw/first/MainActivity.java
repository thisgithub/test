package com.yxw.first;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.yxw.myfirst.R;

//The first project 
public class MainActivity extends Activity{
	TextView text;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}
}
