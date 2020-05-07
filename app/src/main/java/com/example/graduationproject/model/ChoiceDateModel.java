package com.example.graduationproject.model;

import android.os.Handler;

import com.example.graduationproject.model.Inf.IBaseModel;
import com.example.graduationproject.model.Inf.IChoiceDateModel;

public class ChoiceDateModel extends BaseModel implements IBaseModel, IChoiceDateModel {
    public ChoiceDateModel(Handler handler) {
        super(handler);
    }
}
