package com.example.graduationproject.view;

import androidx.annotation.RequiresApi;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;

import com.example.graduationproject.Present.BasePresent;
import com.example.graduationproject.Present.MainPresent;
import com.example.graduationproject.R;
import com.example.graduationproject.model.Inf.IModel;
import com.example.graduationproject.view.BaseActivity;
import com.example.graduationproject.view.Inf.IMainActivity;
import com.example.graduationproject.view.Inf.View;

public class MainActivity extends BaseActivity<MainPresent> implements IMainActivity {


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Context mContext = getApplicationContext();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        //window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        getWindow().setStatusBarColor(Color.argb(50,0,0,0));
//        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    @Override
    protected MainPresent getPresenter() {
        return null;
    }

}
