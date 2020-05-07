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

public class HomeTypeFragmentAdpter extends RecyclerView.Adapter<HomeTypeFragmentAdpter.TextHomeHolder> {

    private final LayoutInflater mLayoutInflater;
    private  final Context mContext;
    private final ArrayList<String>  mArray;
    public interface OnClickListener{
        void setClickiItem(int pos ,View view);
        void setLongClickItem(int pos,View view);
    }
    private OnClickListener onClickListener;
    public void setItemObclickLstener(HomeTypeFragmentAdpter.OnClickListener onClickListener){
        this.onClickListener = onClickListener;
    }

    public HomeTypeFragmentAdpter(Context mContext, ArrayList<String> mArray) {
        this.mLayoutInflater = LayoutInflater.from(mContext);
        this.mContext = mContext;
        this.mArray = mArray;
    }


    @NonNull
    @Override
    public TextHomeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new HomeTypeFragmentAdpter.TextHomeHolder(mLayoutInflater.inflate(R.layout.adpter_texthome_left_item,parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull final TextHomeHolder holder, int position) {
        holder.mTextView.setText(mArray.get(position));
        if(onClickListener != null){
            holder.mTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int pos = holder.getLayoutPosition();
                    onClickListener.setClickiItem(pos,holder.mTextView);
                }
            });

            holder.mTextView.setOnLongClickListener(new View.OnLongClickListener(){
                @Override
                public boolean onLongClick(View v) {
                    int pos = holder.getLayoutPosition();
                    onClickListener.setLongClickItem(pos,holder.mTextView);
                    return false;
                }
            });
        }
    }


    @Override
    public int getItemCount() {
        return mArray == null ? 0 : mArray.size();
    }

    public class TextHomeHolder extends RecyclerView.ViewHolder {
        TextView mTextView;
        public TextHomeHolder(@NonNull View itemView) {
            super(itemView);
            mTextView = (TextView)itemView.findViewById(R.id.text_home_item);
        }
    }
}
