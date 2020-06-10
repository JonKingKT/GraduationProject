package com.example.graduationproject.presenter;

import android.os.Handler;
import android.os.Message;

import com.example.graduationproject.model.ConfirmAppointModel;
import com.example.graduationproject.presenter.Inf.IConfirmAppointPresent;
import com.example.graduationproject.view.ConfirmAppointActivity;

public class ConfirmAppointPresentr extends BasePresent<ConfirmAppointModel,ConfirmAppointActivity>
        implements IConfirmAppointPresent {
    public ConfirmAppointPresentr(ConfirmAppointActivity view) {
        super(view);
    }

    @Override
    protected ConfirmAppointModel getModel(Handler handler) {
        return null;
    }

    @Override
    protected void onViewDestory() {

    }

    @Override
    protected void eventReceive(Message msg) {

    }
}
