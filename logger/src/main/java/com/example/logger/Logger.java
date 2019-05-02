package com.example.logger;

import android.util.Log;

public class Logger
{
    private static final String TAG = "Logger";

    public static void d(String message)
    {
        Log.d(TAG,message);
    }
}
