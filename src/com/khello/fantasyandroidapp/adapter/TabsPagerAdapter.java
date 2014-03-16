package com.khello.fantasyandroidapp.adapter;

import com.khello.fantasyandroidapp.fragments.PicksTabFragment;
import com.khello.fantasyandroidapp.fragments.ResultsTabFragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsPagerAdapter extends FragmentPagerAdapter {

	public TabsPagerAdapter(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Fragment getItem(int index) {
		switch (index) {
		case 0:
			// Pick Tab fragment activity
			return new PicksTabFragment();
		case 1:
			// Results Tab fragment activity
			return new ResultsTabFragment();
		}
		return null;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 2;
	}
	

}
