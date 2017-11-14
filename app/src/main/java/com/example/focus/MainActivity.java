package com.example.focus;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ViewPager view_pager;
    CustomSwipeAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view_pager = (ViewPager) findViewById(R.id.view_pager);
        adapter = new CustomSwipeAdapter(this);

        view_pager.setAdapter(adapter);

    }
}
