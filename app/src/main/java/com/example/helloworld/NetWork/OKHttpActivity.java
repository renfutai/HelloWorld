package com.example.helloworld.NetWork;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.helloworld.R;
import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class OKHttpActivity extends AppCompatActivity implements View.OnClickListener {

    public static final MediaType JSON =
            MediaType.parse("application/json; charset=utf-8");

    private static final int GET = 1;
    private static final int POST = 2;
    private Button button;
    private OkHttpClient client = new OkHttpClient();
    private TextView textView;

    @SuppressLint("HandlerLeak")
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case GET:
                    textView.setText((String) msg.obj);
                    break;
                case POST:
                    textView.setText((String) msg.obj);
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_okhttp);
        textView = findViewById(R.id.ao_tv);
        button = findViewById(R.id.ao_button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ao_button:
                textView.setText("");
                threadGet();
//                threadPost();
                break;
        }
    }

    private void threadGet() {
        new Thread() {
            @Override
            public void run() {
                super.run();
                try {
                    String result = get("https://v1.hitokoto.cn/");
                    Log.d("任富泰", result);
                    Message msg = Message.obtain();
                    msg.what = GET;
                    msg.obj = result;
                    handler.sendMessage(msg);
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }.start();
    }

    private void threadPost() {
        //有位置的bug
        new Thread() {
            @Override
            public void run() {
                super.run();
                try {
                    String result = post("https://www.baifubao.com/callback?cmd=1059&callback=phone&phone=手机号","");
                    Log.d("任富泰", result);
                    Message msg = Message.obtain();
                    msg.what = POST;
                    msg.obj = result;
                    handler.sendMessage(msg);
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }.start();
    }


    private String get(String url) throws IOException {
        Request request = new Request.Builder().url(url).build();

        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    private String post(String url, String json) throws IOException {
        RequestBody body = RequestBody.create(JSON, json);
        Request request = new Request.Builder().url(url).post(body).build();

        Response response = client.newCall(request).execute();
        return response.body().string();
    }
}