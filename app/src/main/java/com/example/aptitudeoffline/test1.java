package com.example.aptitudeoffline;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;
import java.util.Locale;

import static com.example.aptitudeoffline.test.testone;

public class test1 extends AppCompatActivity {

    List<Modelclass> allQuestionsList;
    Modelclass modelclass;
    int index=0;
    TextView card_question, optiona, optionb, optionc, optiond;
    CardView cardOA, cardOB, cardOC, cardOD;
    public static int correctCount=0;
    public static int wrongCount=0;
    public static int unanswered=0;
    ImageButton nextBtn;
    TextView tvremaining,tvtimer;
    private static final long START_TIME_IN_MILLI = 1500000;
    private CountDownTimer countDownTimer;
    private long TimeLeftInMillis = START_TIME_IN_MILLI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);

        setupUIViews();
        cardOA.setCardBackgroundColor(getResources().getColor(R.color.white));
        cardOB.setCardBackgroundColor(getResources().getColor(R.color.white));
        cardOC.setCardBackgroundColor(getResources().getColor(R.color.white));
        cardOD.setCardBackgroundColor(getResources().getColor(R.color.white));
        startTimer();
        allQuestionsList=testone;
        Collections.shuffle(allQuestionsList);
        modelclass=testone.get(index);
        setAllData();

       /* nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enableButton();
                unanswered++;
                if (index<testone.size()-1){
                    index++;
                    tvremaining.setText(String.valueOf((index+1)+"/20"));
                    modelclass=testone.get(index);
                    resetColor();
                    setAllData();
                }else{
                    GameWon();
                }
            }
        });*/
    }

    private void setAllData() {
        card_question.setText(modelclass.getQuestion());
        card_question.setMovementMethod(new ScrollingMovementMethod());
        optiona.setText(modelclass.getoA());
        optionb.setText(modelclass.getoB());
        optionc.setText(modelclass.getoC());
        optiond.setText(modelclass.getoD());
    }

    private void setupUIViews() {

        card_question = findViewById(R.id.card_question);
        optiona = findViewById(R.id.card_optiona);
        optionb = findViewById(R.id.card_optionb);
        optionc = findViewById(R.id.card_optionc);
        optiond = findViewById(R.id.card_optiond);

        cardOA = findViewById(R.id.cardA);
        cardOB = findViewById(R.id.cardB);
        cardOC = findViewById(R.id.cardC);
        cardOD = findViewById(R.id.cardD);

        nextBtn = findViewById(R.id.nextBtn);

        tvremaining = findViewById(R.id.tvremaining);
        tvtimer = findViewById(R.id.tvtimer);
    }

    private void startTimer(){
        countDownTimer = new CountDownTimer(TimeLeftInMillis,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                TimeLeftInMillis = millisUntilFinished;
                updateCountDownText();
            }

            @Override
            public void onFinish() {
                Intent intent = new Intent(test1.this,result.class);
                startActivity(intent);
            }
        }.start();
    }

    private void updateCountDownText(){
        int minutes = (int) (TimeLeftInMillis / 1000) / 60;
        int seconds = (int) (TimeLeftInMillis / 1000) % 60;
        String timeleftformat = String.format(Locale.getDefault(),"%02d:%02d",minutes,seconds);
        tvtimer.setText(timeleftformat);
    }

    public void correct(CardView cardView){
        cardView.setCardBackgroundColor(getResources().getColor(R.color.green));
        correctCount++;
        disableButton();
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enableButton();
                if (index<testone.size()-1){
                    index++;
                    tvremaining.setText(String.valueOf((index+1)+"/20"));
                    modelclass=testone.get(index);
                    resetColor();
                    setAllData();
                }else{
                    GameWon();
                }
            }
        });
    }

    public void Wrong(CardView cardView){
        cardView.setCardBackgroundColor(getResources().getColor(R.color.red));
        wrongCount++;

        if (modelclass.getoA().equals(modelclass.getAns())){
            cardOA.setCardBackgroundColor(getResources().getColor(R.color.green));
        }else if (modelclass.getoB().equals(modelclass.getAns())){
            cardOB.setCardBackgroundColor(getResources().getColor(R.color.green));
        }else if (modelclass.getoC().equals(modelclass.getAns())){
            cardOC.setCardBackgroundColor(getResources().getColor(R.color.green));
        }else if (modelclass.getoD().equals(modelclass.getAns())){
            cardOD.setCardBackgroundColor(getResources().getColor(R.color.green));
        }

        disableButton();
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enableButton();
                if (index<testone.size()-1){
                    index++;
                    tvremaining.setText(String.valueOf((index+1)+"/20"));
                    modelclass=testone.get(index);
                    resetColor();
                    setAllData();
                }else{
                    GameWon();
                }
            }
        });
    }


    private void GameWon(){
        Intent intent = new Intent(test1.this,result.class);
        startActivity(intent);
    }

    public void enableButton(){
        cardOA.setClickable(true);
        cardOB.setClickable(true);
        cardOC.setClickable(true);
        cardOD.setClickable(true);
    }

    public void disableButton(){
        cardOA.setClickable(false);
        cardOB.setClickable(false);
        cardOC.setClickable(false);
        cardOD.setClickable(false);
    }

    public void resetColor(){
        cardOA.setCardBackgroundColor(getResources().getColor(R.color.white));
        cardOB.setCardBackgroundColor(getResources().getColor(R.color.white));
        cardOC.setCardBackgroundColor(getResources().getColor(R.color.white));
        cardOD.setCardBackgroundColor(getResources().getColor(R.color.white));
    }

    public void OptionAClick(View view) {
        nextBtn.setClickable(true);
        if (modelclass.getoA().equals(modelclass.getAns())){
            cardOA.setCardBackgroundColor(getResources().getColor(R.color.green));
            disableButton();

            if (index <= testone.size() - 1) {
                correct(cardOA);
            }else {
                GameWon();
            }
        }else{
            Wrong(cardOA);
        }
    }

    public void OptionBClick(View view) {
        nextBtn.setClickable(true);
        if (modelclass.getoB().equals(modelclass.getAns())){
            cardOB.setCardBackgroundColor(getResources().getColor(R.color.green));
            disableButton();
            if (index <= testone.size() - 1) {
                correct(cardOB);
            }else {
                GameWon();
            }
        }else{
            Wrong(cardOB);
        }
    }

    public void OptionCClick(View view) {
        nextBtn.setClickable(true);
        if (modelclass.getoC().equals(modelclass.getAns())){
            cardOC.setCardBackgroundColor(getResources().getColor(R.color.green));
            disableButton();
            if (index <=testone.size() - 1) {
                correct(cardOC);
            }else {
                GameWon();
            }
        }else{
            Wrong(cardOC);
        }
    }

    public void OptionDClick(View view) {
        nextBtn.setClickable(true);
        if (modelclass.getoD().equals(modelclass.getAns())){
            cardOD.setCardBackgroundColor(getResources().getColor(R.color.green));
            disableButton();
            if (index <= testone.size() - 1) {
                correct(cardOD);
            }else {
                GameWon();
            }
        }else{
            Wrong(cardOD);
        }
    }
}

