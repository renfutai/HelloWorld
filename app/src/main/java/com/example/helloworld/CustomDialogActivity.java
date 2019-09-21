package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.example.helloworld.widget.CustomDialog;

public class CustomDialogActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_dialog);
        button = findViewById(R.id.acd_button);
        button.setOnClickListener(view -> {
            CustomDialog customDialog = new CustomDialog(CustomDialogActivity.this);
            customDialog.setStringTextView1("提示").setStringTextView2("确认删除此项？")
                    .setStringTextView3("确定", dialog ->
                            Toast.makeText(CustomDialogActivity.this, "确定......", Toast.LENGTH_SHORT).show())
                    .setStringTextView4("取消",dialog ->
                            Toast.makeText(CustomDialogActivity.this, "取消......", Toast.LENGTH_SHORT).show())
                    .show();
        });
    }
}
   