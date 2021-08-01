package com.example.githubrepoapicall;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

public class ResponceViewHolder extends RecyclerView.ViewHolder {
    private TextView name;
    private TextView login;
    private TextView description;
    public ResponceViewHolder(@NonNull @NotNull View itemView) {
        super(itemView);
        name=itemView.findViewById(R.id.name);
        login=itemView.findViewById(R.id.login);
        description=itemView.findViewById(R.id.description);
    }
    public void setData(ResponseModel model){
        name.setText(model.getFullName());
        login.setText(model.getId()+"");
        description.setText(model.getName());
    }
}
