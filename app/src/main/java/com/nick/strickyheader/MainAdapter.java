package com.nick.strickyheader;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

/**
 * @author nick
 * @date 2019/8/22 0022
 * @Description
 */
public class MainAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context mContext;
    ArrayList<String> data;
    public MainAdapter(Context mContext) {
        this.mContext = mContext;
    }

    public void setData(ArrayList<String> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHoder(LayoutInflater.from(mContext).inflate(R.layout.item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return  data== null? 0:data.size();
    }
    class MyViewHoder extends RecyclerView.ViewHolder{
        TextView tvContent;
        public MyViewHoder(@NonNull View itemView) {
            super(itemView);
            tvContent = itemView.findViewById(R.id.textView);
        }
    }
}
