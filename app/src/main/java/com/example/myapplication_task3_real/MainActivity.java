package com.example.myapplication_task3_real;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView textview1,textview2,textview3,textview4;
    EditText edittext1,edittext2,edittext3,edittext4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button1);
        textview1 = findViewById(R.id.textViewplayerID);
        textview2 = findViewById(R.id.textViewname);
        textview3 = findViewById(R.id.textViewage);
        textview4 = findViewById(R.id.textViewemail);
        edittext1 = findViewById(R.id.edittextid);
        edittext2 = findViewById(R.id.edittextname);
        edittext3 = findViewById(R.id.edittextage);
        edittext4 = findViewById(R.id.edittextemail);

    }

    public void nextactivity(View view) {
        Intent intent = new Intent(this,MainActivity2.class);
        String playerID = edittext1.getText().toString();
        String name = edittext2.getText().toString();
        String age = edittext3.getText().toString();
        String email = edittext4.getText().toString();

        intent.putExtra("playerID", playerID);
        intent.putExtra("name",name);
        intent.putExtra("age",age);
        intent.putExtra("email",email);
        startActivity(intent);
    }
}