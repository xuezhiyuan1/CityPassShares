package com.example.think.citypass;

import android.app.Application;

import com.example.think.citypass.catchexception.MyCrashHandler;
import com.example.think.citypass.common.base.BaseActivity;
import com.example.think.citypass.common.base.BaseFragment;

/**
 * Created by think on 2017/5/14.
 */

public class App extends Application {

    public static BaseActivity activity;
    public static BaseFragment fragment;

    @Override
    public void onCreate() {
        super.onCreate();
        MyCrashHandler.getInstance().init(getApplicationContext());
    }
}