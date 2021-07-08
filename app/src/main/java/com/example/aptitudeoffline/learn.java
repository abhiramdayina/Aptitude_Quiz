package com.example.aptitudeoffline;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class learn extends AppCompatActivity {

    private CardView learnnumber,learnavg,learnpartner,learnages,learnpercent,learnratios,learndecimals,
            learnprobability,learnroots,learncalendar,learnclocks,learntrain,learntimenwork,learnrelations,
            learnprofit,learncoding,learndirections,learnanalogy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);

        setupUIViews();

        learnnumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(learn.this,learnnumbers.class);
                startActivity(i);
            }
        });

        learnavg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(learn.this,learnaverages.class);
                startActivity(i);
            }
        });

        learnpartner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(learn.this,learnpartnership.class);
                startActivity(i);
            }
        });

        learnages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(learn.this,learnages.class);
                startActivity(i);
            }
        });

        learnpercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(learn.this,learnpercentages.class);
                startActivity(i);
            }
        });

        learnratios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(learn.this,learnratios.class);
                startActivity(i);
            }
        });

        learndecimals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(learn.this,learndecimals.class);
                startActivity(i);
            }
        });

        learnprobability.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(learn.this,learnprobability.class);
                startActivity(i);
            }
        });

        learnroots.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(learn.this,learnroots.class);
                startActivity(i);
            }
        });

        learncoding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(learn.this,learncoding.class);
                startActivity(i);
            }
        });

        learnrelations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(learn.this,learnblood.class);
                startActivity(i);
            }
        });

        learncalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(learn.this,learncalendar.class);
                startActivity(i);
            }
        });

        learndirections.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(learn.this,learndirections.class);
                startActivity(i);
            }
        });

        learnanalogy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(learn.this,learnanalogy.class);
                startActivity(i);
            }
        });

        learnclocks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(learn.this,learnclocks.class);
                startActivity(i);
            }
        });

        learntrain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(learn.this,learntrains.class);
                startActivity(i);
            }
        });

        learnprofit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(learn.this,learnprofitandloss.class);
                startActivity(i);
            }
        });

        learntimenwork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(learn.this,learntimeandwork.class);
                startActivity(i);
            }
        });






    }





    private void setupUIViews() {

        learnnumber = findViewById(R.id.learnnumber);
        learnavg = findViewById(R.id.learnaverages);
        learnpartner = findViewById(R.id.learnpartner);
        learnages = findViewById(R.id.learnages);
        learnpercent = findViewById(R.id.learnpercent);
        learnratios = findViewById(R.id.learnratios);
        learndecimals = findViewById(R.id.learndecimals);
        learnprobability = findViewById(R.id.learnprobability);
        learnroots = findViewById(R.id.learnroots);
        learncalendar = findViewById(R.id.learncalendar);
        learnclocks = findViewById(R.id.learnclocks);
        learntrain = findViewById(R.id.learntrain);
        learntimenwork = findViewById(R.id.learntimenwork);
        learnrelations = findViewById(R.id.learnrelations);
        learnprofit = findViewById(R.id.learnprofit);
        learncoding = findViewById(R.id.learncoding);
        learndirections = findViewById(R.id.learndirections);
        learnanalogy = findViewById(R.id.learnanalogy);
    }
}
