package com.example.graduationproject.view.adpter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.graduationproject.R;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class AfternoonChoiceAdpter extends RecyclerView.Adapter<AfternoonChoiceAdpter.AfternoonViewHolder> {
    private final LayoutInflater mLayoutInflater;
    private final Context mContext;
    private final List<String> mArray;
    private AfternoonChoiceAdpter.onItemClickListener itemClickListener;

    public interface onItemClickListener{
        void setItemClick(View view,int pos);
    }

    public  AfternoonChoiceAdpter(Context mContext, List<String> list){
        this.mLayoutInflater = LayoutInflater.from(mContext);
        this.mContext = mContext;
        this.mArray = list;
    }

    @NonNull
    @Override
    public AfternoonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AfternoonChoiceAdpter.AfternoonViewHolder(mLayoutInflater.inflate(R.layout.adpter_choice_date_guahao,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull AfternoonViewHolder holder, int position) {
        holder.textViewExpter.setText( mArray.get(position));
        holder.textViewDoWell.setText( mArray.get(position));
        holder.textViewCost.setText(mArray.get(position));
        holder.buttonpur.setText(mArray.get(position));
    }

    @Override
    public int getItemCount() {
        return mArray==null?0:mArray.size();
    }

    public class AfternoonViewHolder extends RecyclerView.ViewHolder {
        public TextView textViewExpter;
        public TextView textViewDoWell;
        public TextView textViewCost;
        public Button buttonpur;
        public AfternoonViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind((Activity) mContext);
            textViewExpter = (TextView)itemView.findViewById(R.id.adpter_choicedate_text_expert);
            textViewDoWell =(TextView)itemView.findViewById(R.id.adpter_choicedate_text_well);
            textViewCost = (TextView)itemView.findViewById(R.id.adpter_choicedate_text_cost);
            buttonpur = (Button)itemView.findViewById(R.id.adpter_choicedate_botton_purchase);

        }
    }
}
