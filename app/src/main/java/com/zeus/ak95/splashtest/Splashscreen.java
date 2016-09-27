package com.zeus.ak95.splashtest;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class Splashscreen extends AppCompatActivity implements Animation.AnimationListener{
    ImageView iv1,iv2;
    Animation animation;
    Intent in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.splashrotate);
        animation.setAnimationListener(this);

        iv2 = (ImageView) findViewById(R.id.splasiv2);
        iv2.setVisibility(View.VISIBLE);
        iv2.startAnimation(animation);
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        finish();
        Intent i = new Intent(Splashscreen.this,NavDraw.class);
        startActivity(i);
    }

    @Override
    public void onAnimationRepeat(Animation animation) {
        finish();
        Intent i = new Intent(Splashscreen.this,NavDraw.class);
        startActivity(i);
    }
}
