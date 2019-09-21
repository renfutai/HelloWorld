package com.example.helloworld.recyclerView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.helloworld.R;
import com.example.helloworld.gidView.GridViewActivity;

public class GridRecyclerViewActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_recycler_view);
        recyclerView = findViewById(R.id.agrv);
        recyclerView.setLayoutManager(new GridLayoutManager(GridRecyclerViewActivity.this, 3));
        recyclerView.addItemDecoration(new MyDecoration());
        recyclerView.setAdapter(new GridAdapter(GridRecyclerViewActivity.this, pos ->
                Toast.makeText(GridRecyclerViewActivity.this, "点击" + pos, Toast.LENGTH_SHORT).show()
        ));
    }

    class MyDecoration extends RecyclerView.ItemDecoration {
        @Override
        public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
            super.getItemOffsets(outRect, view, parent, state);
            int i=getResources().getDimensionPixelOffset(R.dimen.dividerHeight);
            outRect.set(i,0,i,i);
        }
    }

}
