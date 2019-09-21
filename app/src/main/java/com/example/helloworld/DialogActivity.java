package com.example.helloworld;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.Toast;

public class DialogActivity extends AppCompatActivity {
    private Button button1, button2, button3, button4, button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        button1 = findViewById(R.id.ad_button1);
        button2 = findViewById(R.id.ad_button2);
        button3 = findViewById(R.id.ad_button3);
        button4 = findViewById(R.id.ad_button4);
        button5 = findViewById(R.id.ad_button5);
        MyOnClick myOnClick = new MyOnClick();
        button1.setOnClickListener(myOnClick);
        button2.setOnClickListener(myOnClick);
        button3.setOnClickListener(myOnClick);
        button4.setOnClickListener(myOnClick);
        button5.setOnClickListener(myOnClick);
    }

    class MyOnClick implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.ad_button1:
                    AlertDialog.Builder builder = new AlertDialog.Builder(DialogActivity.this);
                    builder.setTitle("请回答").
                            setMessage("你觉得课程如何?").
                            setIcon(R.drawable.bg1).//设置图片
                            setPositiveButton("棒", (dialogInterface, i) ->
                            Toast.makeText(DialogActivity.this, "你很诚实", Toast.LENGTH_SHORT).show()).
                            setNeutralButton("还行", (dialog, which) ->
                                    Toast.makeText(DialogActivity.this, "你在瞅瞅", Toast.LENGTH_SHORT).show()).
                            setNegativeButton("不好", (dialog, which) ->
                                    Toast.makeText(DialogActivity.this, "睁眼说瞎话", Toast.LENGTH_SHORT).show()).
                            show();
                    break;
                case R.id.ad_button2:
                    String[] strings = new String[]{"男", "女"};
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(DialogActivity.this);
                    builder1.setTitle("选择性别").setItems(strings, (dialog, which) ->
                            Toast.makeText(DialogActivity.this, strings[which], Toast.LENGTH_SHORT).show()).show();
                    break;
                case R.id.ad_button3:
                    String[] strings3 = new String[]{"男", "女"};
                    AlertDialog.Builder builder3 = new AlertDialog.Builder(DialogActivity.this);
                    builder3.setTitle("选择性别").setSingleChoiceItems(strings3, 1, (dialog, which) -> {
                        Toast.makeText(DialogActivity.this, strings3[which], Toast.LENGTH_SHORT).show();
                        dialog.dismiss();//当选中一个选项时立即退出
                    }).setCancelable(false).show();//关闭点按其他地方退出对话框
                    break;
                case R.id.ad_button4:
                    String[] strings4 = new String[]{"唱", "跳", "rap", "篮球"};
                    boolean[] isSelected = new boolean[]{false, false, true, false};
                    AlertDialog.Builder builder4 = new AlertDialog.Builder(DialogActivity.this);
                    builder4.setTitle("选择兴趣").
                            setIcon(R.drawable.bg4).
                            setMultiChoiceItems(strings4, isSelected, ((dialogInterface, i, b) ->
                                    Toast.makeText(DialogActivity.this, strings4[i] + b, Toast.LENGTH_SHORT).show())).
                            setPositiveButton("确定", ((dialogInterface, i) -> {
                                //
                            })).
                            setNegativeButton("取消", ((dialogInterface, i) -> {
                                //
                            })).show();
                    break;
                case R.id.ad_button5:
                    AlertDialog.Builder builder5 = new AlertDialog.Builder(DialogActivity.this);
                    View view4 = getLayoutInflater().inflate(R.layout.layout_dialog, null);
                    EditText editText = view.findViewById(R.id.ld_editText1);
                    EditText editText1 = view.findViewById(R.id.ld_editText2);
                    builder5.setPositiveButton("登录", ((dialogInterface, i) -> {
//                        //加上报错
//                        Toast.makeText(DialogActivity.this,editText.getText().toString(),Toast.LENGTH_SHORT).show();
                        Toast.makeText(DialogActivity.this,"登录",Toast.LENGTH_SHORT).show();
                    })).setTitle("请先登录").setView(view4).create().show();
                    break;
            }
        }
    }
}
