package com.example.helloworld.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.helloworld.R;

public class RedioButtonActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private Button button;
    private String string = "男";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redio_button);
        radioGroup = findViewById(R.id.radio_group1);
        button = findViewById(R.id.radio_button1);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton radioButton = findViewById(i);
                string=(String)radioButton.getText();
            }
        });
        button.setOnClickListener(view -> {
            Toast.makeText(RedioButtonActivity.this,string,Toast.LENGTH_SHORT).show();
        });
    }
}
