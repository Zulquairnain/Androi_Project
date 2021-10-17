package com.example.myapplication_task3_real;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivitylistview extends AppCompatActivity {
    ListView listView;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitylistview);
        listView = findViewById(R.id.listviewid);
        sharedPreferences = getSharedPreferences("MyMobile",0);
        String a = sharedPreferences.getString("playerID","");
        String b = sharedPreferences.getString("name","");
        String c = sharedPreferences.getString("age","");
        String d =  sharedPreferences.getString("email","");
        String e = sharedPreferences.getString("color","");
        String f = sharedPreferences.getString("level","");
        String g = sharedPreferences.getString("max","");
        String h = sharedPreferences.getString("min","");
        ArrayList<String> myMobileList = new ArrayList<>();
        myMobileList.add(a);
        myMobileList.add(b);
        myMobileList.add(c);
        myMobileList.add(d);
        myMobileList.add(e);
        myMobileList.add(f);
        myMobileList.add(g);
        myMobileList.add(h);
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>
                        (this, android.R.layout.simple_list_item_1,myMobileList);
        listView.setAdapter(adapter);
    }
}