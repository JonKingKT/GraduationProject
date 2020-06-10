package com.example.graduationproject.presenter;

import android.os.Handler;
import android.os.Message;

import com.example.graduationproject.model.Inf.IOfficeInfoModel;
import com.example.graduationproject.model.Inf.IOrderQueryModel;
import com.example.graduationproject.model.OrderQueryModel;
import com.example.graduationproject.presenter.Inf.IBasePresent;
import com.example.graduationproject.view.OrderQueryActivity;

public class OrderQueryPresent extends BasePresent<OrderQueryModel,OrderQueryActivity> implements IOrderQueryPresent {
    public OrderQueryPresent(OrderQueryActivity view) {
        super(view);
    }

    @Override
    protected OrderQueryModel getModel(Handler handler) {
        return null;
    }

    @Override
    protected void onViewDestory() {

    }

    @Override
    protected void eventReceive(Message msg) {

    }
}
