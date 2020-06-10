package com.example.graduationproject.ui.notifications;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import com.example.graduationproject.GraduationApplication;
import com.example.graduationproject.R;
import com.example.graduationproject.view.OrderQueryActivity;
import com.example.graduationproject.view.UserInfoActivity;

public class NotificationsFragment extends Fragment {

//    @BindView(R.id.myself_btn1)
//    public Button btnMyInfo;
//    @BindView(R.id.myself_btn2)
//    public Button btnOrderQuery;
//    @BindView(R.id.myself_btn3)
//    public Button btnSignOut;
//    @OnClick(R.id.myself_btn1)
//    public void btnClick(){
//        Intent intent1 = new Intent(getContext(), UserInfoActivity.class);
//        startActivity(intent1);
//    }
//    @OnClick(R.id.myself_btn2)
//    public void btnClick2(){
//        Intent intent2 = new Intent(getContext(), OrderQueryActivity.class);
//        startActivity(intent2);
//    }
//    @OnClick(R.id.myself_btn3)
//    public void btnClick3(){
//
//    }

    public Button btnMyInfo;
    public Button btnOrderQuery;
    public Button btnSignOut;

    private NotificationsViewModel notificationsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        notificationsViewModel =
                ViewModelProviders.of(this).get(NotificationsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_notifications, container, false);
        ButterKnife.bind(getActivity());
        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        btnMyInfo = getActivity().findViewById(R.id.myself_btn1);
        btnOrderQuery = getActivity().findViewById(R.id.myself_btn2);
        btnSignOut = getActivity().findViewById(R.id.myself_btn3);
        btnMyInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getContext(), UserInfoActivity.class);
                startActivity(intent1);
            }
        });

        btnOrderQuery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getContext(), OrderQueryActivity.class);
                startActivity(intent2);
            }
        });
    }
}