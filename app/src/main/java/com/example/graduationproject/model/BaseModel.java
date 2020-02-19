package com.example.graduationproject.model;

import android.os.Handler;
import android.os.Message;

public abstract class BaseModel {
    //NetworkInterfaces mNetworkInterface;   //网络接口
    private Handler mHandler;             //主线程的Handler

    public BaseModel(Handler handler) {
        this.mHandler = handler;
       // this.mNetworkInterface = getNetworkInterface();
    }
//    synchronized void postEvent(BaseEvent event) {
//        if (mHandler != null) {
//            Message message = mHandler.obtainMessage();
//            message.what = event.getWhat();
//            message.obj = event;
//            mHandler.sendMessage(message);
//        }
//    }

//    /**
//     * 获取网络接口,已在构造函数调用,只需要复写,不需要调用
//     *
//     * @return 网络接口
//     */
//    protected abstract NetworkInterfaces getNetworkInterface();


    public void onDestory() {
        mHandler = null;
    }


}
