package com.example.graduationproject.view;

import android.os.Bundle;

import com.example.graduationproject.presenter.BasePresent;
import com.example.graduationproject.presenter.Inf.IBasePresent;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity<P extends BasePresent & IBasePresent>
        extends AppCompatActivity  {
    protected P present;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        present = getPresenter();

    }

    /**
     * 返回一个持有Activity对象的Presenter对象
     *
     * @return 返回的presenter对象
     * @see #onCreate(Bundle) 中调用了该方法,子类只需要复写,不需要调用
     */
    protected abstract P getPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(present != null)
        {
            //Activity销毁时如果绑定了Present，会导致GC，此处对对应的Present的绑定进行解绑
            present.destory();
        }
    }
}
