package com.zzh.myweather.util;

/**
 * Created by ZZH on 2016/10/23.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
