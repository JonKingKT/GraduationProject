package com.example.graduationproject.view.adpter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DateChoiceAdpter extends RecyclerView.Adapter<DateChoiceAdpter.DateChoiceHolder> {


    @NonNull
    @Override
    public DateChoiceHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull DateChoiceHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class DateChoiceHolder extends RecyclerView.ViewHolder {

        public DateChoiceHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
