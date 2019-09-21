package com.example.helloworld.Event;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.helloworld.ActivityButton;
import com.example.helloworld.R;

public class EventActivity extends AppCompatActivity implements View.OnClickListener {

//    Button button;
        Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
//        button=findViewById(R.id.ae_button);
//        button.setOnClickListener(new MyOnClick(EventActivity.this));
        button1=findViewById(R.id.ae_button1);
        button1.setOnClickListener(view -> {
            Intent intent=new Intent(EventActivity.this, HanderActivity.class);
            startActivity(intent);
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.ae_button:
                Toast.makeText(EventActivity.this,"onClick..",Toast.LENGTH_SHORT).show();
                break;
        }
    }

    class onClick implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.ae_button:
                    Toast.makeText(EventActivity.this,"onClick.",Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    }
    public void myshow(View view){
        switch (view.getId()){
            case R.id.ae_button:
                Toast.makeText(EventActivity.this,"onClick....",Toast.LENGTH_SHORT).show();
                break;
        }
    }

}
