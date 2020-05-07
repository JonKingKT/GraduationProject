package com.example.graduationproject.view;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.graduationproject.presenter.LoginPresent;
import com.example.graduationproject.R;
import com.example.graduationproject.view.Inf.IBaseActivity;
import com.example.graduationproject.view.Inf.ILoginActivity;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public class LoginActivity extends BaseActivity<LoginPresent> implements IBaseActivity, ILoginActivity {

    private int loginNum;
    private ImageButton btnLogin;


    @Override
    protected LoginPresent getPresenter() {
        return null;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();
        getWindow().setStatusBarColor(Color.argb(50,0,0,0));
        loginNum = getLoginNum();
        findView();
        setLoginListener(btnLogin);
    }

    private void setLoginListener(ImageButton btnLogin) {
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });
    }

    private int getLoginNum() {
        return getIntent().getIntExtra("loginNum",1);
    }

    private void findView() {
        btnLogin = (ImageButton) findViewById(R.id.btn_login);
    }

    private void login(){
        Intent intent = new Intent( LoginActivity.this,HomeActivity.class);
        intent.putExtra("loginNum",loginNum);
        startActivity(intent);
    }

}
