package com.example.aptitudeoffline;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import static com.example.aptitudeoffline.test4.correctCount4;
import static com.example.aptitudeoffline.test4.unanswered4;
import static com.example.aptitudeoffline.test4.wrongCount4;

public class result4 extends AppCompatActivity {

    TextView correctvalue,wrongvalue,unansweredvalue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result4);

        correctvalue = findViewById(R.id.correctvalue);
        wrongvalue = findViewById(R.id.wrongvalue);
        unansweredvalue = findViewById(R.id.unansweredvalue);

        correctvalue.setText(String.valueOf(correctCount4));
        wrongvalue.setText(String.valueOf(wrongCount4));
        unansweredvalue.setText(String.valueOf(20-(correctCount4+wrongCount4)));


        correctCount4=0;
        wrongCount4=0;
        unanswered4=0;
    }
}
