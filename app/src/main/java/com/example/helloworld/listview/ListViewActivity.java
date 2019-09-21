package com.example.helloworld.listview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.helloworld.R;

public class ListViewActivity extends Activity {
    private ListView listView;//为什么这地方用as的推荐写法就闪退

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        listView = findViewById(R.id.mylistview);
        listView.setAdapter(new MyListAdapter(ListViewActivity.this));
        listView.setOnItemClickListener((adapterView, view, i, l) ->
                Toast.makeText(ListViewActivity.this, "点击 " + i, Toast.LENGTH_SHORT).show());
        listView.setOnItemLongClickListener((adapterView, view, i, l) -> {
            Toast.makeText(ListViewActivity.this, "长按 " + i, Toast.LENGTH_SHORT).show();
            return true;
        });
    }
}
