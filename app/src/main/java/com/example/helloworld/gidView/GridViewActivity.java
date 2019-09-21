package com.example.helloworld.gidView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.helloworld.R;

public class GridViewActivity extends AppCompatActivity {
    private GridView mGv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
        mGv = findViewById(R.id.gridview);
        mGv.setAdapter(new MyGridViewAdpater(GridViewActivity.this));
        mGv.setOnItemClickListener((adapterView, view, i, l) ->
                Toast.makeText(GridViewActivity.this, "点击 " + i, Toast.LENGTH_SHORT).show());
        mGv.setOnItemLongClickListener((adapterView, view, i, l) -> {
            Toast.makeText(GridViewActivity.this, "长按 " + i, Toast.LENGTH_SHORT).show();
            return true;
        });
    }
}