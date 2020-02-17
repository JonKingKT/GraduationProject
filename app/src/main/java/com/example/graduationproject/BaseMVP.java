package com.example.graduationproject;

import com.example.graduationproject.Present.BasePresent;
import com.example.graduationproject.Present.Present;
import com.example.graduationproject.model.Model;
import com.example.graduationproject.view.View;

public interface BaseMVP<M extends Model,V extends View,P extends BasePresent> {
    M createModel();
    V createView();
    P createPresent();
}
