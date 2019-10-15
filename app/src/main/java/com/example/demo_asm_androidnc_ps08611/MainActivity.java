package com.example.demo_asm_androidnc_ps08611;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openCours(View view) {
        Intent intent=new Intent(MainActivity.this,CoursActivity.class);
        startActivity(intent);
    }
}
