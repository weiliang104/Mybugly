package com.example.wei.mybugly;

import android.app.Application;

import com.tencent.bugly.crashreport.CrashReport;

/**
 * Created by Wei on 2017/4/10.
 */

public class app  extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        CrashReport.initCrashReport(getApplicationContext(),"828f6a1c5c",true);
    }
}
