package com.example.helloworld.recyclerView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.helloworld.R;

public class RecyclerViewActivity extends AppCompatActivity {

    private Button mBtnLinearRecycler;
    private Button mBtnHor;
    private Button mBtnGri;
    private Button mBtnPu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        mBtnLinearRecycler = findViewById(R.id.recycler_arv_button1);
        mBtnLinearRecycler.setOnClickListener(view -> {
            Intent intent = new Intent(RecyclerViewActivity.this, LinearRecyclerViewActivity.class);
            startActivity(intent);
        });
        mBtnHor = findViewById(R.id.recycler_arv_button2);
        mBtnHor.setOnClickListener(view -> {
            Intent intent = new Intent(RecyclerViewActivity.this, HorRecyclerViewActivity.class);
            startActivity(intent);
        });
        mBtnGri = findViewById(R.id.recycler_arv_button3);
        mBtnGri.setOnClickListener(view -> {
            Intent intent = new Intent(RecyclerViewActivity.this, GridRecyclerViewActivity.class);
            startActivity(intent);
        });
        mBtnPu = findViewById(R.id.recycler_arv_button4);
        mBtnPu.setOnClickListener(view -> {
            Intent intent = new Intent(RecyclerViewActivity.this, PuRecyclerViewActivity.class);
            startActivity(intent);
        });
    }
}
