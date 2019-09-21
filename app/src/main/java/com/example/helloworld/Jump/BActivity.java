package com.example.helloworld.Jump;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.helloworld.R;

public class BActivity extends AppCompatActivity {

    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        textView = findViewById(R.id.ab_tv);
        Bundle bundle = getIntent().getExtras();
        String s = bundle.getString("name");
        int i = bundle.getInt("number");
        textView.setText(s + i);
        button = findViewById(R.id.ab_button);
        button.setOnClickListener(view -> {
            Intent intent = new Intent();
            Bundle bundle1 = new Bundle();
            bundle1.putString("title", "我回来了");
            intent.putExtras(bundle1);
            setResult(Activity.RESULT_OK, intent);
            finish();
        });
    }
}
