package com.example.helloworld.fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.helloworld.R;

public class ContainerActivity extends AppCompatActivity implements AFragment.IOnMessageClick {

    private AFragment aFragment;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);
        aFragment = AFragment.newInstance("我是数据");
        getFragmentManager().beginTransaction().add(R.id.ac_fl, aFragment).commitAllowingStateLoss();
        textView = findViewById(R.id.ac_tv);
    }

    @Override
    public void onClick(String s) {
        textView.setText(s);
    }
}
