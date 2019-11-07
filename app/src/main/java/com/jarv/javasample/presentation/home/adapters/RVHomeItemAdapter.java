package com.jarv.javasample.presentation.home.adapters;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RVHomeItemAdapter extends RecyclerView.Adapter<RVHomeItemAdapter.VHHomeItem> {

    @NonNull
    @Override
    public VHHomeItem onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull VHHomeItem holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class VHHomeItem extends RecyclerView.ViewHolder {

        public VHHomeItem(@NonNull View itemView) {
            super(itemView);
        }
    }
}
