package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    boolean isNewOp = true;
    EditText ed1;
    String op, oldNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = findViewById(R.id.editTextTextPersonName);
    }
    public void numberEvent(View view){
        if(isNewOp)
            ed1.setText("");
        isNewOp = false;
        String number = ed1.getText().toString();
        switch (view.getId()) {
            case R.id.one:
                number += "1";
                break;
            case R.id.two:
                number += "2";
                break;
            case R.id.three:
                number += "3";
                break;
            case R.id.four:
                number += "4";
                break;
            case R.id.five:
                number += "5";
                break;
            case R.id.six:
                number += "6";
                break;
            case R.id.seven:
                number += "7";
                break;
            case R.id.eight:
                number += "8";
                break;
            case R.id.nine:
                number += "9";
                break;
            case R.id.zero:
                number += "0";
                break;
            case R.id.dot:
                number += ".";
                break;
            case R.id.top2:
                number = "-" + number;
                break;
        }
        ed1.setText(number);
    }
    public void operatorEvent(View view){
        isNewOp = true;
        oldNumber = ed1.getText().toString();
        switch (view.getId()){
            case R.id.top4:op = "*";
                            break;
            case R.id.right1:op = "/"; break;
            case R.id.right2:op = "+"; break;
            case R.id.right3:op = "-"; break;

        }

    }
    public void equalEvent(View view){
        String newNumber = ed1.getText().toString();
        double result = 0.0;
        switch (op){
            case "+":
                result = Double.parseDouble(oldNumber) + Double.parseDouble(newNumber);
                break;
            case "-":
                result = Double.parseDouble(oldNumber) - Double.parseDouble(newNumber);
                break;
            case "*":
                result = Double.parseDouble(oldNumber) * Double.parseDouble(newNumber);
                break;
            case "/":
                result = Double.parseDouble(oldNumber) / Double.parseDouble(newNumber);
                break;

        }
        ed1.setText(result+"");
    }
    public void acEvent(View view){
        ed1.setText("0");
        isNewOp = true;
    }
    public void percentEvent(View view){
        double no = Double.parseDouble(ed1.getText().toString())/100;
        ed1.setText(no+"");
        isNewOp = true;
    }
}