package com.tejas_bharadwaj.cardos;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class LaunchActivity extends AppCompatActivity {

    private LinearLayout launchLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
        launchLayout = (LinearLayout) findViewById(R.id.launch_layout);
        launchLayout.setBackgroundColor(Color.parseColor("#194D1E"));
    }
}
