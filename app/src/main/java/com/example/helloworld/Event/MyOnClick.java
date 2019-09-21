package com.example.helloworld.Event;

import android.app.Activity;
import android.view.View;
import android.widget.Toast;

import com.example.helloworld.R;

public class MyOnClick implements View.OnClickListener {

    private Activity mActivity;

    public MyOnClick(Activity activity) {
        mActivity = activity;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ae_button:
                Toast.makeText(mActivity, "onClick...", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
