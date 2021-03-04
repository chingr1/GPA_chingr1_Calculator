package com.example.gpa_chingr1_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    private EditText Grade1;
    private EditText Grade2;
    private EditText Grade3;
    private EditText Grade4;
    private EditText Grade5;
    private TextView TextViewResult;
    private Button ButtonAverage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Grade1 = findViewById(R.id.e1);
        Grade2 = findViewById(R.id.e2);
        Grade3 = findViewById(R.id.e3);
        Grade4 = findViewById(R.id.e4);
        Grade5 = findViewById(R.id.e5);
        TextViewResult = findViewById(R.id.textName);
        ButtonAverage = findViewById(R.id.button_add);

        ButtonAverage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int num1 = Integer.parseInt(Grade1.getText().toString());
                int num2 = Integer.parseInt(Grade2.getText().toString());
                int num3 = Integer.parseInt(Grade3.getText().toString());
                int num4 = Integer.parseInt(Grade4.getText().toString());
                int num5 = Integer.parseInt(Grade5.getText().toString());

                int sum = num1 + num2 + num3 +num4 + num5;
                int avg = sum/5;

                if (avg < 60) {
                    TextViewResult.setText(Float.toString(avg));
                    TextViewResult.setBackgroundColor(Color.RED);
                } else if (avg > 60 && avg < 80) {
                    TextViewResult.setText(Float.toString(avg));
                    TextViewResult.setBackgroundColor(Color.YELLOW);
                } else if (avg > 80 && avg <= 100){
                    TextViewResult.setText(Float.toString(avg));
                    TextViewResult.setBackgroundColor(Color.GREEN);
                }



                TextViewResult.setText(String.valueOf(avg));
                ButtonAverage.setText("Clear");
                Grade1.setText(null);
                Grade2.setText(null);
                Grade3.setText(null);
                Grade4.setText(null);
                Grade5.setText(null);


            }
        });

    }
}