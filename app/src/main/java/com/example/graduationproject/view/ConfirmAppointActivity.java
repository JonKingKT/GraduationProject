package com.example.graduationproject.view;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.graduationproject.R;
import com.example.graduationproject.presenter.ConfirmAppointPresentr;
import com.example.graduationproject.view.Inf.IBaseActivity;
import com.example.graduationproject.view.Inf.IConfirmAppointActivity;
import com.google.android.material.bottomappbar.BottomAppBar;

import java.util.ArrayList;
import java.util.List;

import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.ButterKnife;

public class ConfirmAppointActivity extends BaseActivity<ConfirmAppointPresentr> implements IBaseActivity, IConfirmAppointActivity {

    @BindView(R.id.confirm_paient_name)
    public TextView paientName;
    @BindView(R.id.confirm_paient_id)
    public TextView paientId;
    @BindView(R.id.confirm_paient_edit)
    public ImageView buttonEdit;
    @BindView(R.id.confirm_constralayout)
    public ConstraintLayout constraintLayout1;   //编辑就诊人的框  隐藏用
    @BindView(R.id.confirm_imageview_paient_add)
    public ImageView buttonAddPaient;
    @BindView(R.id.confirm_linear3)
    public LinearLayout linearLayout3;      //添加就诊人的框   隐藏用
    @BindView(R.id.confirm_checkbox_1)
    public CheckBox checkBox1;
    @BindView(R.id.confirm_checkbox_2)
    public CheckBox checkBox2;
    @BindView(R.id.confirm_checkbox_3)
    public CheckBox checkBox3;
    @BindView(R.id.confirm_checkbox_4)
    public CheckBox checkBox4;
    @BindView(R.id.confirm_checkbox_5)
    public CheckBox checkBox5;
    @BindView(R.id.confirm_checkbox_6)
    public CheckBox checkBox6;
    @BindView(R.id.confirm_textview_bean2)
    public TextView visitOffice;            //就诊科室名
    @BindView(R.id.confirm_textview_bean3)
    public TextView doctorWell;             //医生擅长
    @BindView(R.id.confirm_textview_bean4)
    public TextView docCost;                //挂号费
    @BindView(R.id.confirm_textview_bean5)
    public TextView confirmDate;            //挂号日期
    @BindView(R.id.confirm_button_confirm)
    public Button buttonConfirm;
    @BindView(R.id.confirm_constralayout2)
    public ConstraintLayout constraintLayout2;
    @BindView(R.id.confirm_detials_editText)
    public EditText editText;



    private Integer checkBoxList[]= new Integer[]{0,0,0,0,0,0};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_appoint);
        ButterKnife.bind(this);
        checkNeed();

//        buttonConfirm.setOnClickListener();
    }

    private boolean checkNeed() {
        boolean ischeck =false;
        CheckBox checkBox;
        for(int i=1;i<constraintLayout2.getChildCount();i++)
        {
            checkBox = (CheckBox) constraintLayout2.getChildAt(i);
            if(checkBox.isChecked()) {
                checkBoxList[i-1]=1;
                ischeck= true;
            }
        }
        if(editText.getText().toString().trim().isEmpty()){
            ischeck =false;
        }
        return ischeck;
    }

    @Override
    protected ConfirmAppointPresentr getPresenter() {
        return null;
    }
}
