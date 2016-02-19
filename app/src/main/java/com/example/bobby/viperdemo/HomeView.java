package com.example.bobby.viperdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;
import android.widget.RelativeLayout;

/**
 * Created by bobby on 2/18/16.
 */
public class HomeView extends RelativeLayout {

    private ListView listView;

    public HomeView(Context context) {
        super(context);
    }

    public HomeView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public HomeView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        listView = (ListView) findViewById(R.id.list_timeline);

    }

    public ListView getListView() {
        return listView;
    }
}
