package com.example.bobby.viperdemo;

import android.widget.EditText;

/**
 * Created by bobby on 2/18/16.
 */
public class LoginInteractor {

    public String handleLogin(String username, String password) {
        if ((username.length() > 0) && (password.length() > 0)) {
            return "ok";
        } else {
            return null;
        }
    }

}
