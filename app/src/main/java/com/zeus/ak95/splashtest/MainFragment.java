package com.zeus.ak95.splashtest;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.zeus.ak95.splashtest.NavigationFragment;
/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment implements View.OnClickListener {
Button navhome,livhome,parhome,aughome,swahome;
    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=  inflater.inflate(R.layout.fragment_main, container, false);
        navhome = (Button) v.findViewById(R.id.home_navbtn);
        livhome = (Button) v.findViewById(R.id.home_busbtn);
        parhome = (Button) v.findViewById(R.id.home_parkingbtn);
        aughome = (Button) v.findViewById(R.id.home_autohomebtn);
        swahome = (Button) v.findViewById(R.id.home_swachbtn);
        navhome.setOnClickListener(this);
        livhome.setOnClickListener(this);
        parhome.setOnClickListener(this);
        aughome.setOnClickListener(this);
        swahome.setOnClickListener(this);
        return v;

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.home_navbtn:
                NavigationFragment fragment = new NavigationFragment();
                FragmentTransaction fragmentTransaction1 = getFragmentManager().beginTransaction();
                fragmentTransaction1.replace(R.id.fragment_container,fragment);
                fragmentTransaction1.commit();
                // Toast.makeText(view.getContext(),"Navigation Fragment",Toast.LENGTH_SHORT).show();
                break;
            case R.id.home_busbtn:
                BusesFragment fragment2 = new BusesFragment();
                FragmentTransaction fragmentTransaction2 = getFragmentManager().beginTransaction();
                fragmentTransaction2.replace(R.id.fragment_container,fragment2);
                fragmentTransaction2.commit();
                //Toast.makeText(view.getContext(),"Live Bus Fragment",Toast.LENGTH_SHORT).show();
                break;
            case R.id.home_parkingbtn:
                ParkingFragment fragment3 = new ParkingFragment();
                FragmentTransaction fragmentTransaction3 = getFragmentManager().beginTransaction();
                fragmentTransaction3.replace(R.id.fragment_container,fragment3);
                fragmentTransaction3.commit();
                //Toast.makeText(view.getContext(),"Parking Fragment",Toast.LENGTH_SHORT).show();
                break;
            case R.id.home_autohomebtn:
                AutohomeFragment fragment4 = new AutohomeFragment();
                FragmentTransaction fragmentTransaction4 = getFragmentManager().beginTransaction();
                fragmentTransaction4.replace(R.id.fragment_container,fragment4);
                fragmentTransaction4.commit();
                //Toast.makeText(view.getContext(),"Auto Home Fragment",Toast.LENGTH_SHORT).show();
                break;
            case R.id.home_swachbtn:
                SwachcityFragment fragment5 = new SwachcityFragment();
                FragmentTransaction fragmentTransaction5 = getFragmentManager().beginTransaction();
                fragmentTransaction5.replace(R.id.fragment_container,fragment5);
                fragmentTransaction5.commit();
                //Toast.makeText(view.getContext(),"Swach City Fragment",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
