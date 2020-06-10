package com.example.graduationproject.view.adpter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.graduationproject.R;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class OfficeDoctorInfoAdpter extends RecyclerView.Adapter<OfficeDoctorInfoAdpter.OfficeDoctorInfoViewHolder> {
    private final LayoutInflater mLayoutInflater;
    private final Context mContext;
    private final List<String> mArray;

    public OfficeDoctorInfoAdpter(Context mContext,List<String> mArray) {
        this.mArray = mArray;
        this.mContext = mContext;
        this.mLayoutInflater = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public OfficeDoctorInfoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new OfficeDoctorInfoAdpter.OfficeDoctorInfoViewHolder(mLayoutInflater.inflate(R.layout.adpter_officeinfo_doctorinfo,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull OfficeDoctorInfoViewHolder holder, int position) {
        holder.docName.setText(mArray.get(position));
        holder.docJob.setText(mArray.get(position));
    }

    @Override
    public int getItemCount() {
        return mArray==null?0:mArray.size();
    }

    public static class OfficeDoctorInfoViewHolder extends RecyclerView.ViewHolder {
        public TextView docName;
        public TextView docJob;
        public ImageView docImage;
        public OfficeDoctorInfoViewHolder(@NonNull View itemView) {
            super(itemView);
            docImage = (ImageView)itemView.findViewById(R.id.adpter_office_info_docImage);
            docJob  = (TextView) itemView.findViewById(R.id.adpter_office_info_docJob);
            docName = (TextView) itemView.findViewById(R.id.adpter_office_info_doctorName);
        }
    }
}
