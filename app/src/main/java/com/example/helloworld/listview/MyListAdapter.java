package com.example.helloworld.listview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.helloworld.R;

public class MyListAdapter extends BaseAdapter {

    private Context mContext;
    private LayoutInflater mLayoutInflater;
    private int i=0;

    public MyListAdapter(Context context) {
         this.mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return 10;//大小代表列表的行数
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    static class ViewHolder {
        public ImageView imageView;
        public TextView textView1, textView2, textView3;
    }

    @SuppressLint("SetTextI18n")//消除61-64行警告 原因未知
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if(view==null){
            view=mLayoutInflater.inflate(R.layout.activity_list_item,null);
            holder = new ViewHolder();
            holder.imageView=view.findViewById(R.id.li_lv);
            holder.textView1=view.findViewById(R.id.li_tv1);
            holder.textView2=view.findViewById(R.id.li_tv2);
            holder.textView3=view.findViewById(R.id.li_tv3);
            view.setTag(holder);
        }else {
            holder=(ViewHolder)view.getTag();
        }
        holder.textView1.setText("这是标题"+i);
        holder.textView2.setText("这是时间"+i);
        holder.textView3.setText("这是内容"+i);
        i++;
        Glide.with(mContext).load("https://img-prod-cms-rt-microsoft-com.akamaized.net/cms/api/am/imageFileData/RE1Mu3b?ver=5c31").into(holder.imageView);
        return view;
    }
}
