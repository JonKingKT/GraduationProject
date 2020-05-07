package com.example.graduationproject.view.adpter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ForenoonChoiceAdpter extends RecyclerView.Adapter<ForenoonChoiceAdpter.ForenoonViewHolder> {
    @NonNull
    @Override
    public ForenoonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ForenoonViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ForenoonViewHolder extends RecyclerView.ViewHolder {
        public ForenoonViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
