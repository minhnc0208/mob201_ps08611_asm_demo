package com.example.demo_asm_androidnc_ps08611;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CoursHolder extends RecyclerView.ViewHolder {
    public TextView tvText;
    public CoursHolder(@NonNull View itemView) {
        super(itemView);
        tvText=itemView.findViewById(R.id.tvText);
    }
}
