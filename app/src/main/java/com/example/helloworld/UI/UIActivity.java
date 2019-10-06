package com.example.helloworld.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.helloworld.R;
import com.example.helloworld.gidView.GridViewActivity;
import com.example.helloworld.listview2.ListView2Activity;

public class UIActivity extends AppCompatActivity {

    private Button mBtnButton, mBtnTextView, mBtnEditText, mBtnRediobutton, mBtnCheckBox, mBtnImageView;
    private Button mBtnListView, mBtnListView2, mBtnGridView, mBtnRecyclerView, mBtnWebView;
    private Button mBtnToast,mBtnDialog,mBtnProgress,mBtnCustomDialog, mBtnPopupWindowActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui);
        mBtnTextView = findViewById(R.id.bottom_textview);
        mBtnTextView.setOnClickListener(view -> {
            Intent intent = new Intent(UIActivity.this, ActivityTextView.class);
            startActivity(intent);
        });
        mBtnButton = findViewById(R.id.bottom_botton);
        mBtnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UIActivity.this, ActivityButton.class);
                startActivity(intent);
            }
        });
        mBtnEditText = findViewById(R.id.bottom_edittext);
        mBtnEditText.setOnClickListener(view -> {
            Intent intent = new Intent(UIActivity.this, EditTextActivity.class);
            startActivity(intent);

        });
        mBtnRediobutton = findViewById(R.id.bottom_Rediobutton);
        mBtnRediobutton.setOnClickListener(view -> {
            Intent intent = new Intent(UIActivity.this, RedioButtonActivity.class);
            startActivity(intent);
        });
        mBtnCheckBox = findViewById(R.id.bottom_CheckBox);
        mBtnCheckBox.setOnClickListener(view -> {
            Intent intent = new Intent(UIActivity.this, CheckBoxActivity.class);
            startActivity(intent);
        });
        mBtnImageView = findViewById(R.id.bottom_ImageView);
        mBtnImageView.setOnClickListener(view -> {
            Intent intent = new Intent(UIActivity.this, ImageViewActivity.class);
            startActivity(intent);
        });
        mBtnListView = findViewById(R.id.bottom_ListView);
        mBtnListView.setOnClickListener(view -> {
            Intent intent = new Intent(UIActivity.this, com.example.helloworld.listview.ListViewActivity.class);
            startActivity(intent);
        });
        mBtnListView2 = findViewById(R.id.bottom_ListView2);
        mBtnListView2.setOnClickListener(view -> {
            Intent intent = new Intent(UIActivity.this, ListView2Activity.class);
            startActivity(intent);
        });
        mBtnGridView = findViewById(R.id.bottom_GridView);
        mBtnGridView.setOnClickListener(view -> {
            Intent intent = new Intent(UIActivity.this, GridViewActivity.class);
            startActivity(intent);
        });
        mBtnRecyclerView = findViewById(R.id.bottom_RecycleView);
        mBtnRecyclerView.setOnClickListener(view -> {
            Intent intent = new Intent(UIActivity.this, com.example.helloworld.recyclerView.RecyclerViewActivity.class);
            startActivity(intent);
        });
        mBtnWebView = findViewById(R.id.bottom_WebViewView);
        mBtnWebView.setOnClickListener(view -> {
            Intent intent = new Intent(UIActivity.this, WebViewActivity.class);
            startActivity(intent);
        });
        mBtnToast = findViewById(R.id.bottom_Toast);
        mBtnToast.setOnClickListener(view -> {
            Intent intent = new Intent(UIActivity.this, ToastActivity.class);
            startActivity(intent);
        });
        mBtnDialog = findViewById(R.id.bottom_Dialog);
        mBtnDialog.setOnClickListener(view -> {
            Intent intent = new Intent(UIActivity.this, DialogActivity.class);
            startActivity(intent);
        });
        mBtnProgress = findViewById(R.id.bottom_Progress);
        mBtnProgress.setOnClickListener(view -> {
            Intent intent = new Intent(UIActivity.this, ProgressActivity.class);
            startActivity(intent);
        });
        mBtnCustomDialog = findViewById(R.id.bottom_CustomDialog);
        mBtnCustomDialog.setOnClickListener(view -> {
            Intent intent = new Intent(UIActivity.this, CustomDialogActivity.class);
            startActivity(intent);
        });
        mBtnPopupWindowActivity = findViewById(R.id.bottom_PopupWindowActivity);
        mBtnPopupWindowActivity.setOnClickListener(view -> {
            Intent intent = new Intent(UIActivity.this, PopupWindowActivity.class);
            startActivity(intent);
        });
    }
}
