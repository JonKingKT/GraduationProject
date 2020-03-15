package com.example.graduationproject.model;

import android.os.Handler;

import com.example.graduationproject.model.Inf.IBaseModel;
import com.example.graduationproject.model.Inf.ILoginModel;

public class LoginModel extends BaseModel implements IBaseModel, ILoginModel {
    public LoginModel(Handler handler) {
        super(handler);
    }
}
