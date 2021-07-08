package com.example.aptitudeoffline;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import static com.example.aptitudeoffline.test5.correctCount5;
import static com.example.aptitudeoffline.test5.unanswered5;
import static com.example.aptitudeoffline.test5.wrongCount5;

public class result5 extends AppCompatActivity {

    TextView correctvalue,wrongvalue,unansweredvalue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result5);


        correctvalue = findViewById(R.id.correctvalue);
        wrongvalue = findViewById(R.id.wrongvalue);
        unansweredvalue = findViewById(R.id.unansweredvalue);

        correctvalue.setText(String.valueOf(correctCount5));
        wrongvalue.setText(String.valueOf(wrongCount5));
        unansweredvalue.setText(String.valueOf(20-(correctCount5+wrongCount5)));


        correctCount5=0;
        wrongCount5=0;
        unanswered5=0;
    }
}
