package com.example.graduationproject.view;

import androidx.annotation.RequiresApi;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.graduationproject.Present.MainPresent;
import com.example.graduationproject.R;
import com.example.graduationproject.view.Inf.IMainActivity;

public class MainActivity extends BaseActivity<MainPresent> implements IMainActivity {
    private ImageButton setting;
    private ImageButton userLogin;
    private ImageButton doctorLogin;
    private Button forgetPassword;
    private Button signUp;
    private DrawerLayout mDrawerLayout;
    private ImageButton muneBackBtn;
    private TextView muneAdminLogin;


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Context mContext = getApplicationContext();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawerlayout);
        getSupportActionBar().hide();

        //window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        getWindow().setStatusBarColor(Color.argb(50,0,0,0));
//        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        findView();
        setUserLoginListener(userLogin);
        setDoctorLoginListener(doctorLogin);
        setSettingListener(setting);
        setMuneAdminLoginListener(muneAdminLogin);
        setMuneBackBtnListener(muneBackBtn);
    }

    private void setMuneBackBtnListener(ImageButton muneBackBtn) {
        muneBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDrawerLayout.closeDrawer(GravityCompat.START);
            }
        });
    }

    private void setMuneAdminLoginListener(TextView muneAdminLogin) {
        muneAdminLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toLogin(3);
            }
        });
    }

    private void setSettingListener(ImageButton setting) {
        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!mDrawerLayout.isDrawerOpen(GravityCompat.START)){
                    mDrawerLayout.openDrawer(GravityCompat.START);
                }
                else {
                    mDrawerLayout.closeDrawer(GravityCompat.START);
                }
            }
        });
    }

    private void setDoctorLoginListener(ImageButton doctorLogin) {
        doctorLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toLogin(2);
            }
        });
    }

    private void setUserLoginListener(ImageButton userLogin) {
        userLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(),"text",Toast.LENGTH_SHORT).show();
                toLogin(1);
            }
        });
    }

    private void findView() {
        setting = (ImageButton)findViewById(R.id.btn_setting);
        userLogin = (ImageButton) findViewById(R.id.btn_user_login);
        doctorLogin = (ImageButton) findViewById(R.id.btn_doctor_login);
        forgetPassword = (Button) findViewById(R.id.password_forget);
        signUp = (Button) findViewById(R.id.sign_up);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout_main);
        muneAdminLogin = (TextView) findViewById(R.id.menu_admin_login);
        muneBackBtn = (ImageButton) findViewById(R.id.btn_left_menu_back);
    }

    @Override
    protected MainPresent getPresenter() {
        return null;
    }

    private void toLogin(int loginNum){
        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        intent.putExtra("loginNum",loginNum);
        startActivity(intent);
    }

}
