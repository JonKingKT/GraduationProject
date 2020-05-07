package com.example.graduationproject.presenter;

import android.os.Handler;
import android.os.Message;

import com.example.graduationproject.presenter.Inf.ILoginPresent;
import com.example.graduationproject.model.LoginModel;
import com.example.graduationproject.view.LoginActivity;

public class LoginPresent extends BasePresent<LoginModel, LoginActivity> implements ILoginPresent {
    public LoginPresent(LoginActivity view) {
        super(view);
    }

    @Override
    protected LoginModel getModel(Handler handler) {
        return null;
    }

    @Override
    protected void onViewDestory() {

    }

    @Override
    protected void eventReceive(Message msg) {

    }


}
