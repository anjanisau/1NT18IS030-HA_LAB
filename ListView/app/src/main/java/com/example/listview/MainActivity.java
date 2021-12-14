package com.example.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=(ListView) findViewById(R.id.progList);
        final String values[]={"C","C++","Java","Python","Android","C#","Ruby","VB","Scala","Assembly"};
        ArrayAdapter arrayAdapter=new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, Arrays.asList(values));
        lv.setAdapter(arrayAdapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "U clicked: "+values[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}