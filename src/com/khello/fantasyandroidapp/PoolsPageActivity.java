package com.khello.fantasyandroidapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class PoolsPageActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pools_page);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pools_page, menu);
		return true;
	}

}
