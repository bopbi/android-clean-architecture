package com.example.bobby.viperdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LoginActivity extends AppCompatActivity {

    private LoginView loginView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginView = (LoginView) findViewById(R.id.view_login);
        loginView.getLoginPresenter().onViewCreated();
    }

    @Override
    protected void onResume() {
        super.onResume();
        loginView.getLoginPresenter().onViewResumed();
    }

    @Override
    protected void onPause() {
        super.onPause();
        loginView.getLoginPresenter().onViewPaused();
    }
}
