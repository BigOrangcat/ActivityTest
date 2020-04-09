package com.example.xumeixing.activitytest;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xumeixing on 2018/5/7.
 */

public class ActivityCollector {
    public static List<Activity> activiies=new ArrayList<Activity>();
    public static void addActivity(Activity activity) {
        activiies.add(activity);
    }
    public static void removeActivity(Activity activity){
        activiies.remove(activity);
    }
    public static void finishAll(){
        for (Activity activity:activiies){
            activity.finish();
        }
        activiies.clear();
    }
}
