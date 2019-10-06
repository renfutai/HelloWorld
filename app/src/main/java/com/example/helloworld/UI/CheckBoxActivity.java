package com.example.helloworld.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.example.helloworld.R;

public class CheckBoxActivity extends AppCompatActivity {

    private CheckBox checkBox1, checkBox2;
    private Button button;
    private int int1 = 0, int2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        checkBox1 = findViewById(R.id.cb1);
        checkBox2 = findViewById(R.id.cb2);
        checkBox1.setOnCheckedChangeListener((compoundButton, b) -> int1 = b ? 1 : 0);
        checkBox2.setOnCheckedChangeListener((compoundButton, b) -> int2 = b ? 1 : 0);
        button = findViewById(R.id.cb_button);
        button.setOnClickListener(view -> {
            if (int1 == 0 && int2 == 0) {
                Toast.makeText(CheckBoxActivity.this, "没选中任何按钮", Toast.LENGTH_SHORT).show();
            } else if (int1 == 1 && int2 == 0) {
                Toast.makeText(CheckBoxActivity.this, "男", Toast.LENGTH_SHORT).show();

            } else if (int1 == 0 && int2 == 1) {
                Toast.makeText(CheckBoxActivity.this, "女", Toast.LENGTH_SHORT).show();

            } else if (int1 == 1 && int2 == 1) {
                Toast.makeText(CheckBoxActivity.this, "男 女", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
