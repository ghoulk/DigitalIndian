package com.zeus.ak95.splashtest;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.view.ActionMode;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class NavDraw extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
Intent intt;
    NavigationView navigationView=null;
    Toolbar toolbar=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav_draw);

        MainFragment fragment = new MainFragment();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container,fragment);
        fragmentTransaction.commit();

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
/*
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Floating Button Clicked.....Digital Indian", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

             //   Toast.makeText(NavDraw.this, "Floating Button Clicked.....Digital Indian", Toast.LENGTH_SHORT).show();

            }
        });
*/
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.nav_draw, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_refresh) {
            Toast.makeText(NavDraw.this, "refreshing", Toast.LENGTH_SHORT).show();

            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            MainFragment fragment = new MainFragment();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container,fragment);
            fragmentTransaction.commit();
        } else if (id == R.id.nav_navigation) {
            NavigationFragment fragmentnav = new NavigationFragment();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container,fragmentnav);
            fragmentTransaction.commit();
        } else if (id == R.id.nav_buses) {
            BusesFragment fragmentbus = new BusesFragment();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container,fragmentbus);
            fragmentTransaction.commit();
        } else if (id == R.id.nav_parking) {
            ParkingFragment fragmentpar = new ParkingFragment();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container,fragmentpar);
            fragmentTransaction.commit();
        } else if (id == R.id.nav_autohome) {
            AutohomeFragment fragmentaut = new AutohomeFragment();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container,fragmentaut);
            fragmentTransaction.commit();
        } else if (id == R.id.nav_swachcity) {
            SwachcityFragment fragmentswa = new SwachcityFragment();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container,fragmentswa);
            fragmentTransaction.commit();
        } else if (id == R.id.nav_settings) {
            Toast.makeText(NavDraw.this, "Will be updated soon", Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.nav_helpfeedbk) {
           // Toast.makeText(NavDraw.this, "Help and feedback Clicked...", Toast.LENGTH_SHORT).show();
            intt = new Intent(Intent.ACTION_SEND);
            intt.putExtra(Intent.EXTRA_SUBJECT,"Support/Feedback Mail DigitalIndian");
            intt.putExtra(Intent.EXTRA_EMAIL,new String[]{"ashishk2599@gmail.com"});
            intt.setType("message/rfc822");
            startActivity(intt);
        } else if (id == R.id.nav_share) {
            Toast.makeText(NavDraw.this, "Share this app", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_about) {
            Toast.makeText(NavDraw.this, "Developed by Ashish Kumar", Toast.LENGTH_LONG).show();


        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
