package com.example.bobby.viperdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LoginActivity extends AppCompatActivity {

    private LoginPresenter loginPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        LoginView loginView = (LoginView) findViewById(R.id.view_login);

        loginPresenter = new LoginPresenter(loginView);
        LoginInteractor loginInteractor = LoginInteractor.getInstance();
        loginPresenter.initialize(loginInteractor);

        loginPresenter.onViewCreated();
    }

    @Override
    protected void onResume() {
        super.onResume();
        loginPresenter.onViewResumed();
    }

    @Override
    protected void onPause() {
        super.onPause();
        loginPresenter.onViewPaused();
    }
}
