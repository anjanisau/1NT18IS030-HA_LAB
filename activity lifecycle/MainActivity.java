package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("lifecycle","onCreate Invoked");
        Toast.makeText(getApplicationContext(), "onCreate: invoked", Toast.LENGTH_SHORT).show();
    }
    protected void onStart(){
        super.onStart();
        Log.d("lifecycle","onStart Invoked");
        Toast.makeText(getApplicationContext(), "onStart: invoked", Toast.LENGTH_SHORT).show();
    }
    protected void onResume(){
        super.onResume();
        Log.d("lifecycle","onResume Invoked");
        Toast.makeText(getApplicationContext(), "onResume: invoked", Toast.LENGTH_SHORT).show();
    }
    protected void onStop(){
        super.onStop();
        Log.d("lifecycle","onStop Invoked");
        Toast.makeText(getApplicationContext(), "onStop: invoked", Toast.LENGTH_SHORT).show();
    }
    protected void onPause(){
        super.onPause();
        Log.d("lifecycle","onPause Invoked");
        Toast.makeText(getApplicationContext(), "onPause: invoked", Toast.LENGTH_SHORT).show();
    }
    protected void onDestroy(){
        super.onDestroy();
        Log.d("lifecycle","onDestroy Invoked");
        Toast.makeText(getApplicationContext(), "onDestroy: invoked", Toast.LENGTH_SHORT).show();
    }
    protected void onRestart(){
        super.onRestart();
        Log.d("lifecycle","onRestart Invoked");
        Toast.makeText(getApplicationContext(), "onRestart: invoked", Toast.LENGTH_SHORT).show();
    }
}