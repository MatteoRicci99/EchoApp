package com.example.echoapp.home;

import android.os.Bundle;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.echoapp.R;


public class DemoFragment extends Fragment {

    private TextView textView;

    public DemoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_demo, container, false);
        textView = view.findViewById(R.id.txt_display);
        textView.setText(getArguments().getString("message"));
        return view;
    }
}