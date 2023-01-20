package com.example.sharedpreferencesbob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name,email;
    Button button,button2;
    SharedPreferences sp;
    String nameStr,emailStr;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    name = findViewById(R.id.etname);
    email = findViewById(R.id.etemail);
    button  = findViewById(R.id.btnsave);

    button2   = findViewById(R.id.button2);
    sp = getSharedPreferences("MyUserPrefs", Context.MODE_PRIVATE);//my user prefs is the key


    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            nameStr = name.getText().toString();//text  views for getting user name and email
            emailStr = email.getText().toString();

//setting values of shared prferences
            //editor ka object bnaya haa Q k hm yahan edit kar sakty hain
            SharedPreferences.Editor editor = sp.edit();

            //jo jo yahan bhej rhy ho usay match b karna jahan get karna
            //keys match hon g to new screen p values display hon g wrna last value saved hi display karay ga

            editor.putString("name",nameStr);
            editor.putString("email",emailStr);

            editor.commit();//jab tak commit ni karain gy woh save ni ho gaa idhe or chalay ga ni  display ni day gaa

            Toast.makeText(MainActivity.this, "information saved", Toast.LENGTH_SHORT).show();
        }
    });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,OtherPage.class);
                startActivity(intent);
            }
        });


    }
}