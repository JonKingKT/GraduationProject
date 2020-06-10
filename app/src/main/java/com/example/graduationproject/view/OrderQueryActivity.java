package com.example.graduationproject.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.graduationproject.R;
import com.example.graduationproject.presenter.OrderQueryPresent;
import com.example.graduationproject.view.Inf.IBaseActivity;
import com.example.graduationproject.view.adpter.OrderQueryAdpter;

import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.List;

public class OrderQueryActivity extends BaseActivity<OrderQueryPresent> implements IBaseActivity,IOrderQuqryActivity {

    @BindView(R.id.order_query_patient_name)
    public TextView patientName;
    @BindView(R.id.order_query_recycler1)
    public RecyclerView recyclerView;

    List<String> mArray = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_query);
        ButterKnife.bind(this);
        getData();
        initRecyclerView();

    }

    private void initRecyclerView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        OrderQueryAdpter orderQueryAdpter = new OrderQueryAdpter(this,mArray);
        orderQueryAdpter.setOnClickListener(new OrderQueryAdpter.OnClickListener() {
            @Override
            public void setOnClickListener(int pos, View view) {
                Intent intent = new Intent(OrderQueryActivity.this,UserIllnessDetailsActivity.class);
                startActivity(intent);
            }
        });
    }

    private void getData() {
        for(int i=0;i<10;i++){
            mArray.add("普通外科门诊");
        }
    }

    @Override
    protected OrderQueryPresent getPresenter() {
        return null;
    }
}
