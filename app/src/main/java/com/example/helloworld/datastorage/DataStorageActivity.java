package com.example.helloworld.datastorage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.helloworld.R;

public class DataStorageActivity extends AppCompatActivity {

    Button buttonSharedPreferences,buttonFile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_storage);
        buttonSharedPreferences = findViewById(R.id.ads_button_SharedPreferences);
        buttonSharedPreferences.setOnClickListener(view -> {
            Intent intent = new Intent(DataStorageActivity.this, SharedPreferencesActivity.class);
            startActivity(intent);
        });
        buttonFile = findViewById(R.id.ads_button_File);
        buttonFile.setOnClickListener(view -> {
            Intent intent = new Intent(DataStorageActivity.this, FileActivity.class);
            startActivity(intent);
        });

    }
}
