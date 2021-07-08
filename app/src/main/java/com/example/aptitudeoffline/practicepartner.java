package com.example.aptitudeoffline;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

import static com.example.aptitudeoffline.practice.list;
import static com.example.aptitudeoffline.practice.listpat;

public class practicepartner extends AppCompatActivity {

    List<Modelclass> allQuestionsList;
    Modelclass modelclass;
    int index=0;
    TextView card_question, optiona, optionb, optionc, optiond;
    CardView cardOA, cardOB, cardOC, cardOD;
    ImageButton nextBtn,backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practicepartner);

        setupUIViews();

        cardOA.setCardBackgroundColor(getResources().getColor(R.color.white));
        cardOB.setCardBackgroundColor(getResources().getColor(R.color.white));
        cardOC.setCardBackgroundColor(getResources().getColor(R.color.white));
        cardOD.setCardBackgroundColor(getResources().getColor(R.color.white));

        allQuestionsList=listpat;
        Collections.shuffle(allQuestionsList);
        modelclass=listpat.get(index);

        setAllData();
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index >=1){
                    index--;
                    modelclass=listpat.get(index);
                    resetColor();
                    setAllData();
                }
            }
        });

    }

    private void setAllData() {
        card_question.setText(modelclass.getQuestion());
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
        backBtn = findViewById(R.id.backBtn);

    }

    public void correct(CardView cardView){

        cardView.setCardBackgroundColor(getResources().getColor(R.color.green));

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index++;
                modelclass=listpat.get(index);
                resetColor();
                setAllData();
            }
        });

    }

    public void Wrong(CardView cardView){

        cardView.setCardBackgroundColor(getResources().getColor(R.color.red));

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index<listpat.size()-1){
                    index++;
                    modelclass=listpat.get(index);
                    resetColor();
                    setAllData();
                }else{
                    GameWon();
                }
            }
        });

    }

    private void GameWon(){
        Intent intent = new Intent(practicepartner.this,complete.class);
        startActivity(intent);
    }
    public void resetColor(){
        cardOA.setCardBackgroundColor(getResources().getColor(R.color.white));
        cardOB.setCardBackgroundColor(getResources().getColor(R.color.white));
        cardOC.setCardBackgroundColor(getResources().getColor(R.color.white));
        cardOD.setCardBackgroundColor(getResources().getColor(R.color.white));
    }

    public void OptionAClick(View view) {

        if (modelclass.getoA().equals(modelclass.getAns())){
            cardOA.setCardBackgroundColor(getResources().getColor(R.color.green));

            if (index < listpat.size() - 1) {
                correct(cardOA);
            }else {
                GameWon();
            }

        }else{
            Wrong(cardOA);
        }
    }

    public void OptionBClick(View view) {
        if (modelclass.getoB().equals(modelclass.getAns())){
            cardOB.setCardBackgroundColor(getResources().getColor(R.color.green));

            if (index < listpat.size() - 1) {
                correct(cardOB);
            }else {
                GameWon();
            }

        }else{
            Wrong(cardOB);
        }
    }

    public void OptionCClick(View view) {
        if (modelclass.getoC().equals(modelclass.getAns())){
            cardOC.setCardBackgroundColor(getResources().getColor(R.color.green));

            if (index < listpat.size() - 1) {
                correct(cardOC);
            }else {
                GameWon();
            }

        }else{
            Wrong(cardOC);
        }
    }
    public void OptionDClick(View view) {
        if (modelclass.getoD().equals(modelclass.getAns())){
            cardOD.setCardBackgroundColor(getResources().getColor(R.color.green));

            if (index < listpat.size() - 1) {
                correct(cardOD);
            }else {
                GameWon();
            }

        }else{
            Wrong(cardOD);
        }
    }

}
