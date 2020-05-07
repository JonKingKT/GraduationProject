package com.example.graduationproject.view;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.graduationproject.GraduationApplication;
import com.example.graduationproject.R;
import com.example.graduationproject.presenter.ChoiceDatePresent;
import com.example.graduationproject.view.Inf.IBaseActivity;
import com.example.graduationproject.view.Inf.IChoiceDateActivity;
import com.example.graduationproject.view.adpter.AfternoonChoiceAdpter;
import com.example.graduationproject.view.adpter.DateChoiceAdpter;
import com.example.graduationproject.view.adpter.ForenoonChoiceAdpter;

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

    public DateChoiceAdpter dateChoiceAdpter;
    public ForenoonChoiceAdpter foreChoiceAdpter;
    public AfternoonChoiceAdpter afternoonChoiceAdpter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_date);
        ButterKnife.bind(this);
        init();
    }

    private void init() {
        dateChoice.setLayoutManager(new LinearLayoutManager(getApplicationContext()));


    }

    @Override
    protected ChoiceDatePresent getPresenter() {
        return null;
    }
}
