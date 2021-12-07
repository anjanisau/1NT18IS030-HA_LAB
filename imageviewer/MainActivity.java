package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button b1,b2;
    ImageView iv;
    boolean flag;
    int images[] = {R.drawable.image1, R.drawable.image2, R.drawable.image3};
    int i=0;
    int length = images.length;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv=(ImageView) findViewById(R.id.img);
        b1=(Button) findViewById(R.id.next);
        b2=(Button) findViewById(R.id.prev);
        flag=true;
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = (i+1)%length;
                iv.setImageResource(images[i]);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i--;
                if(i==-1)
                {
                    i=length-1;
                }
                iv.setImageResource(images[i]);
            }
        });
    }
}