package com.example.myapplication_task3_real;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity2 extends AppCompatActivity {
    Button button;
    EditText edittext1,edittext2,edittext3,edittext4;
    TextView textview1,textview2,textview3,textview4;
    SharedPreferences sharedPreferences;
    String playerID,name,age,email,color,level,max,min;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button = findViewById(R.id.button3);
        sharedPreferences = getSharedPreferences("MyMobile", Context.MODE_PRIVATE);
        textview1 = findViewById(R.id.textViewcolor);
        textview2 = findViewById(R.id.textViewlevel);
        textview3 = findViewById(R.id.textViewmax);
        textview4 = findViewById(R.id.textViewmin);
        edittext1 = findViewById(R.id.edittextcolor);
        edittext2 = findViewById(R.id.edittextlevel);
        edittext3 = findViewById(R.id.edittextmax);
        edittext4 = findViewById(R.id.edittextmin);

         playerID = getIntent().getStringExtra("playerID");
         name = getIntent().getStringExtra("name");
         age = getIntent().getStringExtra("age");
         email = getIntent().getStringExtra("email");




    }

    public void nextactivity3(View view) {

        color = edittext1.getText().toString();
        level = edittext2.getText().toString();
        max = edittext3.getText().toString();
        min = edittext4.getText().toString();
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("playerID",playerID);
        editor.putString("name",name);
        editor.putString("age",age);
        editor.putString("email",email);
        editor.putString("color",color);
        editor.putString("level",level);
        editor.putString("max",max);
        editor.putString("min",min);
        editor.commit();


        Intent intent = new Intent(this,MainActivitylistview.class);
        startActivity(intent);
    }
}