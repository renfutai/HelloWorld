package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ToastActivity extends AppCompatActivity {

    private Button button1, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);
        button1 = findViewById(R.id.toast_button1);
        button2 = findViewById(R.id.toast_button2);
        button3 = findViewById(R.id.toast_button3);
        OnClick onClick = new OnClick();
        button1.setOnClickListener(onClick);
        button2.setOnClickListener(onClick);
        button3.setOnClickListener(onClick);

    }

    class OnClick implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.toast_button1:
                    Toast.makeText(ToastActivity.this, "正常", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.toast_button2:
                    Toast toastCenter = Toast.makeText(getApplicationContext(), "居中", Toast.LENGTH_SHORT);
                    toastCenter.setGravity(Gravity.CENTER, 0, 0);
                    toastCenter.show();
                    break;
                case R.id.toast_button3:
                    Toast toastCustom = new Toast(getApplicationContext());
                    LayoutInflater inflater = LayoutInflater.from(ToastActivity.this);
                    View view1 = inflater.inflate(R.layout.layout_toast_item, null);
                    ImageView imageView = view1.findViewById(R.id.lti_imageview);
                    TextView textView = view1.findViewById(R.id.lti_TextView);
                    imageView.setImageResource(R.drawable.bg1);
                    textView.setText("自定义");
                    toastCustom.setView(view1);
                    toastCustom.setDuration(Toast.LENGTH_LONG);
                    toastCustom.show();
                    break;

            }
        }
    }
}
