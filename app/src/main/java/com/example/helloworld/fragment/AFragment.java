package com.example.helloworld.fragment;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.helloworld.R;

public class AFragment extends Fragment {

    private TextView textView;
    private Button button0,button1, button2;
    private BAFragment baFragment;
    private IOnMessageClick iOnMessageClick;

    public static AFragment newInstance(String title) {
        AFragment fragment = new AFragment();
        Bundle bundle = new Bundle();
        bundle.putString("title", title);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        iOnMessageClick=(IOnMessageClick)context;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textView = view.findViewById(R.id.fa_tv);
        button0 = view.findViewById(R.id.fa_button0);
        button1 = view.findViewById(R.id.fa_button1);
        button2 = view.findViewById(R.id.fa_button2);
        button0.setOnClickListener(view1 -> {
            iOnMessageClick.onClick("你好");
        });
        button1.setOnClickListener(view1 -> {
            if (baFragment == null) {
                baFragment = new BAFragment();
            }
            getFragmentManager().beginTransaction().replace(R.id.ac_fl, baFragment).addToBackStack(null).commitAllowingStateLoss();

        });
        button2.setOnClickListener(view1 -> {
            textView.setText("我是新文字");
        });
        if (getArguments() != null) {
            textView.setText(getArguments().getString("title"));
        }

    }

    public interface IOnMessageClick{
        void onClick(String s);
    }
}
