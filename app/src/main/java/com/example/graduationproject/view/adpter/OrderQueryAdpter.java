package com.example.graduationproject.view.adpter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.graduationproject.R;

import org.w3c.dom.Text;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class OrderQueryAdpter extends RecyclerView.Adapter<OrderQueryAdpter.OrderQueryViewHolder> {
    private LayoutInflater mLayoutInflater;
    private Context mContext;
    private List<String> mArray;

    public void setOnClickListener(OrderQueryAdpter.OnClickListener onClickListener){
        this.onClickListener = onClickListener;
    }

    public interface OnClickListener{
        void setOnClickListener(int pos,View view);
    }
    private OrderQueryAdpter.OnClickListener onClickListener;

    public OrderQueryAdpter(Context mContext,List<String> mArray) {
        this.mContext = mContext;
        this.mArray =mArray;
        this.mLayoutInflater = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public OrderQueryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new OrderQueryViewHolder(mLayoutInflater.inflate(R.layout.adpter_order_query_orderlist,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull OrderQueryViewHolder holder, int position) {
        holder.officeName.setText(mArray.get(position));
        holder.visitTime.setText(mArray.get(position));
        holder.doctorTitle.setText(mArray.get(position));
        if(onClickListener != null){
            holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onClickListener.setOnClickListener(position,holder.constraintLayout);
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return mArray==null?0:mArray.size();
    }

    public class OrderQueryViewHolder extends RecyclerView.ViewHolder{
         TextView officeName;
         TextView doctorTitle;
         TextView visitTime;
         ConstraintLayout constraintLayout;
        public OrderQueryViewHolder(@NonNull View itemView) {
            super(itemView);
            officeName = (TextView)itemView.findViewById(R.id.adpter_order_query_office_name);
            doctorTitle = (TextView) itemView.findViewById(R.id.adpter_order_query_office_title);
            visitTime = (TextView) itemView.findViewById(R.id.adpter_order_query_office_time);
            constraintLayout = (ConstraintLayout) itemView.findViewById(R.id.adpter_order_query_Conlayout1);

        }
    }
}
