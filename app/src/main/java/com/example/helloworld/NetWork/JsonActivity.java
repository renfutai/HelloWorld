package com.example.helloworld.NetWork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.helloworld.R;

public class JsonActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button1, button2, button3, button4;
    private TextView textView1, textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json);
        findAndSetView();

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.aj_btn1:
                break;
            case R.id.aj_btn2:
                break;
            case R.id.aj_btn3:
                break;
            case R.id.aj_btn4:
                break;
        }

    }

    private void findAndSetView() {

        button1 = findViewById(R.id.aj_btn1);
        button1.setOnClickListener(this);

        button2 = findViewById(R.id.aj_btn2);
        button2.setOnClickListener(this);

        button3 = findViewById(R.id.aj_btn3);
        button3.setOnClickListener(this);

        button4 = findViewById(R.id.aj_btn4);
        button4.setOnClickListener(this);

        textView1 = findViewById(R.id.aj_tv1);
        textView2 = findViewById(R.id.aj_tv2);
    }
}