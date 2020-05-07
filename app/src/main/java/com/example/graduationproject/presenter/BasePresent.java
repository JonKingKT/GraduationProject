package com.example.graduationproject.presenter;

import android.os.Handler;
import android.os.Message;

import com.example.graduationproject.model.BaseModel;
import com.example.graduationproject.model.Inf.IBaseModel;
import com.example.graduationproject.view.BaseActivity;
import com.example.graduationproject.view.Inf.IBaseActivity;

import java.lang.ref.WeakReference;

public abstract class BasePresent<M extends BaseModel & IBaseModel,V extends BaseActivity & IBaseActivity>
{
    protected V mView;
    public M mModel;
//    private DaoSession mDaoSession;
    public BasePresent(V view){

        mView = view;
        mModel = getModel(getHandler());    //model需要持有handel,用于给主线程发送消息
    }

    protected abstract M getModel(Handler handler);

    protected Handler getHandler(){
        return new MainHandler(this);
    }


    protected abstract void onViewDestory();


    public void destory() {
        mView = null;
        if(mModel != null){
            mModel.onDestory();
            mModel = null;
        }
    }

    private static class MainHandler extends Handler {

        private WeakReference<BasePresent> presenter;     //弱引用

        MainHandler(BasePresent presenter) {
            this.presenter = new WeakReference<>(presenter);
        }

        @Override
        public void handleMessage(Message msg) {
            if (presenter.get() != null) {
                try {                                           //在这里catch NullPointerException
                    if (!presenter.get().mView.isFinishing()) { //activity没有正在被finish才回调事件
                        presenter.get().eventReceive(msg);      //接收到事件后的操作,可能会抛出NullPointerException
                    }
                } catch (NullPointerException e) {
                    e.printStackTrace();
                }
            }
            super.handleMessage(msg);
        }
    }

    protected abstract void eventReceive(Message msg);

}


