package com.karomo.fragmentbasics;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by karomo on 7/2/15.
 */
public class StaticFragment extends Fragment {

    private Button btnClickMe;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Defines the xml file for the fragment
        View view = inflater.inflate(R.layout.fragment_static, container, false);
        // Setup handles to view objects here
        btnClickMe = (Button) view.findViewById(R.id.clickme);


//        Toast.makeText(getActivity().getApplicationContext(),"",Toast.LENGTH_SHORT).show();
        return view;
    }
}
