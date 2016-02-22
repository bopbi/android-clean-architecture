package com.example.bobby.viperdemo;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by bobby on 2/18/16.
 */
public class LoginPresenter {

    private LoginView loginView;
    private EditText usernameText;
    private EditText passwordText;
    private Button loginButton;

    public LoginPresenter(LoginView loginView) {
        this.loginView = loginView;

        final LoginInteractor loginInteractor = LoginInteractor.getInstance();

        // bind in here
        this.usernameText = loginView.getUsernameText();
        this.passwordText = loginView.getPasswordText();
        this.loginButton = loginView.getLoginButton();
        this.loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (loginInteractor.handleLogin(usernameText.getText().toString(), passwordText.getText().toString()) != null) {
                    new Wireframe(LoginPresenter.this.loginView.getContext()).goToHome();
                } else {
                    showError();
                }
            }
        });
    }


    public void onViewCreated() {

    }

    public void onViewResumed() {

    }

    public void onViewPaused() {

    }

    public void showError() {
        final AlertDialog.Builder dialog = new AlertDialog.Builder(loginView.getContext());

        dialog.setTitle("Login" )
                .setMessage("Incorrect Username or password")
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialoginterface, int i) {
                        dialoginterface.dismiss();
                    }
                }).show();

    }
}
