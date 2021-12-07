package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText t1;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(EditText) findViewById(R.id.text1);
        b1=(Button) findViewById(R.id.call);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = t1.getText().toString();
                Intent it = new Intent(Intent.ACTION_DIAL);
                it.setData(Uri.parse("tel: " + num));
                startActivity(it);
            }
        });
    }
}