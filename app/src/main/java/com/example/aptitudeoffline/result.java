package com.example.aptitudeoffline;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import static com.example.aptitudeoffline.test1.correctCount;
import static com.example.aptitudeoffline.test1.unanswered;
import static com.example.aptitudeoffline.test1.wrongCount;

public class result extends AppCompatActivity {

    TextView correctvalue,wrongvalue,unansweredvalue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        correctvalue = findViewById(R.id.correctvalue);
        wrongvalue = findViewById(R.id.wrongvalue);
        unansweredvalue = findViewById(R.id.unansweredvalue);


        correctvalue.setText(String.valueOf(correctCount));
        wrongvalue.setText(String.valueOf(wrongCount));
        unansweredvalue.setText(String.valueOf(20-(correctCount+wrongCount)));


        correctCount=0;
        wrongCount=0;
        unanswered=0;


    }
}
