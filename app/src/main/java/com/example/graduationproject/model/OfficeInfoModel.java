package com.example.graduationproject.model;

import android.os.Handler;

import com.example.graduationproject.model.BaseModel;
import com.example.graduationproject.model.Inf.IBaseModel;
import com.example.graduationproject.model.Inf.IOfficeInfoModel;
import com.example.graduationproject.view.Inf.IOfficeInfoActivity;

public class OfficeInfoModel extends BaseModel implements IBaseModel, IOfficeInfoModel {
    public OfficeInfoModel(Handler handler) {
        super(handler);
    }
}
