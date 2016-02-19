package com.example.bobby.viperdemo;

import android.content.Context;
import android.content.Intent;

/**
 * Created by bobby on 2/18/16.
 */
public class Wireframe {

    private Context context;

    public Wireframe(Context context) {
        this.context = context;
    }

    public void goToHome() {
        Intent homeIntent = new Intent(context, HomeActivity.class);
        context.startActivity(homeIntent);
    }
}
