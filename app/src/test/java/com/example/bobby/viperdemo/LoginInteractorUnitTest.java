package com.example.bobby.viperdemo;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by bobby on 2/19/16.
 */
public class LoginInteractorUnitTest {

    @Test
    public void handleEmptyLoginTest() {
        assertEquals(LoginInteractor.getInstance().handleLogin("",""), null);
    }

    @Test
    public void handleExistLoginTest() {
        assertEquals(LoginInteractor.getInstance().handleLogin("a","a"), "ok");
    }
}
