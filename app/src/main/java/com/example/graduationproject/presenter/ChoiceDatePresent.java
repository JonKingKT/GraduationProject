package com.example.graduationproject.presenter;

import android.os.Handler;
import android.os.Message;

import com.example.graduationproject.model.ChoiceDateModel;
import com.example.graduationproject.presenter.Inf.IChoiceDatePresent;
import com.example.graduationproject.view.ChoiceDataActicity;

public class ChoiceDatePresent extends BasePresent<ChoiceDateModel, ChoiceDataActicity> implements IChoiceDatePresent {
    public ChoiceDatePresent(ChoiceDataActicity view) {
        super(view);
    }

    @Override
    protected ChoiceDateModel getModel(Handler handler) {
        return null;
    }

    @Override
    protected void onViewDestory() {

    }

    @Override
    protected void eventReceive(Message msg) {

    }
}
