package com.example.graduationproject.view;

import android.os.Bundle;
import android.widget.TextView;

import com.example.graduationproject.R;
import com.example.graduationproject.presenter.OfficeInfoPresenter;
import com.example.graduationproject.view.Inf.IBaseActivity;
import com.example.graduationproject.view.Inf.IOfficeInfoActivity;
import com.example.graduationproject.view.adpter.OfficeDoctorInfoAdpter;

import java.util.ArrayList;
import java.util.List;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class OfficeInfoActivity extends BaseActivity<OfficeInfoPresenter> implements IBaseActivity, IOfficeInfoActivity {

    @BindView(R.id.office_info_office_name)
    public TextView officeName;             //科室名
    @BindView(R.id.office_info_well_sick_info)
    public TextView wellSickInfo;           //擅长疾病
    @BindView(R.id.office_info_office_info_info)
    public TextView officeInfo;             //科室简介
    @BindView(R.id.office_info_doctor_num)
    public TextView doctorNum;              //医生数量
    @BindView(R.id.office_info_doctor_info)
    public RecyclerView doctorInfo;         //医生信息

    public List<String> mArray = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_office_info);
        ButterKnife.bind(this);
        setdata();
        initRecyclerViewDocInfo();

    }

    private void setdata() {
        for(int i=0;i<6;i++){
            mArray.add("周日");
        }

    }

    private void initRecyclerViewDocInfo() {
        LinearLayoutManager linearLayoutManager =  new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        doctorInfo.setLayoutManager(linearLayoutManager);
        doctorInfo.setAdapter(new OfficeDoctorInfoAdpter(this,mArray));
    }

    @Override
    protected OfficeInfoPresenter getPresenter() {
        return null;
    }
}
