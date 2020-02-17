package com.example.graduationproject.Present;

import com.example.graduationproject.model.Model;
import com.example.graduationproject.view.View;

import java.lang.ref.WeakReference;

public abstract class BasePresent<M extends Model,V extends View> implements Present<M,V> {
    private WeakReference<V> wrf;
    public M model;

    protected abstract void onViewDestory();

    @Override
    public void registerModel(M model) {
        this.model = model;
    }

    @Override
    public void registerView(V view) {
        this.wrf = new WeakReference<V>(view);
    }

    @Override
    public V getView() {
        return wrf == null?null:wrf.get();
    }

    @Override
    public void destory() {
        if(wrf != null){
            wrf.clear();
            wrf = null;
        }
        onViewDestory();
    }
}
