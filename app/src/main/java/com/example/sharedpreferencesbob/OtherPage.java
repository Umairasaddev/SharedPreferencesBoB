package com.example.sharedpreferencesbob;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class OtherPage  extends AppCompatActivity {


    TextView textView3,textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);


        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);


        SharedPreferences sp = getApplicationContext().getSharedPreferences("MyUserPrefs", Context.MODE_PRIVATE);
        String name = sp.getString("name","");
        String email = sp.getString("email","");


        textView3.setText(email);//is text view main name ana chahy
        textView4.setText(name);//is tv main email

    }
}
