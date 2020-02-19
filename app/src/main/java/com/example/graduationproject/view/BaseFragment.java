package com.example.graduationproject.view;

import android.content.Context;

import com.example.graduationproject.BaseMVP;
import com.example.graduationproject.Present.BasePresent;
import com.example.graduationproject.model.Inf.IModel;
import com.example.graduationproject.view.Inf.View;

import androidx.fragment.app.Fragment;

public abstract class BaseFragment<M extends IModel,V extends View,P extends BasePresent>
        extends Fragment implements BaseMVP<M,V,P> {
    protected P present;
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        present = createPresent();
//        if(present == null){
//            present.registerModel(createModel());
//            present.registerView(createView());
//        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        if(present != null){
            present.destory();
        }
    }
}
