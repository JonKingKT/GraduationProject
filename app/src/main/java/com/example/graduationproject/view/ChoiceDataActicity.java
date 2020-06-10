package com.example.graduationproject.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.graduationproject.R;
import com.example.graduationproject.presenter.ChoiceDatePresent;
import com.example.graduationproject.view.Inf.IBaseActivity;
import com.example.graduationproject.view.Inf.IChoiceDateActivity;
import com.example.graduationproject.view.adpter.AfternoonChoiceAdpter;
import com.example.graduationproject.view.adpter.DateChoiceAdpter;
import com.example.graduationproject.view.adpter.ForenoonChoiceAdpter;

import java.util.ArrayList;
import java.util.List;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class ChoiceDataActicity extends BaseActivity<ChoiceDatePresent> implements IBaseActivity, IChoiceDateActivity {

    @BindView(R.id.choice_date_textview_team_name)
    public TextView officeName;
    @BindView(R.id.choice_date_textview_team_location)
    public TextView officeLoaction;
    @BindView(R.id.choice_date_office_home)
    public TextView officeHome;
    @BindView(R.id.choice_date_recycler_datechoice)
    public RecyclerView dateChoice;
    @BindView(R.id.choice_date_textview_moredate)
    public TextView moreDate;
    @BindView(R.id.choice_date_linear_1)
    public LinearLayout linearLayout1;
    @BindView(R.id.choice_date_linear_2)
    public LinearLayout linearLayout2;
    @BindView(R.id.choice_date_linear_3)
    public ConstraintLayout linearLayout3;
    @BindView(R.id.choice_date_linear_4)
    public LinearLayout linearLayout4;
    @BindView(R.id.choice_date_linear4_text1)
    public TextView nextNumberDate;
    @BindView(R.id.choice_date_recycler_forenoon)
    public RecyclerView foreRecyclerView;
    @BindView(R.id.choice_date_recycler_afternoon)
    public RecyclerView afterRecyclerView;
    @BindView(R.id.choice_date_btn_in)
    public ImageView btnIn;

    public DateChoiceAdpter dateChoiceAdpter;
    public ForenoonChoiceAdpter foreChoiceAdpter;
    public ForenoonChoiceAdpter afternoonChoiceAdpter;
    public List<String> mListFore = new ArrayList<String>();
    public List<String> mListDate = new ArrayList<String>();
    public List<String> mListAfter = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_date);
        ButterKnife.bind(this);
        setData();

        initRecyclerViewDateChoice();
        initRecyclerViewForenoon();
        initRecyclerViewAfternoon();
        setClick();
    }

    private void setClick() {
        btnIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChoiceDataActicity.this,OfficeInfoActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initRecyclerViewAfternoon() {
        afterRecyclerView.setLayoutManager(new LinearLayoutManager(this){
            @Override
            public boolean canScrollVertically() {
                return false;
            }
        });
        afternoonChoiceAdpter = new ForenoonChoiceAdpter(this,mListAfter);
        afternoonChoiceAdpter.setOnClickListener(new ForenoonChoiceAdpter.OnClickListener(){
            @Override
            public void setOnClickListener(int pos, View view) {
                Intent intent = new Intent(getApplicationContext(),ConfirmAppointActivity.class);
                startActivity(intent);
            }
        });
        afterRecyclerView.setAdapter(afternoonChoiceAdpter);
    }

    private void initRecyclerViewForenoon() {
        foreRecyclerView.setLayoutManager(new LinearLayoutManager(this){
            @Override
            public boolean canScrollVertically() {
                return false;
            }
        });
        foreChoiceAdpter = new ForenoonChoiceAdpter(this,mListFore);
        foreChoiceAdpter.setOnClickListener(new ForenoonChoiceAdpter.OnClickListener(){
            @Override
            public void setOnClickListener(int pos, View view) {
                Intent intent = new Intent(getApplicationContext(),ConfirmAppointActivity.class);
                startActivity(intent);
            }
        });
        foreRecyclerView.setAdapter(foreChoiceAdpter);

    }

    private void setData() {
       for(int i=0;i<15;i++){
           mListAfter.add("周日");
           mListFore.add("周日");
           mListDate.add("周日");
       }
    }

    private void initRecyclerViewDateChoice() {
        LinearLayoutManager lm = new LinearLayoutManager(this);
        lm.setOrientation(LinearLayoutManager.HORIZONTAL);
        dateChoice.setLayoutManager(lm);
        dateChoiceAdpter = new DateChoiceAdpter(this,mListDate);
        dateChoice.setAdapter(dateChoiceAdpter);

    }

    @Override
    protected ChoiceDatePresent getPresenter() {
        return null;
    }
}
