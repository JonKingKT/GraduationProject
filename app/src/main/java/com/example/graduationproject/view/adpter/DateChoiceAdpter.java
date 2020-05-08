package com.example.graduationproject.view.adpter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.graduationproject.R;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.ButterKnife;

public class DateChoiceAdpter extends RecyclerView.Adapter<DateChoiceAdpter.DateChoiceHolder> {
    private final LayoutInflater mLayoutInflater;
    private final Context mContext;
    private final List<String> mArray;
    private AfternoonChoiceAdpter.onItemClickListener itemClickListener;

    public interface onItemClickListener{
        void setItemClick(View view,int pos);
    }
    public  DateChoiceAdpter(Context mContext, List<String> list){
        this.mLayoutInflater = LayoutInflater.from(mContext);
        this.mContext = mContext;
        this.mArray = list;
    }
    @NonNull
    @Override
    public DateChoiceHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new DateChoiceAdpter.DateChoiceHolder(mLayoutInflater.inflate(R.layout.adpter_choice_date_datechoice,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull DateChoiceHolder holder, int position) {
        holder.textViewWeek.setText( mArray.get(position));
        holder.textViewBool.setText( mArray.get(position));
        holder.textViewDate.setText(mArray.get(position));
    }

    @Override
    public int getItemCount() {
        return mArray==null?0:mArray.size();
    }

    public class DateChoiceHolder extends RecyclerView.ViewHolder {

        public TextView textViewDate;
        public TextView textViewWeek;
        public TextView textViewBool;
        public DateChoiceHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind((Activity) mContext);
            textViewBool = (TextView)itemView.findViewById(R.id.adpter_choicedate_text_bool);
            textViewDate =(TextView)itemView.findViewById(R.id.adpter_choicedate_text_date);
            textViewWeek = (TextView)itemView.findViewById(R.id.adpter_choicedate_text_week);

        }
    }
}
