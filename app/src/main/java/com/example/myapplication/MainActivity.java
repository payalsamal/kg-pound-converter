package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button ;
    private TextView textView;
    private TextView editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView2);
        editText = findViewById(R.id.editTextNumber);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int kg = Integer.parseInt(editText.getText().toString());
                double pound = kg*2.20462;
                textView.setText("The pound value is "+pound);
            }
        });

    }
}