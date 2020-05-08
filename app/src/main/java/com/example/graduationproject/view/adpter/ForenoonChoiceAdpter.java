package com.example.graduationproject.view.adpter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.graduationproject.R;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.ButterKnife;

public class ForenoonChoiceAdpter extends RecyclerView.Adapter<ForenoonChoiceAdpter.ForenoonViewHolder> {
    private LayoutInflater mLayoutInflater;
    private Context mContext;
    private List<String> mArray;

    public interface OnClickListener{
       void setOnClickListener(int pos,View view);
    }
    private OnClickListener onClickListener;

    public ForenoonChoiceAdpter(Context mContext,List<String> mList){
        this.mLayoutInflater = LayoutInflater.from(mContext);
        this.mContext = mContext;
        this.mArray = mList;
    }


    @NonNull
    @Override
    public ForenoonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ForenoonViewHolder(mLayoutInflater.inflate(R.layout.adpter_choice_date_guahao,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ForenoonViewHolder holder, int position) {
        holder.textViewExpter.setText( mArray.get(position));
        holder.textViewDoWell.setText( mArray.get(position));
        holder.textViewCost.setText(mArray.get(position));
        holder.buttonpur.setText(mArray.get(position));
    }

    @Override
    public int getItemCount() {
        return mArray==null?0:mArray.size();
    }

    class ForenoonViewHolder extends RecyclerView.ViewHolder {
         TextView textViewExpter;
         TextView textViewDoWell;
         TextView textViewCost;
         Button buttonpur;
         ForenoonViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind((Activity) mContext);
            textViewExpter = (TextView)itemView.findViewById(R.id.adpter_choicedate_text_expert);
            textViewDoWell =(TextView)itemView.findViewById(R.id.adpter_choicedate_text_well);
            textViewCost = (TextView)itemView.findViewById(R.id.adpter_choicedate_text_cost);
            buttonpur = (Button)itemView.findViewById(R.id.adpter_choicedate_botton_purchase);
    }
}
}
