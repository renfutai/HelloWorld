package com.example.helloworld.datastorage;

import android.Manifest;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import com.example.helloworld.R;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileActivity extends AppCompatActivity {

    private EditText editText;
    private Button button1, button2;
    private TextView textView;
    private SharedPreferences mSharedPreferences;
    private SharedPreferences.Editor mEditor;
    private final String mFileName = "data.txt";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file);
        editText = findViewById(R.id.asp_et);
        button1 = findViewById(R.id.asp_bt1);
        button2 = findViewById(R.id.asp_bt2);
        textView = findViewById(R.id.asp_tv);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            requestPermissions(new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},0x123);
        }

        button1.setOnClickListener(view -> {
            save(editText.getText().toString());
        });

        button2.setOnClickListener(view ->
                textView.setText(read())
        );

    }


//    //内部存
//    private void save(String content) {
//        FileOutputStream fileOutputStream = null;
//        try {
//            fileOutputStream = openFileOutput(mFileName, MODE_PRIVATE);
//            fileOutputStream.write(content.getBytes());
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (fileOutputStream != null) {
//                try {
//                    fileOutputStream.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }

    //外部存
    private void save(String content) {
        FileOutputStream fileOutputStream = null;
        try {
            File dir = new File(Environment.getExternalStorageDirectory(), "skypan");
            if (!dir.exists()) {
                dir.mkdirs();
            }
            File file = new File(dir, mFileName);
            if (!file.exists()) {
                file.createNewFile();
            }
            fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(content.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

//    //内部取
//    private String read() {
//        FileInputStream fileInputStream = null;
//        try {
//            fileInputStream = openFileInput(mFileName);
//            byte[] buff = new byte[1024];
//            StringBuffer stringBuffer = new StringBuffer("");
//            int len = 0;
//            while ((len = fileInputStream.read(buff)) > 0) {
//                stringBuffer.append(new String(buff, 0, len));
//            }
//            return stringBuffer.toString();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (fileInputStream != null) {
//                try {
//                    fileInputStream.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        return null;
//    }

    //外部取
    private String read() {
        FileInputStream fileInputStream = null;
        try {
            File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + "skypan", mFileName);
            fileInputStream = new FileInputStream(file);
            byte[] buff = new byte[1024];
            StringBuffer stringBuffer = new StringBuffer("");
            int len = 0;
            while ((len = fileInputStream.read(buff)) > 0) {
                stringBuffer.append(new String(buff, 0, len));
            }
            return stringBuffer.toString();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

}
