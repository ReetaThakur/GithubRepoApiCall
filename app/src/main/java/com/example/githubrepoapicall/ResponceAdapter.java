package com.example.githubrepoapicall;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ResponceAdapter extends RecyclerView.Adapter<ResponceViewHolder> {
    private List<ResponseModel> modelList;
    public ResponceAdapter(List<ResponseModel> modelList){
        this.modelList=modelList;
    }

    @Override
    public ResponceViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new ResponceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ResponceViewHolder holder, int position) {
        ResponseModel model=modelList.get(position);
        holder.setData(model);

    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }
}
