package com.example.jo_sqlite;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name,contact,age;
    Button insert,update,delete,view;
    DBHelper DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=findViewById(R.id.name);
        contact=findViewById(R.id.contact);
        age=findViewById(R.id.age);

        insert=findViewById(R.id.btnInsert);
        update=findViewById(R.id.btnUpdate);
        delete=findViewById(R.id.btnDelete);
        view=findViewById(R.id.btnView);

        DB=new DBHelper(this);

        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameTXT=name.getText().toString();
                String contactTXT=contact.getText().toString();
                String ageTXT=age.getText().toString();
                name.getText().clear();
                contact.getText().clear();
                age.getText().clear();
                boolean qryStatus=DB.insertData(nameTXT,contactTXT,ageTXT);
                if(qryStatus==true)
                    Toast.makeText(MainActivity.this, "New Record created", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "New Record Creation Failed", Toast.LENGTH_SHORT).show();
            }
        });
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameTXT=name.getText().toString();
                String contactTXT=contact.getText().toString();
                String ageTXT=age.getText().toString();
                name.getText().clear();
                contact.getText().clear();
                age.getText().clear();
                boolean qryStatus=DB.updateData(nameTXT,contactTXT,ageTXT);
                if(qryStatus==true)
                    Toast.makeText(MainActivity.this, "Record Updated", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "Record Updation Failed", Toast.LENGTH_SHORT).show();
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameTXT=name.getText().toString();
                name.getText().clear();
                boolean qryStatus=DB.deletedata(nameTXT);
                if(qryStatus==true)
                    Toast.makeText(MainActivity.this, "Record Deleted", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "Record DeletionFailed", Toast.LENGTH_SHORT).show();
            }
        });
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor res=DB.viewData();
                if(res.getCount()==0)
                    Toast.makeText(MainActivity.this, "No Record Exist", Toast.LENGTH_SHORT).show();
                else{
                    StringBuffer buffer=new StringBuffer();
                    while(res.moveToNext()){
                        buffer.append("Name :"+res.getString(0)+"\n");
                        buffer.append("Contact :"+res.getString(1)+"\n");
                        buffer.append("Age :"+res.getString(2)+"\n");
                    }
                    AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                    builder.setCancelable(true);
                    builder.setTitle("User Data");
                    builder.setMessage(buffer.toString());
                    builder.show();
                }

            }
        });
    }
}