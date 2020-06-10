package com.example.graduationproject.view;

import android.app.Activity;
import android.content.Context;

import com.example.graduationproject.GraduationApplication;

import androidx.fragment.app.Fragment;

public class BaseFragment extends Fragment {
    private Activity activity;

    public Context getContext() {
        if (activity == null) {
            return GraduationApplication.getApplication();
        }
        return activity;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        activity = getActivity();
    }
}