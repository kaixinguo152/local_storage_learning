package com.example.local_storage_learning.Utils.window_utils;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

public class window_GetSize_utils {
    //get screen_width --int
    public  static int getScreenWidth(Context ctx){
        WindowManager wm = (WindowManager) ctx.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics dm = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(dm);
        return dm.widthPixels;
    }

    //get screen_height --int
    public  static int getScreenHeight(Context ctx){
        WindowManager wm = (WindowManager) ctx.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics dm = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(dm);
        return dm.heightPixels;
    }
}
