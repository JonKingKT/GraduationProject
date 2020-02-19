package com.example.graduationproject.Present;

import android.os.Handler;
import android.os.Message;

import com.example.graduationproject.Present.Inf.IMainPresent;
import com.example.graduationproject.view.MainActivity;
import com.example.graduationproject.model.MainModel;

public class MainPresent extends BasePresent<MainModel, MainActivity > implements IMainPresent {

    public MainPresent(MainActivity view) {
        super(view);
    }

    @Override
    protected MainModel getModel(Handler handler) {
        return null;
    }

    @Override
    protected void onViewDestory() {

    }

    @Override
    protected void eventReceive(Message msg) {

    }
}
