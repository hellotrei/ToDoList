package com.pinkal.todolist.application;

import android.app.Application;

import com.pinkal.todolist.customfont.TypefaceUtil;



public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        TypefaceUtil.overrideFont(getApplicationContext(), "SERIF", "fonts/avenir.ttf");
    }
}
