package com.example.helloworld.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import com.example.helloworld.R;

public class PopupWindowActivity extends AppCompatActivity {

    private Button button;
    private PopupWindow popupWindow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_window);
        button = findViewById(R.id.apw_button);
        button.setOnClickListener(view -> {
            View view1 = getLayoutInflater().inflate(R.layout.layout_popup, null);
//            TextView textView = view1.findViewById(R.id.lp_textview);
//            textView.setOnClickListener(view2 -> {
//                popupWindow.dismiss();
//                Toast.makeText(PopupWindowActivity.this, "好", Toast.LENGTH_SHORT).show();
//            });
            popupWindow = new PopupWindow(view1, 200, ViewGroup.LayoutParams.WRAP_CONTENT);
//            popupWindow.setOutsideTouchable(true);
//            popupWindow.setFocusable(true);
            popupWindow.showAsDropDown(button);
        });
    }
}
