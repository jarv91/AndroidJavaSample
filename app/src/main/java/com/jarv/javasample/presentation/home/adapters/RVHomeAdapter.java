package com.jarv.javasample.presentation.home.adapters;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class RVHomeAdapter extends RecyclerView.Adapter<RVHomeAdapter.VHHome> {

    @NonNull
    @Override
    public VHHome onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull VHHome holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class VHHome extends RecyclerView.ViewHolder {

        public RecyclerView rvHomeItem;
        public VHHome(@NonNull RecyclerView itemView) {
            super(itemView);
            rvHomeItem = itemView;
            rvHomeItem.setLayoutManager(new LinearLayoutManager(itemView.getContext(), RecyclerView.HORIZONTAL, false));
            rvHomeItem.setAdapter(new RVHomeItemAdapter());
        }
    }
}
