package com.example.bobby.viperdemo;

/**
 * Created by bobby on 2/18/16.
 */
public class HomePresenter {

    private HomeInteractor homeInteractor;
    private HomeView homeView;
    private TimelineAdapter timelineAdapter;

    public HomePresenter(HomeView homeView) {
        this.homeView = homeView;
        homeInteractor = HomeInteractor.getInstance();
        timelineAdapter = new TimelineAdapter(homeView.getContext(), homeInteractor.getTimeLine());
        homeView.getListView().setAdapter(timelineAdapter);
    }

    public void onViewCreated() {

    }

    public void onViewResumed() {

    }

    public void onViewPaused() {

    }

}
