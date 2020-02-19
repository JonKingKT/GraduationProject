package com.example.graduationproject.Present.Inf;

import com.example.graduationproject.model.Inf.IModel;
import com.example.graduationproject.view.Inf.View;

public interface Present<M extends IModel,V extends View> {
    /**
     * @param
     */
    void registerModel(M model);

    /**
     *
     */
    void registerView(V view);

    /**
     * 获取View
     * @return
     */
    V getView();

    /**
     * 销毁View
     */
    void destory();
}
