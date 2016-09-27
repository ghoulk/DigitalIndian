package com.zeus.ak95.splashtest;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class BusesFragment extends Fragment implements View.OnClickListener {
Button busbtn;

    public BusesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_buses, container, false);
        busbtn = (Button) v.findViewById(R.id.busfrgbtn);
        busbtn.setOnClickListener(this);
        return v;
    }

    @Override
    public void onClick(View v) {
     switch (v.getId()){
         case R.id.busfrgbtn :
             Intent i = new Intent(getActivity(),LiveBus.class);
             startActivity(i);
             break;


     }
    }
}
