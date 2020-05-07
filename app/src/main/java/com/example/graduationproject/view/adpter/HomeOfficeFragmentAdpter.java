package com.example.graduationproject.view.adpter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.graduationproject.R;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HomeOfficeFragmentAdpter extends RecyclerView.Adapter<HomeOfficeFragmentAdpter.HomeTypeHolder> {
    private final LayoutInflater mLayoutInflater;
    private final Context mContext;
    private final ArrayList<String> mArray;
    private  onItemClickListener itemClickListener;
    public interface onItemClickListener{
        void setItemClick(View view,int pos);
        void setItemLongClick(View view,int pos);
    }
    public void setOnClickListener(onItemClickListener itemClickListener){
        this.itemClickListener = itemClickListener;
    };

    public HomeOfficeFragmentAdpter(Context mContext, ArrayList<String> mArray) {
        this.mLayoutInflater = LayoutInflater.from(mContext);
        this.mContext = mContext;
        this.mArray = mArray;
    }

    @NonNull
    @Override
    public HomeTypeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new HomeOfficeFragmentAdpter.HomeTypeHolder(mLayoutInflater.inflate(R.layout.adpter_texthome_left_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull final HomeTypeHolder holder, final int position) {
        holder.mTextView.setText(mArray.get(position));
        if(itemClickListener != null){
            holder.mTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    itemClickListener.setItemClick(holder.mTextView,position);
                }
            });

            holder.mTextView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    itemClickListener.setItemLongClick(holder.itemView,position);
                    return false;
                }
            });
        }
    }


    @Override
    public int getItemCount() {
        return 0;
    }

    class HomeTypeHolder extends RecyclerView.ViewHolder{
        private TextView mTextView;
         HomeTypeHolder(@NonNull View itemView) {
            super(itemView);
            mTextView = itemView.findViewById(R.id.text_home_item);
        }
    }

}
