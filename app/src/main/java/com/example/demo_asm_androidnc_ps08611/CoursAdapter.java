package com.example.demo_asm_androidnc_ps08611;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CoursAdapter extends RecyclerView.Adapter<CoursHolder> {
    private Context context;
    private List<Cours> coursList;
    private CoursDAO coursDAO;


    public CoursAdapter(Context context, List<Cours> coursList) {
        this.context = context;
        this.coursList = coursList;
    }

    @NonNull
    @Override
    public CoursHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.rvcours,parent,false);
        CoursHolder coursHolder=new CoursHolder(view);
        return coursHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CoursHolder holder, int position) {

        coursDAO=new CoursDAO(context);
        holder.tvText.setText("name Cours"+coursList.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
