package com.example.graduationproject.Present;

import com.example.graduationproject.model.Model;
import com.example.graduationproject.view.View;

public interface Present<M extends Model,V extends View> {
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
