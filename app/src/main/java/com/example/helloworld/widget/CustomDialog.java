package com.example.helloworld.widget;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.helloworld.R;

public class CustomDialog extends Dialog implements View.OnClickListener {

    private TextView textView1, textView2, textView3, textView4;


    private String stringTextView1, stringTextView2, stringTextView3, stringTextView4;

    private IOnCancelListener iOnCancelListener;
    private IOnConfirmListener iOnConfirmListener;

    public CustomDialog(@NonNull Context context) {
        super(context);
    }

    public CustomDialog(@NonNull Context context, int themeID) {
        super(context, themeID);
    }

    public CustomDialog setStringTextView1(String stringTextView1) {
        this.stringTextView1 = stringTextView1;
        return this;
    }

    public CustomDialog setStringTextView2(String stringTextView2) {
        this.stringTextView2 = stringTextView2;
        return this;
    }

    public CustomDialog setStringTextView3(String stringTextView3, IOnConfirmListener listener) {
        this.stringTextView3 = stringTextView3;
        this.iOnConfirmListener = listener;
        return this;
    }

    public CustomDialog setStringTextView4(String stringTextView4, IOnCancelListener listener) {
        this.stringTextView4 = stringTextView4;
        this.iOnCancelListener = listener;
        return this;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_custom_dialog);

        //设置宽度
        WindowManager m = getWindow().getWindowManager();
        Display d = m.getDefaultDisplay();
        WindowManager.LayoutParams p = getWindow().getAttributes();
        Point size = new Point();
        d.getSize(size);
        p.width = (int) (size.x * 0.8);
        getWindow().setAttributes(p);

        textView1 = findViewById(R.id.lcd_tv1);
        textView2 = findViewById(R.id.lcd_tv2);
        textView3 = findViewById(R.id.lcd_tv3_1);
        textView4 = findViewById(R.id.lcd_tv3_2);
        if (!TextUtils.isEmpty(stringTextView1)) {
            textView1.setText(stringTextView1);
        }
        if (!TextUtils.isEmpty(stringTextView2)) {
            textView2.setText(stringTextView2);
        }
        if (!TextUtils.isEmpty(stringTextView3)) {
            textView3.setText(stringTextView3);
        }
        if (!TextUtils.isEmpty(stringTextView4)) {
            textView4.setText(stringTextView4);
        }
        textView3.setOnClickListener(this);
        textView4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.lcd_tv3_1:
                if (iOnConfirmListener != null) {
                    iOnConfirmListener.onCancel(this);
                }
                dismiss();
                break;
            case R.id.lcd_tv3_2:
                if (iOnCancelListener != null) {
                    iOnCancelListener.onCancel(this);
                }
                dismiss();
                break;
        }
    }

    public interface IOnCancelListener {
        void onCancel(CustomDialog dialog);
    }

    public interface IOnConfirmListener {
        void onCancel(CustomDialog dialog);
    }

}
