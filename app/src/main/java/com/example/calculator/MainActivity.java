package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txt_result=findViewById(R.id.txt_result);
        EditText txt_num1=findViewById(R.id.num1);
        EditText txt_num2=findViewById(R.id.num2);
        Button btn_1= findViewById(R.id.btn1);

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1=Double.parseDouble(txt_num1.getText().toString());
                double num2=Double.parseDouble(txt_num2.getText().toString());
                if(btn_1.callOnClick())
                    v.r.id
                double sum=num1+num2;
                txt_result.setText(Double.toString(sum));
            }
        });

        Button btn_clear= findViewById(R.id.btn6);
        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_num1.setText("");
                txt_num2.setText("");
                txt_result.setText("");
            }
        });

        Button btn_diff= findViewById(R.id.btn2);
        btn_diff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1=Double.parseDouble(txt_num1.getText().toString());
                double num2=Double.parseDouble(txt_num2.getText().toString());
                double diff=num1-num2;
                txt_result.setText(Double.toString(diff));
            }
        });

        Button btn_mul= findViewById(R.id.btn3);
        btn_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1=Double.parseDouble(txt_num1.getText().toString());
                double num2=Double.parseDouble(txt_num2.getText().toString());
                double mult=num1*num2;
                txt_result.setText(Double.toString(mult));
            }
        });

        Button btn_div= findViewById(R.id.btn4);
        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1=Double.parseDouble(txt_num1.getText().toString());
                double num2=Double.parseDouble(txt_num2.getText().toString());
                double div=num1/num2;
                txt_result.setText(Double.toString(div));
            }
        });


        Button btn_mod= findViewById(R.id.btn5);
        btn_mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1=Double.parseDouble(txt_num1.getText().toString());
                double num2=Double.parseDouble(txt_num2.getText().toString());
                double mod=num1%num2;
                txt_result.setText(Double.toString(mod));
            }
        });


    }
}

