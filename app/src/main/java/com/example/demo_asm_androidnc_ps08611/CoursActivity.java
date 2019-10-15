package com.example.demo_asm_androidnc_ps08611;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CoursActivity extends AppCompatActivity {
    private CoursDAO coursDao;
    private TextView tvText;
    private RecyclerView rvCours;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cours);
        tvText = findViewById(R.id.tvText);
    }

    public void ShowYourCours(View view) {
        Intent intent = new Intent(CoursActivity.this, YourCoursActivity.class);
        startActivity(intent);
    }

    public void Cours1(View view) {
        AlertDialog.Builder alerDialog = new AlertDialog.Builder(this);
        alerDialog.setView(R.layout.activity_cours1_detail);
        AlertDialog alertDialog1 = alerDialog.show();
    }

    public void AddCours1(View view) {
        coursDao = new CoursDAO(CoursActivity.this);
        List<Cours> coursList = coursDao.selectCours();
        CoursAdapter coursAdapter = new CoursAdapter(CoursActivity.this, coursList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager((CoursActivity.this));
        rvCours.setLayoutManager(linearLayoutManager);
        rvCours.setAdapter(coursAdapter);
    }


}
