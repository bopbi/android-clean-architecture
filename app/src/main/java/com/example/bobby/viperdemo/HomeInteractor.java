package com.example.bobby.viperdemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bobby on 2/18/16.
 */
public class HomeInteractor {

    private static HomeInteractor instance;

    public static HomeInteractor getInstance() {
        if (instance == null) {
            instance = new HomeInteractor();
        }
        return instance;
    }

    public ArrayList<Timeline> getTimeLine() {
        ArrayList<Timeline> list = new ArrayList<>(10);
        list.add(new Timeline("Bobby", "Ini String asal"));
        list.add(new Timeline("Joni", "Ini String asal"));
        list.add(new Timeline("Dickson", "Ini String asal"));
        list.add(new Timeline("Nizam", "Ini String asal"));
        list.add(new Timeline("Ferry", "Ini String asal"));
        list.add(new Timeline("Dio", "Ini String asal"));
        list.add(new Timeline("Taufan", "Ini String asal"));
        list.add(new Timeline("Ucok", "Ini String asal"));
        list.add(new Timeline("Wisnu", "Ini String asal"));
        list.add(new Timeline("Adi", "Ini String asal"));
        return list;
    }
}
