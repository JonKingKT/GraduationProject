package com.example.graduationproject;

import com.example.graduationproject.Present.BasePresent;
import com.example.graduationproject.model.Inf.IModel;
import com.example.graduationproject.view.Inf.View;

public interface BaseMVP<M extends IModel,V extends View,P extends BasePresent> {
    M createModel();
    V createView();
    P createPresent();
}
