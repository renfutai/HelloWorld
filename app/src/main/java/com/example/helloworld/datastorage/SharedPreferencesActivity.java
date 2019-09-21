package com.example.helloworld.datastorage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.helloworld.R;

public class SharedPreferencesActivity extends AppCompatActivity {

    private EditText editText;
    private Button button1, button2;
    private TextView textView;
    private SharedPreferences mSharedPreferences;
    private SharedPreferences.Editor mEditor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preferences);
        editText = findViewById(R.id.asp_et);
        button1 = findViewById(R.id.asp_bt1);
        button2 = findViewById(R.id.asp_bt2);
        textView = findViewById(R.id.asp_tv);

        mSharedPreferences = getSharedPreferences("dara", MODE_PRIVATE);
        mEditor = mSharedPreferences.edit();

        button1.setOnClickListener(view -> {
            mEditor.putString("name", editText.getText().toString());
            mEditor.apply();
        });

        button2.setOnClickListener(view ->
            textView.setText(mSharedPreferences.getString("name", ""))
        );

    }
}
