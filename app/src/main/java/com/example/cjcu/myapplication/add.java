package com.example.cjcu.myapplication;

import android.content.ContentValues;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class add extends AppCompatActivity {

    private EditText amount;
    private EditText info;
    private EditText data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        view();
        MyDbHelper DB = new MyDbHelper(this,"my.db",null,1);
        String date= data.getText().toString();
        String inf= info.getText().toString();
        int mo=Integer.parseInt(amount.getText().toString());
        ContentValues CV = new ContentValues();
        CV.put("cdate",date);
        CV.put("info",inf);
        CV.put("amount",mo);
        long id=DB.getWritableDatabase().insert("exp",null,CV);
        Log.d("ADD data",id+ " ");

    }

    private void view() {
        amount = findViewById(R.id.ed_amount);
        data = findViewById(R.id.ed_data);
        info = findViewById(R.id.ed_info);
    }
}
