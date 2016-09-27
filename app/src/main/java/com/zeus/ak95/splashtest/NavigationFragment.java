package com.zeus.ak95.splashtest;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class NavigationFragment extends Fragment implements View.OnClickListener {
    Button nav;

    public NavigationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_navigation, container, false);
        nav =(Button) v.findViewById(R.id.navfrgbtn);
        nav.setOnClickListener(this);

        return  v;
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.navfrgbtn:
               Intent i = new Intent(getActivity(),Navigation.class);
                startActivity(i);
                // Toast.makeText(view.getContext(),"Navigation Fragment",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
