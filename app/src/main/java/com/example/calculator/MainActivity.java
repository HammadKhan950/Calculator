package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity  {

    EditText editText;
    Button one,two,three,four,five,six,
            seven,eight,nine,zero,equal,plus,minus,divide,multiply,cancel;
    Double firstNumber,secondNumber,result;
    String operations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.displayText);
        one=findViewById(R.id.one);
        two=findViewById(R.id.two);
        three=findViewById(R.id.three);
        four=findViewById(R.id.four);
        five=findViewById(R.id.five);
        six=findViewById(R.id.six);
        seven=findViewById(R.id.seven);
        eight=findViewById(R.id.eight);
        nine=findViewById(R.id.nine);
        zero=findViewById(R.id.zero);
        plus=findViewById(R.id.plus);
        minus=findViewById(R.id.minus);
        divide=findViewById(R.id.divide);
        multiply=findViewById(R.id.multiply);
        cancel=findViewById(R.id.cancel);
        equal=findViewById(R.id.equal);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=editText.getText().toString()+one.getText().toString();
                editText.setText(a);
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=editText.getText().toString()+two.getText().toString();
                editText.setText(a);
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=editText.getText().toString()+three.getText().toString();
                editText.setText(a);
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=editText.getText().toString()+four.getText().toString();
                editText.setText(a);
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=editText.getText().toString()+five.getText().toString();
                editText.setText(a);
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=editText.getText().toString()+six.getText().toString();
                editText.setText(a);
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=editText.getText().toString()+seven.getText().toString();
                editText.setText(a);
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=editText.getText().toString()+eight.getText().toString();
                editText.setText(a);
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=editText.getText().toString()+nine.getText().toString();
                editText.setText(a);
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=editText.getText().toString()+zero.getText().toString();
                editText.setText(a);
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              firstNumber=Double.valueOf(editText.getText().toString());
              editText.setText("");
              operations="+";
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNumber=Double.valueOf(editText.getText().toString());
                editText.setText("");
                operations="-";
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNumber=Double.valueOf(editText.getText().toString());
                editText.setText("");
                operations="/";
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNumber=Double.valueOf(editText.getText().toString());
                editText.setText("");
                operations="X";
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondNumber=Double.valueOf(editText.getText().toString());
                if(operations.equals("+")){
                    result=firstNumber+secondNumber;
                    editText.setText(Double.toString(result));
                }else if(operations.equals("-")){
                    result=firstNumber-secondNumber;
                    editText.setText(Double.toString(result));
                }else if(operations.equals("X")){
                    result=firstNumber*secondNumber;
                    editText.setText(Double.toString(result));
                }else if(operations.equals("/")){
                    result=firstNumber/secondNumber;
                    editText.setText(Double.toString(result));
                }
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
                firstNumber=0.0;
                secondNumber=0.0;
                result=0.0;
            }
        });


    }

}
