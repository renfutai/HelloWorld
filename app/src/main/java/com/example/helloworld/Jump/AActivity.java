package com.example.helloworld.Jump;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.example.helloworld.R;

public class AActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        button = findViewById(R.id.aa_button);
        button.setOnClickListener(view -> {
            Intent intent = new Intent(AActivity.this, BActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString("name", "天哥");
            bundle.putInt("number", 88);
            intent.putExtras(bundle);
            startActivityForResult(intent, 0);
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Toast.makeText(AActivity.this, data.getExtras().getString("title"), Toast.LENGTH_SHORT).show();
    }
}