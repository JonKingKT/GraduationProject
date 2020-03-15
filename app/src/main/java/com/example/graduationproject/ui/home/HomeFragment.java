package com.example.graduationproject.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.graduationproject.R;
import com.example.graduationproject.adpter.HomeTypeFragmentAdpter;
import com.example.graduationproject.view.ChoiceData;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private RecyclerView mChoiceOfficesRecyler;
    private RecyclerView mChoiceTypeRecyler;
    private TextView textView;
    private View root;
    private ArrayList<String> mData = new ArrayList<String>();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        root = inflater.inflate(R.layout.fragment_home, container, false);
        findView();
        initData();
        initRecylerViewType();
        initRecylerViewOffice();

        homeViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

    private void initRecylerViewOffice() {
        HomeTypeFragmentAdpter mAdpter = new HomeTypeFragmentAdpter(getContext(),mData);
        mChoiceOfficesRecyler.setLayoutManager(new LinearLayoutManager(getContext()));
        mAdpter.setItemObclickLstener(new HomeTypeFragmentAdpter.OnClickListener() {
            @Override
            public void setClickiItem(int pos, View view) {
                Intent intent = new Intent(getContext(), ChoiceData.class);
                startActivity(intent);
            }

            @Override
            public void setLongClickItem(int pos, View view) {

            }
        });
        mChoiceOfficesRecyler.setAdapter(mAdpter);
    }

    private void initRecylerViewType() {
        mChoiceTypeRecyler.setLayoutManager(new LinearLayoutManager(getContext()));
        HomeTypeFragmentAdpter mAdpter = new HomeTypeFragmentAdpter(getContext(),mData);
        mChoiceTypeRecyler.setAdapter(mAdpter);
        mAdpter.setItemObclickLstener(new HomeTypeFragmentAdpter.OnClickListener() {
            @Override
            public void setClickiItem(int pos, View view) {
                Toast.makeText(getContext(),"第"+pos,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void setLongClickItem(int pos, View view) {
                Toast.makeText(getContext(),"第"+pos+"个",Toast.LENGTH_SHORT).show();
            }
        });



    }

    private void initData() {
        int i =1;
        for( ;i<20;i++){
            mData.add("科室"+String.valueOf(i));
        }
    }

    private void findView() {
        textView = root.findViewById(R.id.text_home);
        mChoiceOfficesRecyler = root.findViewById(R.id.recycler_office_home);
        mChoiceTypeRecyler = root.findViewById(R.id.recycler_section_home);
    }
}