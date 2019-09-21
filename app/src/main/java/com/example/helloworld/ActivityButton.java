package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityButton extends AppCompatActivity {

    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        button3 = (Button)findViewById(R.id.bottom3);
        button3.setOnClickListener(view -> {
                Toast.makeText(ActivityButton.this, "按钮3被点击了", Toast.LENGTH_SHORT).show();
        });
    }

    public void showToast(View view) {
        Toast.makeText(this, "按钮4被点击了", Toast.LENGTH_SHORT).show();
    }
}
