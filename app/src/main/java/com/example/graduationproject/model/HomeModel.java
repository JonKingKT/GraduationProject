package com.example.graduationproject.model;

import android.os.Handler;

import com.example.graduationproject.model.Inf.IBaseModel;
import com.example.graduationproject.model.Inf.IHomeModel;

public class HomeModel extends BaseModel implements IBaseModel, IHomeModel {
    public HomeModel(Handler handler) {
        super(handler);
    }
}
