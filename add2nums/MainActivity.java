package com.example.addtwonumbers;

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
        EditText n1=findViewById(R.id.num1);
        EditText n2=findViewById(R.id.num2);
        TextView t=findViewById(R.id.res1);
        Button bt1;
        bt1 = findViewById(R.id.res1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1=Integer.parseInt(n1.getText().toString());
                int num2=Integer.parseInt(n2.getText().toString());
                String res=String.valueOf(num1+num2);
                t.setText("Result is" +res);
            }
        });

    }
}