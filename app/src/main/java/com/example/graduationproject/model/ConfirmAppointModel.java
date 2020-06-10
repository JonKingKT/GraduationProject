package com.example.graduationproject.model;

import android.os.Handler;

import com.example.graduationproject.model.Inf.IBaseModel;
import com.example.graduationproject.model.Inf.IConfirmAppoint;

public class ConfirmAppointModel extends BaseModel implements IConfirmAppoint, IBaseModel {
    public ConfirmAppointModel(Handler handler) {
        super(handler);
    }
}
