package com.example.aptitudeoffline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button learnbtn, practicebtn, testbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        learnbtn = findViewById(R.id.learnbtn);
        practicebtn = findViewById(R.id.practicebtn);
        testbtn = findViewById(R.id.testbtn);

        learnbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,learn.class);
                startActivity(intent);
            }
        });

        practicebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,practice.class);
                startActivity(intent);
            }
        });
        testbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,test.class);
                startActivity(intent);
            }
        });

    }
}
