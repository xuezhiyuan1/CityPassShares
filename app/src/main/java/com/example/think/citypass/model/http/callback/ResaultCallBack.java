package com.example.think.citypass.model.http.callback;

/**
 * Created by think on 2017/5/14.
 */

public interface ResaultCallBack {

    void onSuccess(Object obj);

    void onError(String errorMsg);

    void notNet(String netData);

    void onErrorParams(String errorParams);

}
