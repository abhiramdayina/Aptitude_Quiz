package com.example.aptitudeoffline;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import static com.example.aptitudeoffline.test2.correctCount2;
import static com.example.aptitudeoffline.test2.unanswered2;
import static com.example.aptitudeoffline.test2.wrongCount2;


public class result2 extends AppCompatActivity {

    TextView correctvalue,wrongvalue,unansweredvalue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result2);

        correctvalue = findViewById(R.id.correctvalue);
        wrongvalue = findViewById(R.id.wrongvalue);
        unansweredvalue = findViewById(R.id.unansweredvalue);

        correctvalue.setText(String.valueOf(correctCount2));
        wrongvalue.setText(String.valueOf(wrongCount2));
        unansweredvalue.setText(String.valueOf(20-(correctCount2+wrongCount2)));


        correctCount2=0;
        wrongCount2=0;
        unanswered2=0;
    }
}
