package com.example.bobby.viperdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HomeActivity extends AppCompatActivity {

    private HomeView homeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        homeView = (HomeView) findViewById(R.id.home_view);
        homeView.getHomePresenter().onViewCreated();
    }

    @Override
    protected void onResume() {
        super.onResume();
        homeView.getHomePresenter().onViewResumed();
    }

    @Override
    protected void onPause() {
        super.onPause();
        homeView.getHomePresenter().onViewPaused();
    }
}
