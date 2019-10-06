package com.example.helloworld.NetWork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.helloworld.R;

public class NetWorkActivity extends AppCompatActivity {

    private Button button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_net_work);
        button1=findViewById(R.id.anw_button);
        button2=findViewById(R.id.anw_button2);
        button1.setOnClickListener(view -> {
            Intent intent=new Intent(NetWorkActivity.this,OKHttpActivity.class);
            startActivity(intent);
        });
        button2.setOnClickListener(view -> {
            Intent intent=new Intent(NetWorkActivity.this,JsonActivity.class);
            startActivity(intent);
        });
    }
}
