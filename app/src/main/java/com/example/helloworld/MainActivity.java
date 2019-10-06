package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.helloworld.Event.EventActivity;
import com.example.helloworld.Jump.AActivity;
import com.example.helloworld.NetWork.NetWorkActivity;
import com.example.helloworld.UI.UIActivity;
import com.example.helloworld.broadcast.BroadActivity;
import com.example.helloworld.datastorage.DataStorageActivity;
import com.example.helloworld.fragment.ContainerActivity;

public class MainActivity extends AppCompatActivity {

    private Button mBtnUI, mBtmACTIVITY, mBtnFragment, mBtnEvent, mBtnData,mBtnBroad,mBtnNetwork;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnUI = findViewById(R.id.am_UI);
        mBtnUI.setOnClickListener(view -> {
                    Intent intent = new Intent(MainActivity.this, UIActivity.class);
                    startActivity(intent);
                }
        );
        mBtmACTIVITY = findViewById(R.id.am_activity);
        mBtmACTIVITY.setOnClickListener(view -> {
                    Intent intent = new Intent(MainActivity.this, AActivity.class);
                    startActivity(intent);
                }
        );
        mBtnFragment = findViewById(R.id.am_fragment);
        mBtnFragment.setOnClickListener(view -> {
                    Intent intent = new Intent(MainActivity.this, ContainerActivity.class);
                    startActivity(intent);
                }
        );
        mBtnEvent = findViewById(R.id.am_Event);
        mBtnEvent.setOnClickListener(view -> {
                    Intent intent = new Intent(MainActivity.this, EventActivity.class);
                    startActivity(intent);
                }
        );
        mBtnData = findViewById(R.id.am_Data);
        mBtnData.setOnClickListener(view -> {
                    Intent intent = new Intent(MainActivity.this, DataStorageActivity.class);
                    startActivity(intent);
                }
        );
        mBtnBroad = findViewById(R.id.am_broad);
        mBtnBroad.setOnClickListener(view -> {
                    Intent intent = new Intent(MainActivity.this, BroadActivity.class);
                    startActivity(intent);
                }
        );
        mBtnNetwork = findViewById(R.id.am_network);
        mBtnNetwork.setOnClickListener(view -> {
                    Intent intent = new Intent(MainActivity.this, NetWorkActivity.class);
                    startActivity(intent);
                }
        );
    }
}
