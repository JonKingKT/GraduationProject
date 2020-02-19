package com.example.graduationproject.model;

import android.os.Handler;

import com.example.graduationproject.model.Inf.IBaseModel;
import com.example.graduationproject.model.Inf.IMainModel;

public class MainModel extends BaseModel implements IBaseModel, IMainModel {
    public MainModel(Handler handler) {
        super(handler);
    }
}
