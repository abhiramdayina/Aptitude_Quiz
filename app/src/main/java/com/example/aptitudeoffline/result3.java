package com.example.aptitudeoffline;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import static com.example.aptitudeoffline.test3.correctCount3;
import static com.example.aptitudeoffline.test3.unanswered3;
import static com.example.aptitudeoffline.test3.wrongCount3;

public class result3 extends AppCompatActivity {

    TextView correctvalue,wrongvalue,unansweredvalue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result3);

        correctvalue = findViewById(R.id.correctvalue);
        wrongvalue = findViewById(R.id.wrongvalue);
        unansweredvalue = findViewById(R.id.unansweredvalue);

        correctvalue.setText(String.valueOf(correctCount3));
        wrongvalue.setText(String.valueOf(wrongCount3));
        unansweredvalue.setText(String.valueOf(20-(correctCount3+wrongCount3)));


        correctCount3=0;
        wrongCount3=0;
        unanswered3=0;
    }
}
