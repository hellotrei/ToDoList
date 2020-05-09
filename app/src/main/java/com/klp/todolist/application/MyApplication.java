package com.klp.todolist.application;

import android.app.Application;

import com.klp.todolist.customfont.TypefaceUtil;



public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        TypefaceUtil.overrideFont(getApplicationContext(), "SERIF", "fonts/avenir.ttf");
    }
}
