package com.example.graduationproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;

import com.example.graduationproject.Present.BasePresent;
import com.example.graduationproject.model.Model;
import com.example.graduationproject.view.BaseActivity;
import com.example.graduationproject.view.View;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    @Override
    public Model createModel() {
        return null;
    }

    @Override
    public View createView() {
        return null;
    }

    @Override
    public BasePresent createPresent() {
        return null;
    }
}
