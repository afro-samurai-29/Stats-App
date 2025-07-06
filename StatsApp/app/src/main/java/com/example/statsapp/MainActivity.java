package com.example.statsapp;

import android.icu.util.Output;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Double> numbers = new ArrayList<>();


    public void doAdd(View v){
        EditText e = (EditText)findViewById(R.id.editText1);
        String value = e.getText().toString();
        Double d = Double.parseDouble(value);
        numbers.add(d);
        e.setText("");
    }
    public  void doMean(View v){
        double mean1 = Calculator.getMean(numbers);
        TextView Output1 = (TextView)findViewById(R.id.textView);
        String num = Double.toString(mean1);
        Output1.setText(num);
    }
    public  void doVariance(View v){
        double variance1 = Calculator.getVariance(numbers);
        TextView Output2 = (TextView)findViewById(R.id.textView);
        String num1 = Double.toString(variance1);
        Output2.setText(num1);
    }
    public  void doStdDev(View v){
        double Std_Dev = Calculator.getStdDev(numbers);
        TextView Output3 = (TextView)findViewById(R.id.textView);
        String num3 = Double.toString(Std_Dev);
        Output3.setText(num3);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}