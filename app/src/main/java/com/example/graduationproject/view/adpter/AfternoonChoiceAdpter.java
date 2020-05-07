package com.example.graduationproject.view.adpter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.graduationproject.R;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AfternoonChoiceAdpter extends RecyclerView.Adapter<AfternoonChoiceAdpter.AfternoonViewHolder> {
    private final LayoutInflater mLayoutInflater;
    private final Context mContext;
    private final List mArray;
    private AfternoonChoiceAdpter.onItemClickListener itemClickListener;

    public interface onItemClickListener{
        void setItemClick(View view,int pos);
    }

    public  AfternoonChoiceAdpter(Context mContext, List list){
        this.mLayoutInflater = LayoutInflater.from(mContext);
        this.mContext = mContext;
        this.mArray = list;
    }

    @NonNull
    @Override
    public AfternoonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AfternoonChoiceAdpter.AfternoonViewHolder(mLayoutInflater.inflate(R.layout.adpter_choice_date_datechoice,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull AfternoonViewHolder holder, int position) {
        
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class AfternoonViewHolder extends RecyclerView.ViewHolder {
        public AfternoonViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
