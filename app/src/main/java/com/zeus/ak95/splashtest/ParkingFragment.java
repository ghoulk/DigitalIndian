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
public class ParkingFragment extends Fragment implements View.OnClickListener {
Button parbtn;

    public ParkingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_parking, container, false);
        parbtn = (Button) v.findViewById(R.id.parfrgbtn);
        parbtn.setOnClickListener(this);
        return v;

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.parfrgbtn :
                Intent i = new Intent(getActivity(),Parking.class);
                startActivity(i);
                break;
        }
    }
}
