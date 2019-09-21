package com.example.helloworld.broadcast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.helloworld.R;

public class BroadActivity1 extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broad2);
        button = findViewById(R.id.ab12_button);
        button.setOnClickListener(view -> {
            Intent intent = new Intent("com.skypan.update");
            LocalBroadcastManager.getInstance(BroadActivity1.this).sendBroadcast(intent);
            finish();
        });
    }
}
