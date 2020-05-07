package com.example.graduationproject.presenter;


import android.os.Handler;
import android.os.Message;

import com.example.graduationproject.presenter.Inf.IHomePresent;
import com.example.graduationproject.model.HomeModel;
import com.example.graduationproject.view.HomeActivity;

public class HomePresent extends BasePresent<HomeModel, HomeActivity> implements IHomePresent {
    public HomePresent(HomeActivity view) {
        super(view);
    }

    @Override
    protected HomeModel getModel(Handler handler) {
        return null;
    }

    @Override
    protected void onViewDestory() {

    }

    @Override
    protected void eventReceive(Message msg) {

    }


}
