package com.example.helloworld.recyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.helloworld.R;

public class GridAdapter extends RecyclerView.Adapter<GridAdapter.LinearViewHolder> {

    private Context mContext;
    private OnItemClickListener mListener;
    public GridAdapter(Context context, OnItemClickListener listener) {
        this.mContext = context;
        this.mListener = listener;
    }

    @NonNull
    @Override
    public GridAdapter.LinearViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new LinearViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_grid_item, parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull GridAdapter.LinearViewHolder holder, int position) {
        holder.textView.setText("hello");

        holder.itemView.setOnClickListener(view -> mListener.onClick(position));
    }

    @Override
    public int getItemCount() {
        return 81;
    }

    class LinearViewHolder extends RecyclerView.ViewHolder {
        private TextView textView;
        public LinearViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.recycler_lli_text);
        }
    }

    public interface OnItemClickListener {
        void onClick(int pos);
    }
}
