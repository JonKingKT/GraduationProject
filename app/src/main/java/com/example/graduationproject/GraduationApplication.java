package com.example.graduationproject;

import android.app.Application;
import android.content.Context;

import androidx.multidex.MultiDexApplication;

public class GraduationApplication extends MultiDexApplication {
    private String session;
//    private DaoSession daoSession;

    private static GraduationApplication application;

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;

    }



    public static GraduationApplication getApplication() { return application; }
}
