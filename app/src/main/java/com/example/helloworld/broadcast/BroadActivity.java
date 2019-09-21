package com.example.helloworld.broadcast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.helloworld.R;

public class BroadActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private MyBroadcast myBroadcast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broad);
        button = findViewById(R.id.ab1_button);
        button.setOnClickListener(view -> {
            Intent intent = new Intent(BroadActivity.this, BroadActivity1.class);
            startActivity(intent);
        });

        textView = findViewById(R.id.ab1_tv);

        myBroadcast = new MyBroadcast();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.skypan.update");
        LocalBroadcastManager.getInstance(this).registerReceiver(myBroadcast, intentFilter);
    }

    private class MyBroadcast extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            switch (intent.getAction()) {
                case "com.skypan.update":
                    textView.setText("123");
                    break;
            }
        }
    }
}
