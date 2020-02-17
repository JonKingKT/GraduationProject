package com.example.graduationproject.view;

import android.os.Bundle;

import com.example.graduationproject.BaseMVP;
import com.example.graduationproject.Present.BasePresent;
import com.example.graduationproject.model.Model;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity<M extends Model,V extends View,P extends BasePresent>
        extends AppCompatActivity implements BaseMVP<M,V,P> {
    protected P present;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        present = createPresent();
        if(present == null){
            present.registerModel(createModel());
            present.registerView(createView());
        }
    }

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
