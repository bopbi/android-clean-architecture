package com.example.bobby.viperdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

/**
 * Created by bobby on 2/18/16.
 */
public class LoginView extends RelativeLayout {

    private EditText usernameText;
    private EditText passwordText;
    private Button loginButton;
    private LoginPresenter loginPresenter;

    public LoginView(Context context) {
        super(context);
    }

    public LoginView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public LoginView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.usernameText = (EditText) findViewById(R.id.input_username);
        this.passwordText = (EditText) findViewById(R.id.input_password);
        this.loginButton = (Button) findViewById(R.id.button_login);

        loginPresenter = new LoginPresenter(this);

    }

    public EditText getUsernameText() {
        return usernameText;
    }

    public EditText getPasswordText() {
        return passwordText;
    }

    public Button getLoginButton() {
        return loginButton;
    }

    public LoginPresenter getLoginPresenter() {
        return loginPresenter;
    }
}
