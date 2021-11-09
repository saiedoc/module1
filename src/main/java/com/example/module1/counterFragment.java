package com.example.module1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class counterFragment extends Fragment {


    Button increment;
    Button decrement;
    Button clear;
    TextView count;
    View view;


    private void findViews(){

        increment = view.findViewById(R.id.increment);
        decrement = view.findViewById(R.id.decrement);
        clear = view.findViewById(R.id.clear);
        count = view.findViewById(R.id.count);

    }

    private void applyFunctionality(){

        increment.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                int counter = Integer.parseInt(count.getText().toString());
                counter += 1;
                count.setText(String.valueOf(counter));

            }

        });

        decrement.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                int counter = Integer.parseInt(count.getText().toString());
                counter -= 1;
                count.setText(String.valueOf(counter));

            }

        });

        clear.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                count.setText(R.string.zero);
            }

        });


    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.counter_layout, container, false);
        findViews();
        applyFunctionality();
        return view;
    }
}