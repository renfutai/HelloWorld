package com.example.helloworld.recyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.helloworld.R;

public class puAdapter extends RecyclerView.Adapter<puAdapter.LinearViewHolder> {

    private Context mContext;
    private OnItemClickListener mListener;
    public puAdapter(Context context, OnItemClickListener listener) {
        this.mContext = context;
        this.mListener = listener;
    }

    @NonNull
    @Override
    public puAdapter.LinearViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new LinearViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_pu_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull puAdapter.LinearViewHolder holder, int position) {
        if(position%4==0){
            holder.imageView.setImageResource(R.drawable.flower);
        }else if(position%4==1){
            holder.imageView.setImageResource(R.drawable.bg3);
        }else if(position%4==2){
            holder.imageView.setImageResource(R.drawable.ironman);
        }else {
            holder.imageView.setImageResource(R.drawable.bg1);
        }

        holder.itemView.setOnClickListener(view -> mListener.onClick(position));
    }

    @Override
    public int getItemCount() {
        return 40;
    }

    class LinearViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        public LinearViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.lhi);
        }
    }

    public interface OnItemClickListener {
        void onClick(int pos);
    }
}
