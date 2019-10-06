package com.example.helloworld.UI;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.helloworld.R;

public class ProgressActivity extends AppCompatActivity {


    ProgressBar progressBar1;
    Button button1;
    Button mBtnProgressDialog1, mBtnProgressDialog2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);
        progressBar1 = findViewById(R.id.pd3);
        button1 = findViewById(R.id.ap_button1);
        mBtnProgressDialog1 = findViewById(R.id.ap_button2);
        mBtnProgressDialog2 = findViewById(R.id.ap_button3);
        button1.setOnClickListener(view -> handler.sendEmptyMessage(0));
        mBtnProgressDialog1.setOnClickListener(view -> {
            ProgressDialog progressDialog = new ProgressDialog(ProgressActivity.this);
            progressDialog.setTitle("提示");
            progressDialog.setMessage("正在加载");
            progressDialog.setOnCancelListener(dialogInterface ->
                    Toast.makeText(ProgressActivity.this, "canael.....", Toast.LENGTH_SHORT).show()
            );
            progressDialog.show();
        });
    }

    //不知道为啥加上他才没有黄色警告线
    @SuppressLint("HandlerLeak")
    Handler handler = new Handler() {
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            if (progressBar1.getProgress() < 100) {
                handler.postDelayed(runnable, 500);
            } else {
                Toast.makeText(ProgressActivity.this, "加载完成", Toast.LENGTH_SHORT).show();
            }
        }
    };

    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            progressBar1.setProgress(progressBar1.getProgress() + 5);
            handler.sendEmptyMessage(0);
        }
    };
}
