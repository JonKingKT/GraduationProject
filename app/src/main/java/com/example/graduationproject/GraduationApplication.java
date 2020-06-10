package com.example.graduationproject;

import android.app.Activity;
import android.content.Context;

import androidx.multidex.MultiDexApplication;

public class GraduationApplication extends MultiDexApplication {
    private String session;
//    private DaoSession daoSession;

    private static GraduationApplication application;
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
        context = getApplicationContext();

    }



    public static GraduationApplication getApplication() { return application; }
    public static Context getContext() { return context; }
}
