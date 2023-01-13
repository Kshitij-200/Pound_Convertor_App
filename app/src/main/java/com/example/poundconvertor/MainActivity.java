package com.example.poundconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FloatingActionButton fab = findViewById(R.id.floatingActionButton);
        EditText editText = findViewById(R.id.edittext);
        TextView textView = findViewById(R.id.textView1);
        Objects.requireNonNull(getSupportActionBar()).hide();
        Button button = findViewById(R.id.button);
        TextView textView1 = findViewById(R.id.textView2);
        EditText editText1 = findViewById(R.id.edittext1);
//        Button button1 = findViewById(R.id.button2);




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "You Clicked Me", Toast.LENGTH_SHORT).show();
                String kilogram = editText.getText().toString();

                    float kilo = Float.parseFloat(kilogram);
                    float pounds = (float) (kilo * 2.20462);
                    textView.setText("Correspounding value in pounds is: " + pounds);
                Snackbar.make(v,"Pounds = " +pounds,Snackbar.ANIMATION_MODE_SLIDE).show();
                
            }
        });

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Hi I am Kshitij", Toast.LENGTH_SHORT).show();
                String kilo = editText1.getText().toString();

                float kg = Float.parseFloat(kilo);
                float quintal= (float)kg*0.01f;
                textView1.setText("Value in quintal is: " + quintal);
                Snackbar.make(v,"Quintal = " +quintal,Snackbar.ANIMATION_MODE_SLIDE).show();

            }
        });




    }
//    public void onclick(View view){
//        Intent intent = new Intent(this,MainActivity2.class);
//        startActivity(intent);
    }
