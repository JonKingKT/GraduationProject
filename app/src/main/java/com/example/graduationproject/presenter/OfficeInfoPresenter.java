package com.example.graduationproject.presenter;

import android.os.Handler;
import android.os.Message;

import com.example.graduationproject.model.OfficeInfoModel;
import com.example.graduationproject.presenter.Inf.IBasePresent;

import com.example.graduationproject.presenter.Inf.IOfficeInfoPresent;
import com.example.graduationproject.view.Inf.IBaseActivity;
import com.example.graduationproject.view.Inf.IOfficeInfoActivity;
import com.example.graduationproject.view.OfficeInfoActivity;

public class OfficeInfoPresenter extends BasePresent<OfficeInfoModel, OfficeInfoActivity> implements IOfficeInfoPresent {
    public OfficeInfoPresenter(OfficeInfoActivity view) {
        super(view);
    }

    @Override
    protected OfficeInfoModel getModel(Handler handler) {
        return null;
    }

    @Override
    protected void onViewDestory() {

    }

    @Override
    protected void eventReceive(Message msg) {

    }
}
