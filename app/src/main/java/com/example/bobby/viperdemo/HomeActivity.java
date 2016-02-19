package com.example.bobby.viperdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HomeActivity extends AppCompatActivity {

    private HomePresenter homePresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        HomeView homeView = (HomeView) findViewById(R.id.home_view);
        homePresenter = new HomePresenter(homeView);
        HomeInteractor homeInteractor = new HomeInteractor();
        homePresenter.initialize(homeInteractor);

        homePresenter.onViewCreated();
    }

    @Override
    protected void onResume() {
        super.onResume();
        homePresenter.onViewResumed();
    }

    @Override
    protected void onPause() {
        super.onPause();
        homePresenter.onViewPaused();
    }
}
