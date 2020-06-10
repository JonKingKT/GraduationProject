package com.example.graduationproject.model;

import android.os.Handler;

import com.example.graduationproject.model.Inf.IBaseModel;
import com.example.graduationproject.model.Inf.IOrderQueryModel;


public class OrderQueryModel extends BaseModel implements IBaseModel, IOrderQueryModel {
    public OrderQueryModel(Handler handler) {
        super(handler);
    }
}
