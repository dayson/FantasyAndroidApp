package com.khello.fantasyandroidapp.fragments;

import com.khello.fantasyandroidapp.R;
import com.khello.fantasyandroidapp.R.layout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ResultsTabFragment extends Fragment {
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, 
			Bundle savedInstanceState) {
		
		View rootView = inflater.inflate(R.layout.fragment_results_tab, container, false);
		
		return rootView;
	}
}
