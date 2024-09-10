package com.example.calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
     EditText num1;
     EditText num2;
     EditText ans;
     Button addbtn,btn2,btn3,btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
        ans=findViewById(R.id.ans);
        addbtn=findViewById(R.id.addbtn);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int
                        x=Integer.parseInt(num1.getText().toString());
                int
                        y=Integer.parseInt(num2.getText().toString());
                int sum=x+y;
                ans.setText(String.valueOf(sum));

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int
                        x=Integer.parseInt(num1.getText().toString());
                int
                        y=Integer.parseInt(num2.getText().toString());
                int sub=x-y;
                ans.setText(String.valueOf(sub));

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int
                        x=Integer.parseInt(num1.getText().toString());
                int
                        y=Integer.parseInt(num2.getText().toString());
                int mul=x*y;
                ans.setText(String.valueOf(mul));

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int
                        x=Integer.parseInt(num1.getText().toString());
                int
                        y=Integer.parseInt(num2.getText().toString());
                int div=x/y;
                ans.setText(String.valueOf(div));

            }
        });
    }
}
