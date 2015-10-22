package cn.owltf.owlweather.util;


public interface HttpCallbackListener {

    void onFinish(String response);

    void onError(Exception e);
}
