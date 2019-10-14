package com.an.room;

import android.app.Application;
import android.content.Context;

import com.facebook.stetho.Stetho;

public class AppController extends Application {

    private static Context sContext;

    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
        sContext = getApplicationContext();

    }

    public static Context getContext() {
        return sContext;
    }
}
