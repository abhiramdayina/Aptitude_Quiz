package com.example.aptitudeoffline;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class practice extends AppCompatActivity {

    private CardView practicenumbers,practiceaverages,practicepartner,practiceages,practicecoding,practiceratios,
            practicedecimals,practiceprobability,practiceroots,practicepercentages,practiceblood,practicecalendar,
            practicedirections,practiceanalogy,practiceclocks,practicetrains,practiceprofit,practicetime;
    public static ArrayList<Modelclass> list;
    public static ArrayList<Modelclass> listavg;
    public static ArrayList<Modelclass> listpat;
    public static ArrayList<Modelclass> listages;
    public static ArrayList<Modelclass> listcoding;
    public static ArrayList<Modelclass> listratios;
    public static ArrayList<Modelclass> listdecimals;
    public static ArrayList<Modelclass> listprobability;
    public static ArrayList<Modelclass> listroots;
    public static ArrayList<Modelclass> listpercent;
    public static ArrayList<Modelclass> listblood;
    public static ArrayList<Modelclass> listcalendar;
    public static ArrayList<Modelclass> listdirections;
    public static ArrayList<Modelclass> listanalogy,listclocks,listtrains,listprofit,listtime;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);

        practicenumbers = findViewById(R.id.practicenumbers);
        practiceaverages = findViewById(R.id.practiceaverages);
        practicepartner = findViewById(R.id.practicepartner);
        practiceages = findViewById(R.id.practiceages);
        practicecoding = findViewById(R.id.practicecoding);
        practiceratios = findViewById(R.id.practiceratios);
        practicedecimals = findViewById(R.id.practicedecimals);
        practiceprobability = findViewById(R.id.practiceprobability);
        practiceroots = findViewById(R.id.practiceroots);
        practicepercentages = findViewById(R.id.practicepercentages);
        practiceblood = findViewById(R.id.practiceblood);
        practicecalendar = findViewById(R.id.practicecalendar);
        practicedirections = findViewById(R.id.practicedirections);
        practiceanalogy = findViewById(R.id.practiceanalogy);
        practiceclocks = findViewById(R.id.practiceclocks);
        practicetrains = findViewById(R.id.practicetrains);
        practiceprofit = findViewById(R.id.practiceprofit);
        practicetime = findViewById(R.id.practicetime);

        practicenumbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(practice.this, practicenumbers.class);
                startActivity(intent);
            }
        });
        practiceaverages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(practice.this, practiceaverages.class);
                startActivity(intent);
            }
        });
        practicepartner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(practice.this, practicepartner.class);
                startActivity(intent);
            }
        });
        practiceages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(practice.this, practiceages.class);
                startActivity(intent);
            }
        });
        practicecoding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(practice.this, practicecoding.class);
                startActivity(intent);
            }
        });
        practiceratios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(practice.this, practiceratios.class);
                startActivity(intent);
            }
        });
        practicedecimals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(practice.this, practicedecimals.class);
                startActivity(intent);
            }
        });
        practiceprobability.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(practice.this, practiceprobability.class);
                startActivity(intent);
            }
        });
        practiceroots.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(practice.this, practiceroots.class);
                startActivity(intent);
            }
        });
        practicepercentages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(practice.this, practicepercentages.class);
                startActivity(intent);
            }
        });
        practiceblood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(practice.this, practiceblood.class);
                startActivity(intent);
            }
        });
        practicecalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(practice.this, practicecalendar.class);
                startActivity(intent);
            }
        });
        practicedirections.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(practice.this, practicedirections.class);
                startActivity(intent);
            }
        });
        practiceanalogy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(practice.this, practiceanalogy.class);
                startActivity(intent);
            }
        });
        practiceclocks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(practice.this, practiceclocks.class);
                startActivity(intent);
            }
        });
        practicetrains.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(practice.this, practicetrains.class);
                startActivity(intent);
            }
        });
        practiceprofit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(practice.this, practiceprofit.class);
                startActivity(intent);
            }
        });
        practicetime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(practice.this, practicetime.class);
                startActivity(intent);
            }
        });


        list = new ArrayList<>();
        list.add(new Modelclass("The difference between the place value and the face value of 6 in the numeral 856973 is","973","6973","5994","none of these","5994"));
        list.add(new Modelclass("The unit digit in the product (784 × 618 × 917 × 463) is","2","3","4","5","2"));
        list.add(new Modelclass("7589 - ? = 3434","4242","4155","1123","11023","4155"));
        list.add(new Modelclass("3251 + 587 + 369 - ? = 3007","1250","1300","1375","1200","1200"));
        list.add(new Modelclass("4500 × ? = 3375","2/5","3/4","1/4","3/5","3/4"));
        list.add(new Modelclass("8988 ÷ 8 ÷ 4 = ?","4494","561.75","2247","280.875","280.875"));
        list.add(new Modelclass("666 ÷ 6 ÷ 3 =?","37","333","111","84","37"));
        list.add(new Modelclass("217 × 217 + 183 × 183 = ?","79698","80578","80698","81268","80578"));
        list.add(new Modelclass("106 × 106 - 94 × 94 = ?","2400","2000","1904","1906","2400"));
        list.add(new Modelclass("On dividing a number by 68, we get 269 as quotient and 0 as remainder. On dividing the same number by 67, what will br the remainder","0","1","2","3","1"));
        list.add(new Modelclass("On dividing a number by 56, we get 29 as remainder. On dividing the same number by 8, what will be the remainder","4","5","6","7","5"));
        list.add(new Modelclass("The difference of two numbers is 1365. On dividing the large number by smaller, we get 6 as quotient and 15 as remainder. What is the smaller number","240","270","295","360","270"));
        list.add(new Modelclass("(1² + 2² + 3² + ... + 10²) = ?","330","345","365","385","385"));
        list.add(new Modelclass("The sum of the four consecutive even numbers is 44. What is the sum of the squares of these numbers ?","288","502","696","None","None"));
        list.add(new Modelclass("The sum of the four consecutive even numbers is 284. What would be  the smallest number ?","72","74","68","66","68"));
        list.add(new Modelclass("What is 25% of 75% of (3/5)th of 4240 ?","595","424","348","477","477"));
        list.add(new Modelclass("The average of first 10 prime numbers is?","11.9","12.7","12.9","13.7","12.9"));
        list.add(new Modelclass("If a number is subtracted from its square we get 272. Find the number?","24","14","17","22","17"));
        list.add(new Modelclass("If 70% of an equal to 40% of b, then ratio between a and b is?","4 : 7","7 : 4","7 : 11","None","4 : 7"));
        list.add(new Modelclass("Two third of three- fifth of one fourth of a number is 24, what is 30% of that number?","42","72","90","69","72"));
        list.add(new Modelclass("One half of a two digit number exceeds its one third by 6. What is the sum of the digits of the number?","3","5","7","9","9"));
        list.add(new Modelclass("Three seventh of a number is 12 more than 40% of that number. What will be the 60% of that number?","148","210","126","248","126"));
        list.add(new Modelclass("If n is a natural number, then (6n² + 6n) is always divisible by : ","6 only","Both 6 and 12","12 only","by 18 only","Both 6 and 12"));
        list.add(new Modelclass("(11² + 12² + 13² + ... + 20²) = ?","385","2485","2870","3255","2485"));
        list.add(new Modelclass("The sum of how many terms of the series 6 + 12 + 18 + 24 + ... is 1800","16","24","20","18","24"));


        listavg = new ArrayList<>();
        listavg.add(new Modelclass("In the first 10 overs of a cricket game, the run rate was only 3.2. What should be the run rate in the remaining 40 overs to reach the target of 282 runs?","6.25","6.5","6.75","7","6.25"));
        listavg.add(new Modelclass("A grocer has a sale of Rs. 6435, Rs. 6927, Rs. 6855, Rs. 7230 and Rs. 6562 for 5 consecutive months. How much sale must he have in the sixth month so that he gets an average sale of Rs. 6500?","Rs. 4991","Rs. 5991","Rs. 6001","Rs. 6991","Rs. 4991"));
        listavg.add(new Modelclass("The average of 20 numbers is zero. Of them, at the most, how many may be greater than zero?","0","1","10","19","19"));
        listavg.add(new Modelclass("The average weight of 8 person's increases by 2.5 kg when a new person comes in place of one of them weighing 65 kg. What might be the weight of the new person?","76 kg","76.5 kg","85 kg","Data inadequate","85 kg"));
        listavg.add(new Modelclass("The captain of a cricket team of 11 members is 26 years old and the wicket keeper is 3 years older. If the ages of these two are excluded, the average age of the remaining players is one year less than the average age of the whole team. What is the average age of the team?","23 years","24 years","25 years","None of these","23 years"));
        listavg.add(new Modelclass("The average monthly income of P and Q is Rs. 5050. The average monthly income of Q and R is Rs. 6250 and the average monthly income of P and R is Rs. 5200. The monthly income of P is :","3500","4000","4050","5000","4000"));
        listavg.add(new Modelclass("The average age of husband, wife and their child 3 years ago was 27 years and that of wife and the child 5 years ago was 20 years. The present age of the husband is :","35 years","40 years","50 years","None of these","40 years"));
        listavg.add(new Modelclass("A car owner buys petrol at Rs.7.50, Rs. 8 and Rs. 8.50 per litre for three successive years. What approximately is the average cost per litre of petrol if he spends Rs. 4000 each year?","Rs. 7.98","Rs. 8","Rs. 8.50","Rs. 9","Rs. 7.98"));
        listavg.add(new Modelclass("The average weight of A, B and C is 45 kg. If the average weight of A and B be 40 kg and that of B and C be 43 kg, then the weight of B is :","17 kg","20 kg","26 kg","31 kg","31 kg"));
        listavg.add(new Modelclass("The average weight of 16 boys in a class is 50.25 kg and that of the remaining 8 boys is 45.15 kg. Find the average weights of all the boys in the class.","47.55 kg","48 kg","48.55 kg","49.25 kg","48.55 kg"));
        listavg.add(new Modelclass("A library has an average of 510 visitors on Sundays and 240 on other days. The average number of visitors per day in a month of 30 days beginning with a Sunday is :","250","276","280","285","285"));
        listavg.add(new Modelclass("If the average marks of three batches of 55, 60 and 45 students respectively is 50, 55, 60, then the average marks of all the students is :","53.33","54.68","55","None of these","54.68"));
        listavg.add(new Modelclass("A pupil's marks were wrongly entered as 83 instead of 63. Due to that the average marks for the class got increased by half (1/2). The number of pupils in the class is :","10","20","40","73","40"));
        listavg.add(new Modelclass("A batsman in his 17th innings makes a score of 85 and their by increasing his average by 3. What is his average after the 17th innings ?","34","35","36","37","37"));
        listavg.add(new Modelclass("The average of first 10 natural numbers is ?","5","5.5","6","6.5","5.5"));
        listavg.add(new Modelclass("The average age of three boys is 15 years and their ages are in proportion 3:5:7. What is the age in years of the youngest boy ?","9","12","15","18","9"));
        listavg.add(new Modelclass("The average of 9 observations was 9, that of the 1st of 5 being 10 and that of the last 5 being 8. What was the 5th observation ?","6","7","8","9","9"));
        listavg.add(new Modelclass("A batsman makes a score of 64 runs in the 16th innings and thus increased his average by 3. Find his average after the 16th inning ?","17","18","19","20","19"));
        listavg.add(new Modelclass("The average of 10 numbers is 23. If each number is increased by 4, what will the new average be ?","23","25","27","29","27"));
        listavg.add(new Modelclass("Find the average of the series : 312, 162, 132, 142 and 122 ?","162","174","186","198","174"));


        listpat = new ArrayList<>();
        listpat.add(new Modelclass("A and B invest in a business in the ratio 3 : 2. If 5% of the total profit goes to charity and A's share is Rs. 855, the total profit is :","500","1000","1500","2000","1500"));
        listpat.add(new Modelclass("A, B and C enter into a partnership and their shares are in the ratio 1/2 : 1/3 : 1/4. After 2 months, A withdraws half of his capital and after 10 months, a profit of Rs. 378 is divided among them. What is B's share ?","144","169","225","339","144"));
        listpat.add(new Modelclass("A, B, C started a business with their investments in the ratio 1:3 :5. After 4 months, A invested the same amount as before and B as well as C withdrew half of their investments. The ratio of their profits at the end of the year is :","1 : 2 : 3","3 : 4 : 15","3 : 5 : 10","5 : 6 : 10","5 : 6 : 10"));
        listpat.add(new Modelclass("A, B, C rent a pasture. A puts 10 oxen for 7 months, B puts 12 oxen for 5 months and C puts 15 oxen for 3 months for grazing. If the rent of the pasture is Rs. 175, how much must C pay as his share of rent?","Rs. 45","Rs. 50","Rs. 55","Rs. 60","Rs. 45"));
        listpat.add(new Modelclass("A began a business with Rs. 85,000. He was joined afterwards by B with Ks. 42,500. For how much period does B join, if the profits at the end of the year are divided in the ratio of 3 : 1 ?","4 months","5 months","6 months","8 months","8 months"));
        listpat.add(new Modelclass("If 4 (A's capital) = 6 (B's capital) = 10 (C's capital), then out of a profit of Rs. 4650, C will receive ____","Rs. 700","Rs. 800","Rs. 900","Rs. 1000","Rs. 900"));
        listpat.add(new Modelclass("A and B are partners in a business. A contributes 1/4 of the capital for 15 months and B received 2/3 of the profit. For how long B's money was used ?","3 months","6 months","10 months","12 months","10 months"));
        listpat.add(new Modelclass("A and B started a business jointly A's investment was thrice the investment of B and the period of his investment was two times the period of investment of B. If B received Rs. 4000 as profit, then their total profit is :","22000","28000","32000","36000","28000"));
        listpat.add(new Modelclass("A, B and C enter into a partnership with a capital in which A's contribution is Rs. 10,000. If out of a total profit of Rs. 1000, A gets Rs. 500 and B gets Rs. 300, then C's capital is :","4000","5000","6000","7000","4000"));
        listpat.add(new Modelclass("A and B start a business jointly. A invests Rs. 16,000 for 8 months and B remains in  the business for 4 months, Out of total profit, B claims - of the profit. How much money was contributed by B ?","12000","12800","13000","14500","12800"));
        listpat.add(new Modelclass("A and B began business with Rs.3000 and Rs.4000 after 8 months, A withdraws Rs.1000 and B advances Rs.1000 more. At the end of the year, their profits amounted to Rs.630 find the share of A ?","Rs. 240","Rs. 75","Rs. 125","Rs. 354","Rs. 240"));
        listpat.add(new Modelclass("Reena and Shaloo are partners in a business, Reena invests Rs, 35,000 for 8 months and Shaloo invests Rs. 42,000 for 10 months, out of a profit of  Rs. 31,570, Reena's share is :","12628","18245","11235","10253","12628"));
        listpat.add(new Modelclass("X and Y invested in a business. They earned some profit which they divided in the ratio of 2 : 3. If X invested Rs. 40,000, the amount invested by Y is :","20000","40000","60000","80000","60000"));
        listpat.add(new Modelclass("Simran started a software business by investing Rs. 50,000. After six months, Nanda joined her with a capital of Rs. 80,000. After 3 years, they earned a profit of Rs. 24,500. What was Simran's share in the profit ?","10110","10500","12000","13000","10500"));
        listpat.add(new Modelclass("A, B, C hired a car for Rs. 520 and used it for 7, 8 and 11 hours respectively. Hire charges paid by B were :","150","160","170","180","160"));
        listpat.add(new Modelclass("A starts business with Rs. 3500 and after 5 months, B joins with A as his partner. After a year, the profit is divided in the ratio 2 : 3. What is B's contribution in the capital?","Rs. 7500","Rs. 8000","Rs. 8500","Rs. 9000","Rs. 9000"));
        listpat.add(new Modelclass("A, B, C subscribe Rs. 50,000 for a business, A Subscribes Rs. 4000 more than B and B Rs. 5000 more thanC. Out of a total profit  of Rs. 35,000, A receives :","14700","15000","12000","13500","14700"));
        listpat.add(new Modelclass("Rs.1200 divided among P, Q and R. P gets half of the total amount received by Q and R. Q gets one-third of the total amount received by P and R. Find the amount received by R ?","Rs. 1100","Rs. 500","Rs. 1200","Rs. 700","Rs. 500"));
        listpat.add(new Modelclass("Anand and Deepak started a business investing Rs. 22,500 and Rs. 35,000 respectively. Out of a total profit of Rs. 13,800, Deepak's share is :","8400","8200","8100","8000","8400"));
        listpat.add(new Modelclass("P and Q started a business investing Rs, 85,000 and Rs. 15,000 respectively. In what ratio the profit named after 2 years bo divided between P and Q respectively ?","17 : 23","17 : 3","17 : 33","3 : 4","17 : 3"));
        listpat.add(new Modelclass("A,B and C enter into a partnership in the ratio  7/2 : 4/3 : 6/5. After 4 months, A increases his share by 50%. If the total profit at the end of one year be Rs. 21600, then B's share in the profit is :","Rs. 4000","Rs. 6000","Rs. 9000","Rs. 3000","Rs. 4000"));
        listpat.add(new Modelclass("In a business, A and C invested amounts in the ratio 2:1, whereas the ratio between amounts invested by A and B was 3:2. If Rs. 1,57,300 was their profit, how much amount did B receive ?","48400","54200","64000","74000","48400"));
        listpat.add(new Modelclass("A, B and C enter into a partnership and their shares are in the ratio 1/2 : 1/3 : 1/4. After 2 months, A withdraws half of his capital and after 10 months, a profit of Rs. 378 is divided among them. What is B's share ?","144","169","225","339","144"));
        listpat.add(new Modelclass("A sum of Rs. 427 is to be divided among A, B and C in such a way that 3 times A’s share, 4 times B’s share and 7 times C’s share are all equal. The share of C is ?","64","76","84","98","84"));
        listpat.add(new Modelclass("Three friends had dinner at a restaurant. When the bill was received, Akshitha paid 2/3 as much as Veena paid and Veena paid 1/2 as much as Lasya paid. What fraction of the bill did Veena pay ?","11/3","2/13","3/11","13/4","3/11"));

        listages = new ArrayList<>();
        listages.add(new Modelclass("A father said his son , ' I was as old as you are at present at the time of your birth.' If the father age is 38 now, the son age 5 years back was :","14","19","33","38","14"));
        listages.add(new Modelclass("In 10 years, A will be twice as old as B was 10 years ago. If A is now 9 years older than B, the present age of B is :","19","29","39","49","39"));
        listages.add(new Modelclass("The total age of A and B is 12 years more than the total age of B and C. C is how many years younger than A ?","12","13","14","15","12"));
        listages.add(new Modelclass("The sum of the present ages of a father and his son is 60 years. five years ago, father's age was four times the age of the son. so now the son's age will be:","5","10","15","20","15"));
        listages.add(new Modelclass("Rajeev's age after 15 years will be 5 times his age 5 years back. What is the present age of rajeev?","12","14","22","10","10"));
        listages.add(new Modelclass("'I am five times as old as you were, when I was as old as you are', said a man to his son. Find out their present ages, if the sum of their ages is 64 years ?","Father = 50; Son =14","Father = 40; Son =24","Father = 60; Son =4"," Father = 48; Son =16","Father = 40; Son =24"));
        listages.add(new Modelclass("The average age of a class is 15.8 years. The average age of the boys in the class is 16.4 years and that of the girls is 15.4 years. What is the ratio of boys to girls in the class ?","1 : 3","2 : 3","3 : 2","3 : 1","2 : 3"));
        listages.add(new Modelclass("A person's present age is two-fifth of the age of his mother. After 8 years, he will be one-half of the age of his mother. How old is the mother at present ?","36 years","38 years","40 years","42 years","40 years"));
        listages.add(new Modelclass("When I was married 10 years ago my wife is the 6th member of the family. Today my father died and a baby born to me.The average age of my family during my marriage is same as today. What is the age of Father when he died ?","50 years","60 years","70 years","65 years","60 years"));
        listages.add(new Modelclass("Sivagami is 2 years elder than Meena. After 6 years the total of their ages will be 7 times of their current age. Then age of Sivagami is :","19 years","17 years","15 years","data inadequate","data inadequate"));
        listages.add(new Modelclass("If 6 years are subtracted from the present age of Arun and the remainder is divided by 18, then the present age of his grandson Gokul is obtained. If Gokul is 2 years younger to Madan whose age is 5 years, then what is the age of Arun ?","72 years","54 years","60 years","47 years","60 years"));
        listages.add(new Modelclass("The ages of Krish and Vaibhav are in the proportion of 3 : 5. After 9 years, the proportion of their ages will be 3 : 4. Then the current age of Vaibhav is:","10","13","15","18","15"));
        listages.add(new Modelclass("The ratio of the ages of Maala and Kala is 4 : 3. The total of their ages is 2.8 decades. The proportion of their ages after 0.8 decades will be [1 Decade = 10 years]","4 : 3","12 : 11","7 : 4","6 : 5","6 : 5"));
        listages.add(new Modelclass("The ages of X and Y are in the proportion of 6:5 and total of their ages is 44 years. The proportion of their ages after 8 years will be","3 : 6","6 : 3","8 : 7","9 : 5","8 : 7"));
        listages.add(new Modelclass("Raju got married 8years ago. His present age is 6/5 times his age at the time of his marriage  Raju's sister was 10years younger to him at the time of his marriage. The present age of Raju's sister is  ?","30","32","38","None","38"));
        listages.add(new Modelclass("Six years ago Anita was P times as old as Ben was. If Anita is now 17 years old, how old is Ben now in terms of P ?","11/P + 6","P/11 +6","17 - P/6","17/P","11/P + 6"));
        listages.add(new Modelclass("Eight years ago, Ajay's age was 4/3 times that of Vijay. Eight years hence, Ajay's age will be 6/5 times that of Vijay. What is the present age of Ajay ?","41 years","40 years","37 years","33 years","40 years"));
        listages.add(new Modelclass("Ratio of the ages of Mahesh and Nilesh is 5 : x. Mahesh is 18 years younger to Ramesh. After nine years Ramesh will be 47 years old. If the difference between the ages of Mahesh and Nilesh is same as the age of Ramesh, what is the value of x ?","11.8","12.9","13.7","14.5","14.5"));
        listages.add(new Modelclass("Mother’s age today is thrice as her daughter’s. After 10 years it would be just double. How old is the daughter today ?","8 years","9 years","10 years","11 years","10 years"));
        listages.add(new Modelclass("Sachin is younger than Rahul by 7 years. If the ratio of their ages is 7:9, find the age of Sachin","24.5","25.5","26.5","27.5","24.5"));
        listages.add(new Modelclass("A man’s current age is 2/5 of the age of his father. After 8 years, he will be 1/2 of the age of his father. What is the age of father at now ?","50","40","33","30","40"));
        listages.add(new Modelclass("The age of a person is thrice the total ages of his 2 daughters. 0.5 decades hence, his age will be twice of the total ages of his daughters. Then what is the father’s current age? [0.5 Decades = 5 Years]","35 years","40 years","45 years","47 years","45 years"));
        listages.add(new Modelclass("Sum of the ages of Rajesh, Suresh, Mahesh and Dinesh is 76 years. 7 years hence, their age ratio is 7:6:5:8. Find Mahesh’s present age ?","17 years","13 years","14 years","16 years","13 years"));
        listages.add(new Modelclass("A man is 24 years older than his son. In two years, his age will be twice the age of his son. The present age of his son is","20","21","22","23","22"));
        listages.add(new Modelclass("If Raj was one-third as old as Rahim 5 years back and Raj is 17 years old now, How old is Rahim now?","40","41","36","48","41"));


        listcoding = new ArrayList<>();
        listcoding.add(new Modelclass("In a certain code language COMPUTER is written as RFUVQNPC. How will MEDICINE be written in that code language?","MFEDJJOE","EOJDEJFM","MFEJDJOE","EOJDJEFM","EOJDJEFM"));
        listcoding.add(new Modelclass("If ROSE is coded as 6821, CHAIR is coded as 73456 and PREACH is coded as 961473, what will be the code for SEARCH ?","246173","214673","214763","216473","214673"));
        listcoding.add(new Modelclass("If Z = 52 and ACT = 48, then BAT will be equal to","39","41","44","46","46"));
        listcoding.add(new Modelclass("In a certain code, MONKEY is written as XDJMNL. How is TIGER written in that code ?","SHFDQ","HFDSQ","RSAFD","QDFHS","QDFHS"));
        listcoding.add(new Modelclass("If FRIEND is coded as HUMJTK, how is CANDLE written in that code ?","EDRIRL","DCQHQK","ESJFME","DEQJQM","EDRIRL"));
        listcoding.add(new Modelclass("If Z= 2197 and R= 729. How would J be written in that code?","216","124","512","125","125"));
        listcoding.add(new Modelclass("If air is called green , green is called blue, blue is called sky, sky is called yellow, yellow is called water and water is called pink, then what is the color of clear sky ?","Blue","Sky","Yellow","Water","Sky"));
        listcoding.add(new Modelclass("If in a code language, COULD is written as BNTKC and MARGIN is written as LZQFHM, how will MOULDING be written in that code ?","CHMFINTK","LNKTCHMF","LNTKCHMF","NITKHCMF","LNTKCHMF"));
        listcoding.add(new Modelclass("Acording to a military code, SYSTEM is SYSMET and NEARER is AENRER. What is the code for FRACTION ?","CARFTINO","CARFTION","ARFCNOIT","CARFNOIT","CARFNOIT"));
        listcoding.add(new Modelclass("If MADRAS can be written as NBESBT, how can BOMBAY be written in that code ?","CPNCBX","CPNCBZ","CPOCBZ","CQOCBZ","CPNCBZ"));
        listcoding.add(new Modelclass("If HAT is coded as 'jcv' then what will GUN be coded as?","iwp","IKM","kip","Klp","iwp"));
        listcoding.add(new Modelclass("If green means red, red means yellow, yellow means blue, blue means orange and orange means green, what is the colour of clean sky ?","Blue","Green","Yellow","Orange","Yellow"));
        listcoding.add(new Modelclass("If train is called bus, bus is called tractor, tractor is called car, car is called scooter, scooter is called bicycle, bicycle is called moped, which is used to plough a field ?","Train","Bus","Tractor","Car","Car"));
        listcoding.add(new Modelclass("In a certain coding language, iF GO = 32 & SHE = 49 then SOME will be equal to ?","56","58","62","64","56"));
        listcoding.add(new Modelclass("If in a certan language FASHION is coded as FOIHSAN, how is PROBLEM codedin that code?","PELBORM","PRBOELM","RPBOELM","RPBOELM","PELBORM"));
        listcoding.add(new Modelclass("In a certain code language STUDENT is written as TUTDNES.How will SOURCES be writte in that code language?","SOURCES","SUORECS","SRUOCES","SOURSEC","SUORECS"));
        listcoding.add(new Modelclass("If E = 5 and READ is coded as 7, then what is the code of 'DEAR' ?","6","7","8","9","7"));
        listcoding.add(new Modelclass("In a certain code language , 'PROBLEM' is written as MPERLOB. How will 'PROBLEM' is written as MPERLOB. How will 'NUMBERS' be written in that code?","SNUREMB","SNRUBME","SNRUEMB","SNRUMEB","SNRUEMB"));
        listcoding.add(new Modelclass("If 'L' stands for '+' , 'M' stands for '-' , N stands for 'x' , P stands for '÷' then 14 N 10 L 42 P 2 M 8 = ?","153","216","248","251","153"));
        listcoding.add(new Modelclass("In a certain code language 'how many goals scored' is written as '5397'; 'many more matches' is written as '982'; and 'he scored five' is written as '163'. How is 'goals' written in that code language ?","5","7","3","Data inadequate","Data inadequate"));
        listcoding.add(new Modelclass("In a certain code language ‘ROUTINE’ is written as 'VMRGFLI'. How will 'CRUELTY' be written in that code language ?","UPVCZLR","VPCVZRL","CVCPZRL","VCPCZLR","VPCVZRL"));
        listcoding.add(new Modelclass("If in a certain language if ENTRY is coded as 12345 and STEADY is coded as 931785, then state which is the correct code for below word. NEATNESS","25196577","21732199","21362199","21823698","21732199"));
        listcoding.add(new Modelclass("In a certain code, '247' means 'spread red carpet' ; '256' means 'dust one carpet' and '234' means 'one red carpet'. Which digit in that code means 'dust' ?","2","3","5","6","5"));
        listcoding.add(new Modelclass("If wall is called window, window is called door, door is called floor, floor is callled roof and roof is callled ventilator, what will a person stand on ?","Window","Wall","Floor","Roof","Roof"));
        listcoding.add(new Modelclass("In a certain code language CONCENTRATION is written as QQJGZIGQGDMLX. How will NITRIFICATION be written in that code language?","QQJGZXRIKSGRM","QQJGYXRIKSGRM","QQJGZXRIKSGRN","QQJGZRIKSGSM","QQJGZXRIKSGRM"));
        listcoding.add(new Modelclass("In a certain code language 'TEARS' is written as 'UGDVX', then 'SMILE' would be written as:","TOLPJ","TOLNG","TOJPJ","TOKNH","TOLPJ"));
        listcoding.add(new Modelclass("If MILITARY can be written as 1, 2, 3, 2, 4, 5, 6, 7 then how can TIMLI be written in that code ?","2, 3, 1, 4, 2","4, 2, 1, 5, 7"," 3, 4, 5, 1, 6","4, 2, 1, 3, 2","4, 2, 1, 3, 2"));
        listcoding.add(new Modelclass("In a certain code language, 'how can you go' is written as 'ja da ka pa', 'can you come here' is written as 'na ka sa ja' and 'cone and go' is written as 'ra pa sa'. How is 'here' written in that code ?","na","ja","sa","None","na"));
        listcoding.add(new Modelclass("If in a certain language CHARCOAL is coded as 45164913 and MORALE is coded as 296137, how are the following words coded in that language ? REAL","8519","6713","6513","6719","6713"));
        listcoding.add(new Modelclass("If in a certain code language, 'oka peru' means 'fine cloth' ; 'meta lisa' means 'clear water' and 'dona lisa peru' means 'fine clear weather' , which word in that language means 'weather' ?","peru","oka","meta","dona","dona"));


        listratios = new ArrayList<>();
        listratios.add(new Modelclass("A bag contains 50 P, 25 P and 10 P coins in the ratio 5: 9: 4, amounting to Rs. 206. Find the number of coins of each type respectively.","360, 160, 200","160, 360, 200","200, 360,160","200,160,300","200, 360,160"));
        listratios.add(new Modelclass("Two numbers are respectively 20% and 50% more than a third number. The ratio of the two numbers is:","2 : 5","3 : 5","4 : 5","5 : 4","4 : 5"));
        listratios.add(new Modelclass("Salaries of Ravi and Sumit are in the ratio 2:3. If the salary of each is increased by Rs. 4000, the new ratio becomes 40:57. What is Sumit's salary?","38000","46800","36700","50000","38000"));
        listratios.add(new Modelclass("A sum of Rs.312 was divided among 100 boys and girls in such a way that the boy gets Rs.3.60 and each girl Rs. 2.40 the number of girls is","35","40","45","50","40"));
        listratios.add(new Modelclass("If Rs. 782 be divided into three parts, proportional to 1/2 : 2/3 : 3/4, then the first part is?","Rs. 182","Rs. 190","Rs. 192","Rs. 204","Rs. 204"));
        listratios.add(new Modelclass("If 0.75 : x :: 5 : 8, then x is equal to:","1.12","1.16","1.20","1.30","1.20"));
        listratios.add(new Modelclass("The compounded ratio of (2 : 3), (6: 11) and (11 :2) is","1 : 2","2 : 1","11 : 24","36 : 121","2 : 1"));
        listratios.add(new Modelclass("A mixture contains alcohol and water in the ratio 4 : 3. If 5 liters of water is added to the mixture, the ratio becomes 4: 5. Find the quantity of alcohol in the given mixture.","10","12","15","18","10"));
        listratios.add(new Modelclass("The salaries of A, B, and C are in the ratio of 1 : 2 : 3. The salary of B and C together is Rs. 6000. By what percent is the salary of C more than that of A?","100 %","200 %","300 %","600 %","200 %"));
        listratios.add(new Modelclass("A sum of Rs. 427 is to be divided among A, B and C such that 3 times A’s share, 4 tunes B’s share and 7 times C’s share are all equal. The share of C is :","84","140","196","240","84"));
        listratios.add(new Modelclass("Seats for Mathematics, Physics and Biology in a school are in the ratio 5:7:8. There is a proposal to increase these seats by 40%, 50% and 75% respectively. What will be the ratio of increased seats ?","1:2:3","2:3:4","3:4:5","4:5:6","2:3:4"));
        listratios.add(new Modelclass("In a zoo, there are rabbits and pigeons. If heads are counted, there are 340 heads and if legs are counted there are 1060 legs.How many pigeons are there?","120","150","170","180","150"));
        listratios.add(new Modelclass("The third proportional to 9 and 12 is ?","14","16","18","20","16"));
        listratios.add(new Modelclass("If 76 is divided into four parts proportional to 7, 5, 3, 4, then the smallest part is:","12","15","16","19","12"));
        listratios.add(new Modelclass("Jo's collection contains US, Indian and British stamps. If the ratio of US to Indian stamps is 5 to 2 and the ratio of Indian to British stamps is 5 to 1, what is the ratio of US to British stamps?","10 : 5","15 : 2","20 : 2","25 : 2","25 : 2"));
        listratios.add(new Modelclass("A dog takes 3 leaps for every 5 leaps of a hare. If one leap of the dog is equal to 3 leaps of the hare, the ratio of the speed of the dog to that of the hare is :","9 : 5","2 : 3","4 : 7","5 : 6","9 : 5"));
        listratios.add(new Modelclass("If the ratio of the ages of two friends A and B is in the ratio 3 : 5 and that of B and C is 3 : 5 and the sum of their ages is 147, then how old is B?","27 years","75 years","45 years","49 years","45 years"));
        listratios.add(new Modelclass("In a college, the ratio of the number of boys to girls is 8 : 5. If there are 160 girls, the total number of students in the college is","100","250","260","416","416"));
        listratios.add(new Modelclass("The wages of labourers in a factory increases in the ratio 22:25 and there was a reduction in the number of labourers in the ratio 15:11. Find the original wage bill if the present bill is Rs. 5000 ?","Rs. 5500","Rs. 6000","Rs. 6200","Rs. 6350","Rs. 6000"));
        listratios.add(new Modelclass("The number of oranges in three baskets are in the ratio of 3 : 4 : 5. In which ratio the no. of oranges in first two baskets must be increased so that the new ratio   becomes 5 : 4 : 3?","1 : 3","2 : 1","3 : 4","2 : 3","2 : 1"));
        listratios.add(new Modelclass("The ratio of male and female in a city is 7 : 8 respectively and percentage of children among male and female is 25 and 20 respectively. If number of adult females is 156800, what is the total population of the city?","4,12,480","3,67,500","5,44,700","2,98,948","3,67,500"));
        listratios.add(new Modelclass("A child has three different kinds of chocolates costing  Rs.2, Rs.5, Rs.10.  He spends total Rs. 120 on the chocolates. what is the minimum possible number of chocolates he can buy, if there must be  atleast one chocolate of each kind?","22","19","17","15","17"));
        listratios.add(new Modelclass("Pencils, Pens and Exercise books in a shop are in the ratio of 10: 2 : 3. If there are 120 pencils, the number of exercise books in the shop is:","26","36","46","56","36"));
        listratios.add(new Modelclass("Vinod have 20 rupees. He bought 1, 2, 5 rupee stamps. They are different in numbers by the reason of no change, the shop keeper gives 3 one rupee stamps. So how many stamps Vinod have ?","10","18","12","15","10"));
        listratios.add(new Modelclass("In a fort, there are 1200 soldiers. If each soldier consumes 3 kg per day, the provisions available in the fort will last for 30 days. If some more soldiers join, the provisions available will last for 25 days given each soldier consumes 2.5 kg per day. Find the number of soldiers joining the fort in that case ?","693","741","528","654","528"));
        listratios.add(new Modelclass("In a class of 39 students the ratio of boys and girls is 2 : 1. Radhika ranks 15th among all the students from top and 8th among girls from bottom. How many boys are there below Radhika ?","9","17","11","15","17"));
        listratios.add(new Modelclass("The sum of three numbers is 98. If the ratio of the first to second is 2 : 3 and that of the second to the third is 5 : 8, then the second number is:","10","20","30","40","30"));

        listdecimals = new ArrayList<>();
        listdecimals.add(new Modelclass("When 0.232323.... is converted into a fraction , then the result is ","1 / 5","2 / 9","23 / 99","23 / 100","23 / 99"));
        listdecimals.add(new Modelclass("Which of the following fractions is greater than  3 /4 and less than 5 / 6 ?","3 / 5","4 / 5","7 / 5","9 / 5","4 / 5"));
        listdecimals.add(new Modelclass("If 1.5x = 0.04y, then the value of ( (y - x) / (y+x) ) is :","73 / 77","7.3 / 77","730 / 77","7300 / 77","73 / 77"));
        listdecimals.add(new Modelclass("When 0.36 is written in simplest form, the sum of the numerator and the denominator is :","15","34","64","13","34"));
        listdecimals.add(new Modelclass("A tailor has 37.5 metres of cloth and he has to make 8 pieces out of a metre of cloth. How many pieces can he make out this cloth ?","300","360","400","450","300"));
        listdecimals.add(new Modelclass("What will come in place of question mark in the following equation ?  54.(?)3 + 543 + 5.43 = 603.26","6","1","9","8","8"));
        listdecimals.add(new Modelclass("3 x 0.3 x 0.03 x 0.003 x 30 =?","0.0000243","0.000243","0.00243","0.0243","0.00243"));
        listdecimals.add(new Modelclass("If 47. 2506 = 4 x A + 7/B + 2 x C + 5/D + 6 x E, then the value of 5 x A + 3 x B + 6 x C + D + 3 x E is :","55.6003","53.603","153.6003","213.003","153.6003"));
        listdecimals.add(new Modelclass("A person was asked to state his age in years. His reply was , 'Take my age 3 years hence, multiply it by 3 and subtract 3 times my age 3 years ago and you will know how old I am.' What was the age of the person ?","18","20","24","30","18"));
        listdecimals.add(new Modelclass("4.036 divided by 0.04 gives ","1.009","10.09","100.9","None","100.9"));
        listdecimals.add(new Modelclass("The price of commodity X increases by 40 paise every year, while the price of commodity Y increases  by 15 paise every year. If in 2001, the price of commodity X was Rs. 4.20 and that of Y was Rs. 6.30, in which year commodity X will cost 40 paise more than the commodity?","2010","2011","2012","2013","2011"));
        listdecimals.add(new Modelclass("When 52416 divided by 312 , the quotient is 168. What will be the quotient when 52.416 is  divided by 0.0168 ?","3120","32.10","321.0","3.120","3120"));
        listdecimals.add(new Modelclass("125 over 1000 in Simplest Form?","2/9","1/8","3/8","4/7","1/8"));
        listdecimals.add(new Modelclass("How many digits will be there to the right of the decimal point in the product of 95.75 and 0.2554 ?","6","7","8","9","6"));
        listdecimals.add(new Modelclass("The number 0.127 is how much greater than 1/8 ?","1/100","1/1500","1/2","1/500","1/500"));
        listdecimals.add(new Modelclass("What will be the vulgar fraction of 0.75 ?","3/5","3/4","3/2","3/7","3/4"));
        listdecimals.add(new Modelclass("0.002 x 0.5 = ?","0.0001","0.001","0.01","0.1","0.001"));
        listdecimals.add(new Modelclass("Correct expression of   6.46 is","640/99","640/90","64000/99","640/9","640/99"));
        listdecimals.add(new Modelclass("The rational for the recurring decimal 0.125125......is","125/99","125/999","125/9999","125/9","125/999"));
        listdecimals.add(new Modelclass("What is the difference between the biggest and the smallest fraction among 2/3 , 3/4 , 4/5 and 5/6?","1/6","1/12","1/20","1/30","1/6"));
        listdecimals.add(new Modelclass("138.009 + 341.981 - 146.305 = 123.6 + ?","120.085","199.57","295.05","None","None"));
        listdecimals.add(new Modelclass("When 52416 is divided by 312, the quotient is 168. what will be the quotient when 52.416 is divided by 0.0168?","3.12","312","3120","None","3120"));
        listdecimals.add(new Modelclass("What is the quotient of 18/1000?","1.8","0.18","0.018","0.0018","0.018"));
        listdecimals.add(new Modelclass("When 0.46 is written in simplest form, the sum of the numerator and the denominator is  ?","69","73","96","41","73"));
        listdecimals.add(new Modelclass("Express 0.875 and 0.375 as a Fraction.","3/11 & 7/11","7/9 & 9/13","7/8 & 3/8","7/9 & 9/11","7/8 & 3/8"));


        listprobability = new ArrayList<>();
        listprobability.add(new Modelclass("A problem is given to three students whose chances of solving it are 1/2, 1/3 and 1/4 respectively. What is the probability that the problem will be solved?","1/4","1/2","3/4","7/12","3/4"));
        listprobability.add(new Modelclass("Tickets numbered 1 to 20 are mixed up and then a ticket is drawn at random. What is the probability that the ticket drawn has a number which is a multiple of 3 or 5?","1/2","3/5","9/20","8/15","9/20"));
        listprobability.add(new Modelclass("Two cards are drawn at random from a pack of 52 cards.what is the probability that either both are black or both are queen?","52/221","55/190","55/221","19/221","55/221"));
        listprobability.add(new Modelclass("In a lottery, there are 10 prizes and 25 blanks. A lottery is drawn at random. What is the probability of getting a prize?","2/7","5/7","1/5","1/2","2/7"));
        listprobability.add(new Modelclass("A man and his wife appear in an interview for two vacancies in the same post. The probability of husband's selection is (1/7) and the probability of wife's selection is (1/5). What is the probability that only one of them is selected ?","2/7","1/7","3/4","4/5","2/7"));
        listprobability.add(new Modelclass("From a pack of 52 cards, two cards are drawn together at random. What is the probability of both the cards being kings?","1/15","1/221","25/57","35/256","1/221"));
        listprobability.add(new Modelclass("One card is drawn at random from a pack of 52 cards. What is the probability that the card drawn is a face card (Jack, Queen and King only)?","3/13","1/13","3/52","9/52","3/13"));
        listprobability.add(new Modelclass("In a box, there are 8 red, 7 blue and 6 green balls. One ball is picked up randomly. What is the probability that it is neither red nor green?","1/3","3/5","8/21","7/21","1/3"));
        listprobability.add(new Modelclass("A bag contains 6 black and 8 white balls. One ball is drawn at random. What is the probability that the ball drawn is white?","3/7","4/7","1/8","3/4","4/7"));
        listprobability.add(new Modelclass("Two cards are drawn together from a pack of 52 cards. The probability that one is a spade and one is a heart, is:","3/20","29/34","47/100","13/102","13/102"));
        listprobability.add(new Modelclass("What is the probability of getting a sum 9 from two throws of a dice?","1/2","3/4","1/9","2/9","1/9"));
        listprobability.add(new Modelclass("Three unbiased coins are tossed. What is the probability of getting at most two heads?","3/4","7/8","1/2","1/4","7/8"));
        listprobability.add(new Modelclass("Three unbiased coins are tossed.What is the probability of getting at least 2 heads?","1/4","1/2","3/4","1/3","1/2"));
        listprobability.add(new Modelclass("A basket contains 10 apples and 20 oranges out of which 3 apples and 5 oranges are defective. If we choose two fruits at random, what is the probability that either both are oranges or both are non defective?","136/345","17/87","316/435","158/435","316/435"));
        listprobability.add(new Modelclass("In a class, there are 15 boys and 10 girls. Three students are selected at random. The probability that 1 girl and 2 boys are selected, is:","21/46","1/5","3/25","1/50","21/46"));
        listprobability.add(new Modelclass("In a class, 30% of the students offered English, 20% offered Hindi and 10% offered both. If a student is selected at random, what is the probability that he. has offered English or Hindi ?","1/2","3/4","4/5","2/5","2/5"));
        listprobability.add(new Modelclass("Two dice are thrown together .What is the probability that the sum of the number on the two faces is divided by 4 or 6.","7/18","14/35","8/18","7/35","7/18"));
        listprobability.add(new Modelclass("I forgot the last digit of a 7-digit telephone number. If 1 randomly dial the final 3 digits after correctly dialing the first four, then what is the chance of dialing the correct number?","1/999","1/1001","1/1000","4/1000","1/1000"));
        listprobability.add(new Modelclass("Four dice are thrown simultaneously. Find the probability that all of them show the same face.","1/216","1/36","2/216","4/216","1/216"));
        listprobability.add(new Modelclass("What is the probability of getting 53 Mondays in a leap year?","1/7","3/7","2/7","1","2/7"));
        listprobability.add(new Modelclass("Two brother X and Y appeared for an exam. The probability of selection of X is 1/7 and that of B is 2/9. Find the probability that both of them are selected.","1/63","1/14","2/63","1/9","2/63"));
        listprobability.add(new Modelclass("A box contains 10 bulbs,of which just three are defective. If a random sample of five bulbs is drawn, find the probability that the sample contains exactly one defective bulb.","5/12","7/12","3/14","1/12","5/12"));
        listprobability.add(new Modelclass("A speaks truth in 75% of cases and B in 80% of cases. In what percentage of cases are they likely to contradict each other, narrating the same incident","30/100","35/100","45/100","50/100","35/100"));
        listprobability.add(new Modelclass("A bag contains 50 tickets numbered 1,2,3,4......50 of which five are drawn at random and arranged in ascending order of magnitude.Find the probability that third drawn ticket is equal to 30.","551/15134","1/2","552/15379","1/9","551/15134"));
        listprobability.add(new Modelclass("A bag contains 4 red and 3 black balls. A second bag contains 2 red and 4 black balls. One bag is selected at random. From the selected bag, one ball is drawn. Find the probability that the ball drawn is red.","23/42","19/42","7/32","16/39","19/42"));

        listroots = new ArrayList<>();
        listroots.add(new Modelclass("The cube root of .000216 is:","0.6","0.06","77","87","0.06"));
        listroots.add(new Modelclass("If (89)² is added to the square of a number, the answer so obtained is 16202. What is the (1/26) of that number?","5.65","2.7","3.5","6.66","3.5"));
        listroots.add(new Modelclass("What should come in place of both the question marks in the equation  x / √(128) = √(162) / x ","12","14","144","196","12"));
        listroots.add(new Modelclass("If √(0.00000676)  =  0.0026 then √(6760000) is:","2.6","26","260","2600","2600"));
        listroots.add(new Modelclass("If 3 / √5 √ + √125 = 17.88, then what will be the value of √80 + 6√5 = ?","13.41","20.46","21.66","22.35","22.35"));
        listroots.add(new Modelclass("If √(18225) = 135, then the value of ( √(182.25) + √(1.8225) + √(0.018225) + √(0.00018225) ) is :","1.49985","14.9985","149.985","1499.85","14.9985"));
        listroots.add(new Modelclass("A group of students decided to collect as many paise from each member of group as is the number of members. If the total collection amounts to Rs. 59.29, the number of the member is the group is:","57","67","77","87","77"));
        listroots.add(new Modelclass("If x = 7 - 4√3 then find the value of (x + 1/x) ? ","3√3","8√3","14","14+8√3","14"));
        listroots.add(new Modelclass("( 3 + √6 ) / ( 5√3 - 2√12 - √30 + √50 ) = ?","3","3√2","6","None","None"));
        listroots.add(new Modelclass("Cube root of 729 then square it","9","36","81","144","81"));
        listroots.add(new Modelclass("What is the number of decimal places in a cube root of a number having 27 decimal places ?","3","6","9","27","9"));
        listroots.add(new Modelclass("If 3a = 4b = 6c and a + b + c = 27√29 , then √(a² + b² + c²) = ?","81","83","87","None","87"));
        listroots.add(new Modelclass("If (5 + 2√3) / (7 + 4√3) = a + b√3 then a & b = ?","a=-11,b=-6","a=-11,b=6"," a=11,b=-6","a=11,b=6","a=11,b=-6"));
        listroots.add(new Modelclass("28√? + 1426 = 3/4 of 2872","576","676","1296","1444","676"));
        listroots.add(new Modelclass("1.5² x √(0.0225) = ?","0.0375","0.3375","3.275","32.75","0.3375"));
        listroots.add(new Modelclass("What are the 2 natural numbers, sum of whose squares is 52?","2, 7","3, 5","4, 6","5, 6","4, 6"));
        listroots.add(new Modelclass("√( 0.204 x 42 / 0.07 x 3.4 ) is equal to : ","1/6","0.06","0.6","6","6"));
        listroots.add(new Modelclass("If x = 2 + 2^(2/3) + 2^(1/3) then find the value of x³− 6x² + 6x ?","1","2","3","4","2"));
        listroots.add(new Modelclass("If  x × y = x + y + √xy, the value of 6x24 is:","41","42","43","44","42"));
        listroots.add(new Modelclass("What is the value of √729 + √72.9 + √7.29","30.5","32.33","35.6","38.23","38.23"));
        listroots.add(new Modelclass("What is the value of √361 + √3.61 + √0.0361 ?","20.9","22.11","22.49","21.09","21.09"));
        listroots.add(new Modelclass("The maximum value of 5 + 20x − 4x², when X is real number","1","5","25","30","30"));
        listroots.add(new Modelclass("Find the square root of 1485961","1213","1219","1229","1239","1219"));
        listroots.add(new Modelclass("Which of the numbers given below is the square root of 14161?","119","121","131","141","119"));
        listroots.add(new Modelclass("Which of the following numbers will have an irrational square root?","1024","2401","4096","2048","2048"));
        listroots.add(new Modelclass("The cube of 105 is","1157625","1175625","1185625","1158625","1157625"));

        listpercent = new ArrayList<>();
        listpercent.add(new Modelclass("In an election between two candidates, one got 55% of the total valid votes, 20% of the votes were invalid. If the total number of votes was 7500, the number of valid votes that the other candidate got, was :","2500","2700","2900","3100","2700"));
        listpercent.add(new Modelclass("A student multiplied a number by 3/5 instead of 5/3, What is the percentage error in the calculation ?","54 %","64 %","74 %","84 %","64 %"));
        listpercent.add(new Modelclass("If 20% of a = b, then b% of 20 is the same as :","4% of a","6% of a","8% of a","10% of a","4% of a"));
        listpercent.add(new Modelclass("A student has to obtain 33% of the total marks to pass. He got 125 marks and failed by 40 marks. The maximum marks are :","500","600","800","1000","500"));
        listpercent.add(new Modelclass("The value of a machine depreciates at the rate of 10% every year. It was purchased 3 years ago. If its present value is Rs. 8748, its purchase price was :","10000","12000","14000","16000","12000"));
        listpercent.add(new Modelclass("Fresh fruit contains 68% water and dry fruit contains 20% water. How much dry fruit can be obtained from 100 kg of fresh fruits ?","20","30","40","50","40"));
        listpercent.add(new Modelclass("A man spends 35% of his income on food, 25% on children's education and 80% of the remaining on house rent. What percent of his income he is left with ?","6 %","8 %","10 %","12 %","8 %"));
        listpercent.add(new Modelclass("A's salary is 40% of B's salary which is 25% of C's salary. What percentage of C's salary is A's salary ? ","10","20","30","40","10"));
        listpercent.add(new Modelclass("If 75% of a number is added to 75, then the result is the number itself. The number is :","100","200","300","400","300"));
        listpercent.add(new Modelclass("A salesman gets commission on total sales at 9%. If the sale is exceeded Rs.10,000 he gets an additional commission as bonus of 3% on the excess of sales over Rs.10,000. If he gets total commission of Rs.1380, then the bonus he received is:","180","120","480","Data insufficient","120"));
        listpercent.add(new Modelclass("405 sweets were distributed equally among children in such a way that the number of sweets received by each child is 20% of the total number of children. How many sweets did each child recieve ?","9","10","11","12","9"));
        listpercent.add(new Modelclass("Gaurav spends 30% of his monthly income on food articles, 40% of the remaining on conveyance and clothes and saves 50% of the remaining. If his monthly salary is Rs. 18,400, how much money does he save every month ?","3864","4903","5849","6789","3864"));
        listpercent.add(new Modelclass("In an election only two candidates contested 20% of the voters did not vote and 120 votes were declared as invalid. The winner got 200 votes more than his opponent  thus he secured 41% votes of the total voters on the voter list. Percentage votes of the defeated candidate out of the total votes casted is:","47.5 %","41 %","38 %","45 %","45 %"));
        listpercent.add(new Modelclass("A number is decreased by 10% and then increased by 10%.  The number so obtained is 10 less than the original number. What was the oiginal number ? ","1000","2000","3000","4000","1000"));
        listpercent.add(new Modelclass("If A's height is 40% less than that of B, how much percent B's height is more than that of A?","66.66 %","76.66%","96.66 %","86.66 %","66.66 %"));
        listpercent.add(new Modelclass("What percent of 7.2 kg is 18 gms ?","0.25 %","0.5 %","0.75 %","1 %","0.25 %"));
        listpercent.add(new Modelclass("A housewife saved Rs. 2.50 in buying an item on sale. If she spent Rs. 25 for the item, approximately how much percent she saved in the transaction ?","8","9","10","11","9"));
        listpercent.add(new Modelclass("25% of 25% Is Equal To","0.0625","0.0210","0.03145","0.3210","0.0625"));
        listpercent.add(new Modelclass("270 candidates appeared for an examination, of which 252 passed. The pass percentage is :","(91 + 1/3)%","(93 + 1/3 )%","(97 + 1/3 )%","(98 + 1/3) %","(93 + 1/3 )%"));
        listpercent.add(new Modelclass("The ratio 5 : 4 expressed as a percent equals :","12.5 %","40 %","80 %","125 %","125 %"));
        listpercent.add(new Modelclass("Ram sell his goods 25% cheaper than Shyam and 25% dearer than Bram. How much % is Bram's good cheaper than Shyam ?","60 %","40 %","50 %","30 %","40 %"));
        listpercent.add(new Modelclass("45% of 750  -  25% of 480 = ?","337.50","217.50","376.21","120","217.50"));
        listpercent.add(new Modelclass("If the pice of sugar rises from Rs. 6 per kg to Rs. 7.50 per kg, a person, to have no increase in his expenditure on sugar, will have to reduce his consumpion of sugar by","15","20","25","30","20"));
        listpercent.add(new Modelclass("40% of 75 + 80% of 25 = K% of 250","10","20","30","35","20"));
        listpercent.add(new Modelclass("1100 boys and 700 girls are examined in a test; 42% of the boys and 30% of the girls pass. The percentage of the total who failed is :","58","62 x 2/3","64","67","62 x 2/3"));

        listblood = new ArrayList<>();
        listblood.add(new Modelclass("A is B's sister. C is B's mother. D is C's father. E is D's mother. Then, how is A related to D?","Grandfather","Grandmother","Daughter","Granddaughter","Granddaughter"));
        listblood.add(new Modelclass("A girl introduced a boy as the son of' the daughter of the father of her uncle. The boy is girl's","Brother","Son","Uncle"," Son-in-law","Brother"));
        listblood.add(new Modelclass("In a family, there are six members A, B, C, D, E and F. A and B are a married couple, A being the male member. D is the only son of C, who is the brother of A. E is the sister of D. B is the daughter-in-law of F, whose husband has died. How is E related to C ? ","Sister","Daughter","Cousin","Mother","Daughter"));
        listblood.add(new Modelclass("P is the brother of Q and R. S is R's mother. T is P's father. Which of the following statements cannot be definitely true ?","T is Q's father","S is P's mother","P is S's son","Q is T's son","Q is T's son"));
        listblood.add(new Modelclass("Pointing to a lady, a man said, 'The son of her only brother is the brother of my wife.' How is the lady related to the man ? ","Mother's sister","Grandmother","Mother-in-law","Sister of father-in-law","Sister of father-in-law"));
        listblood.add(new Modelclass("Pointing out to a lady, a girl said, 'She is the daughter-in-law of the grandmother of my father's only son.' How is the lady related to the girl ?","Sister-in-law","Mother","Aunt","Can't be determined","Can't be determined"));
        listblood.add(new Modelclass("Introducing a man, a woman said, 'He is the only son of my mother's mother.' How is the woman related to the man ?","Mother","Aunt","Sister","Niece","Niece"));
        listblood.add(new Modelclass("A man said to a lady, 'Your mother's husband's sister is my aunt!! How is the lady related to the man ? ","Daughter","Grand daughter","Mother","Sister","Sister"));
        listblood.add(new Modelclass("Brothers and Sisters I have None :: Looking at a portrait of a man, Harsh said, 'His mother is the wife of my father's son. Brothers and sisters I have none.' At whose portrait was Harsh looking? ","His son","His cousin","His uncle","His nephew","His son"));
        listblood.add(new Modelclass("Q is the brother of R;P is the sister of Q;T is the brother of S;S is the daughter of R.Who are the cousins of Q ? ","R and P","P and T","Q and T","S and T","S and T"));
        listblood.add(new Modelclass("Rita told Mani, 'The girl I met yesterday at the beach was the youngest daughter of the brother-in-law of my friend's mother.' How is the girl related to Rita's friend ?","Cousin","Daughter","Niece","Friend","Cousin"));
        listblood.add(new Modelclass("Pointing to a girl in the photograph, Amar said, 'Her mother's brother is the only son of my mother's father.' How is the girl's mother related to Amar ? ","Mother","Sister","Aunt","Grandmother","Aunt"));
        listblood.add(new Modelclass("When Anuj saw Manish, he recalled, 'He is the son of the father of my daughter.' Who is Manish ?","Brother-in-law","Brother","Cousin","Uncle","Brother-in-law"));
        listblood.add(new Modelclass("Pointing to an old man, Kailash said, 'His son is my son's uncle.' How is the old man related to Kailash ? ","Brother","Uncle","Father","Grandfather","Father"));
        listblood.add(new Modelclass("Pointing to a photograph, a lady tells Pramod, 'I am the only daughter of this lady and her son is your maternal uncle.' How is the speaker related to Pramod's father ","Sister-in-law","Wife","None","Either (a) or (b)","Wife"));
        listblood.add(new Modelclass("A, B, C, D, E, F and G are members of a family consisting of four adults and three children, two of whom, F and G are girls. A and D are brothers and A is a doctor. E is an engineer married to one of the brothers and has two children. if is married to D and G is their child. Who is C ? ","A's son","E's daughter","F's father","G's brother","A's son"));
        listblood.add(new Modelclass("Pointing to a photograph, a man said, 'I have no brother or sister but that man’s father is my father’s son.' Whose photograph was it?","His uncle's","His nephew's","His son's","His Cousin's","His son's"));
        listblood.add(new Modelclass("Introducing a man to her husband , a woman said 'His brother's father is the only son of my grandfather'. How is the woman related to this man?","Mother","Aunt","Sister","Cousin","Sister"));
        listblood.add(new Modelclass("Pointing to a man in a photograph. Asha said. 'His mother's only daughter is my mother.' How is Asha related to that man ? ","Nephew","Sister","Wife","Niece","Niece"));
        listblood.add(new Modelclass("In a family, there are six members A, B, C, D, E and F. A and B are a married couple, A being the male member. D is the only son of C, who is the brother of A. E is the sister of D. B is the daughter-in-law of F, whose husband has died. How many male members are there in the family ? ","1","2","3","4","3"));
        listblood.add(new Modelclass("A family consists of six members P, Q, R, X, Y and Z. Q is the son of R but R is not mother of Q. P and R are a married couple. Y is the brother of R. X is the daughter of P. Z is the brother of P. How many children does P have ?  ","1","2","3","4","2"));
        listblood.add(new Modelclass("Pointing to a man in a photograph, a woman said, 'His brother's father is the only son of my grandfather.' How is the woman related to the man in the photograph ?","Mother","Aunt","Sister","Daughter","Sister"));
        listblood.add(new Modelclass("X introduces Y saying, 'He is the husband of the granddaughter of the father of my father '. How is Y related to X?","Brother","Brother-in-law","Son","Son-in-law","Brother-in-law"));
        listblood.add(new Modelclass("Showing the man receiving the prize, Saroj said, 'He is the brother of my uncle's daughter.' Who is the man to Saroj ? ","Son","Cousin","Nephew","Brother-in-law","Cousin"));
        listblood.add(new Modelclass("A is the son of B, C.  B's sister has a son D and a daughter E. F is the maternal uncle of D. How many nephews does F have ? ","0","1","2","3","2"));

        listcalendar = new ArrayList<>();
        listcalendar.add(new Modelclass("What was the day on 15th august 1947 ?","Friday","Saturday","Sunday","Thursday","Friday"));
        listcalendar.add(new Modelclass("Today is Monday. After 61 days, it will be :","Tuesday","Monday","Sunday","Saturday","Saturday"));
        listcalendar.add(new Modelclass("It was Sunday on Jan 1, 2006. What was the day of the week Jan 1, 2010?","Monday","Friday","Sunday","Tuesday","Friday"));
        listcalendar.add(new Modelclass("The last day of a century cannot be","Monday","Wednesday","Tuesday","Friday","Tuesday"));
        listcalendar.add(new Modelclass("What was the day of the week on, 16th July, 1776?","Tuesday","Wednesday","Monday","Saturday","Tuesday"));
        listcalendar.add(new Modelclass("What will be the day of the week 15th August, 2010?","Sunday","Saturday","Wednesday","Monday","Sunday"));
        listcalendar.add(new Modelclass("What was the day of the week on 17th June, 1998 ?","Monday","Tuesday","Wednesday","Friday","Wednesday"));
        listcalendar.add(new Modelclass("If 6th March, 2005 is Monday, what was the day of the week on 6th March, 2004?","Sunday","Saturday","Tuesday","Wednesday","Sunday"));
        listcalendar.add(new Modelclass("How many weekends in a year?","52","53","103","104","52"));
        listcalendar.add(new Modelclass("26 january 1950 which day of the week?","Monday","Wednesday","Thursday","Tuesday","Thursday"));
        listcalendar.add(new Modelclass("On 8th Dec, 2007 Saturday falls. What day of the week was it on 8th Dec, 2006?","Saturday","Friday","Monday","Tuesday","Friday"));
        listcalendar.add(new Modelclass("January 1, 2007 was Monday. What day of the week lies on Jan. 1, 2008?","Monday","Tuesday","Wednesday","Sunday","Tuesday"));
        listcalendar.add(new Modelclass("On 8th Feb, 2005 it was Tuesday. What was the day of the week on 8th Feb, 2004?","Tuesday","Saturday","Friday","Sunday","Sunday"));
        listcalendar.add(new Modelclass("How many leap years does 100 years have?","25","24","4","26","24"));
        listcalendar.add(new Modelclass("The maximum gap between two successive leap year is?","4","8","2","1","8"));
        listcalendar.add(new Modelclass("How many leap years do 300 years have?","75","74","72","73","72"));
        listcalendar.add(new Modelclass("The year next to 2005 will have the same calendar as that of the year 2005?","2016","2022","2011","None","2011"));
        listcalendar.add(new Modelclass("If today is Saturday, what will be the day 350 days from now  ?","Saturday","Friday","Sunday","Monday","Saturday"));
        listcalendar.add(new Modelclass("The calendar for the year 2007 will be the same for the year","2014","2016","2017","2018","2018"));
        listcalendar.add(new Modelclass("The calendar for the year 1993 will be same for the year","1999","2004","2010","2021","1999"));
        listcalendar.add(new Modelclass("Prove that any date in March of a year is the same day of the week corresponding date in November that year.","Same day","Not same day","Next day","Previous day","Same day"));
        listcalendar.add(new Modelclass("The calendar of the year 1897 can be used again in the year?","1908","1901","1903","1926","1903"));
        listcalendar.add(new Modelclass("If Feb 12th,1986 falls on Wednesday then Jan 1st,1987 falls on which day?","Wednesday","Tuesday","Thursday","Friday","Thursday"));
        listcalendar.add(new Modelclass("The calendar for the year 2018 will be the same for the year","2023","2027","2029","2022","2029"));
        listcalendar.add(new Modelclass("The calendar for the year 1988 is same as which upcoming year ?","2012","2014","2016","2010","2016"));

        listdirections = new ArrayList<>();
        listdirections.add(new Modelclass("If South-East becomes North, North-East becomes West and so on. What will West become?","North-East"," North-West","South-East","South-West","South-East"));
        listdirections.add(new Modelclass("Rasik walked 20 m towards north. Then he turned right and walks 30 m. Then he turns right and walks 35 m. Then he turns left and walks 15 m. Finally he turns left and walks 15 m. In which direction and how many metres is he from the starting position?","15 m West","30 m East","30 m West","45 m East","45 m East"));
        listdirections.add(new Modelclass("One morning after sunrise, Suresh was standing facing a pole. The shadow of the pole fell exactly to his right. To which direction was he facing?","East","West","South","Data inadequate","South"));
        listdirections.add(new Modelclass("K is 40 m South-West of L. If M is 40 m South-East of L, then M is in which direction of K?","East","West","North-East","South","East"));
        listdirections.add(new Modelclass("A man walks 5 km toward south and then turns to the right. After walking 3 km he turns to the left and walks 4 km. And then he goes back 10 km straight. Now in which direction is he from the starting place ?"," South-East","North-West","South","West","North-West"));
        listdirections.add(new Modelclass("If A x B means A is to the south of B; A + B means A is to the north of B; A % B means A is to the east of B; A - B means A is to the west of B; then in P % Q + R - S, S is in which direction with respect to Q?","South-West","South-East","North-East","North-West","South-East"));
        listdirections.add(new Modelclass("Amit started walking positioning his back towards the sun. After some time, he turned left, then turned right and towards the left again. In which direction is he going now?","North or South","North or West","East or West","South or West","North or South"));
        listdirections.add(new Modelclass("One morning after sunrise Nivedita and Niharika were talking to each other face to face at Dalphin crossing. If Niharika's shadow was exactly to the right of Nivedita, Which direction Niharika was facing?","North","South","East","Data inadequate","North"));
        listdirections.add(new Modelclass("P started from his house towards west. After walking a distance of 25 m. He turned to the right and walked 10 m. He then again turned to the right and walked 15 m. After this he is to turn right at 135o and to cover 30 m. In which direction should he go?","West","South","South-West","South-East","South-West"));
        listdirections.add(new Modelclass("Afreena walks 8 km towards East and then walks 13 km back, then she turns left and walks 4 km; then walks 5 km after turning left; she turns left again and walks 3 km. How far is she from the starting point ?","3 km","2 km","1 km","6 km","1 km"));
        listdirections.add(new Modelclass("The length and breadth of a room are 8 m and 6 m respectively. A cat runs along all the four walls and finally along a diagonal order to catch a rat. How much total distance is covered by the cat?","10","14","38","48","38"));
        listdirections.add(new Modelclass("Ravi wants to go to the university. He starts from his home which is in the East and comes to a crossing. The road to the left ends in a theatre, straight ahead is the hospital. In Which direction is the University?","North","South","East","West","North"));
        listdirections.add(new Modelclass("A horse is facing north. It turns 90 degrees in the clockwise direction, then 180 degrees in the anti-clockwise and then another 90 degrees in the same direction. Which direction is the horse facing now?","East","South","Southwest","Southeast","South"));
        listdirections.add(new Modelclass("'P' walked 1 km towards south direction and turned  90°ACW and walked 2 km. Then he turned his left and walked 1 km and then he turned his right and walked 2 km. After that he turned 90° ACW and walked 3 km. How far is he from the starting point ?","5 km","4 km","2 km","0 km","5 km"));
        listdirections.add(new Modelclass("Reena walked from A to B in the East 10 feet. Then she turned to the right and walked 3 feet. Again she turned to the right and walked 14 feet. How far is she from A?","4 feet","5 feet","24 feet","27 feet","5 feet"));
        listdirections.add(new Modelclass("Iam facing south. I turn right and walk 20 m. Then I turn right again and walk 10m. Then I turn left and walk 10m and then turning right walk 20m. Then I turn right again and walk 60m. In which direction am I from the starting point?","North","North-West","North-East","East","North-East"));
        listdirections.add(new Modelclass("Raman is performing yoga with his head down and legs up. His face is towards the west. In which direction, will his left hand be ?","North","North - East","East","West","North"));
        listdirections.add(new Modelclass("A girl facing north rotates 100° clockwise then 190° anticlockwise. what is new direction of the girl ?"," North-East","West","South-East","South","West"));
        listdirections.add(new Modelclass("Ravi started walking from his house east direction on Bus stop which is 3km.away. Then he set off in the bus straight towards his right to the school 4 km away. what is the crow flight distance from his house to the school?","1 km","5 km","7 km","12 km","5 km"));
        listdirections.add(new Modelclass("Hemant in order to go to university started from his house in the east and came to a crossing. The road to the left ends in a theatre, straight ahead is the hospital. In which direction is the university?","North","South","East","West","North"));
        listdirections.add(new Modelclass("Sundar runs 20 m towards East and turns to right and runs 10 m. Then he turns to the right and runs 9 m. Again he turns to right and runs 5 m. After this he turns to left and runs 12 m and finally he turns to right and 6 m. Now to which direction is Sundar facing?","East","West","North","South","North"));
        listdirections.add(new Modelclass("Laxmi goes 6 km towards South-East from her office.Then she goes 15 km turning to West. After this she goes 6 km towards North-West and in the end she goes 11 km towards East. How far is she from her office ?","10 km","11 km","4 km","6 km","4 km"));
        listdirections.add(new Modelclass("Sumanth walks 200 feet straight from his house, which is facing north and then he walks 100 feet in reverse direction.Further he takes a left turn and walks 300 yards.In Which direction is Sumanth now from his original position?","South-East","North-East","South-West","North-West","North-East"));
        listdirections.add(new Modelclass("A man is facing towards the east. He turns 270 degrees clockwise and then takes a right turn. Finally, he turns 90 degrees anticlockwise. Which direction is he facing now?","West","South","North","East","North"));
        listdirections.add(new Modelclass("Rita travelled 35 Km from a point towards South and then turned left and travelled 20 Km and finally turned left again and travelled 35 Km. In which direction is she from the starting point?","East","West","North","South","East"));

        listanalogy = new ArrayList<>();
        listanalogy.add(new Modelclass("Vaunt : Flaunt :: Disparate : ?","Similar","Homogenous","Contrast","Alike","Contrast"));
        listanalogy.add(new Modelclass("Biped : Quadruped :: Ostrich : ?","Cat","Kangaroo","Penguin","Duck","Cat"));
        listanalogy.add(new Modelclass("Grass : Erosion :: Dam : ?","Water","Freeze","Current","Rain","Water"));
        listanalogy.add(new Modelclass("Lethargic : Vital :: Trite : ?","Unique","Slug","Lazy","Skinny","Unique"));
        listanalogy.add(new Modelclass("Seismography : Earthquake :: Taseometer : ?","Landslides","Strains","Resistances","Volcanoes","Strains"));
        listanalogy.add(new Modelclass("Exhibit : display :: send : ?","Stamp","Receive","Show","Emit","Emit"));
        listanalogy.add(new Modelclass("Choose the Antonym of the given word from the following options'Jettison","Salvage","Submerge","Repent","Descend","Salvage"));
        listanalogy.add(new Modelclass("Yard is to Fence as Cell is to","Mitochondria","Cytoplasm","Membrane","Nucleus","Membrane"));
        listanalogy.add(new Modelclass("6 : 18 :: 4 : ?","14","6","16","8","8"));
        listanalogy.add(new Modelclass("Paw : Cat :: Hoof : ?","Donkey","Lion","Elephant","Horse","Horse"));
        listanalogy.add(new Modelclass("Choose a similar word ? Kolkata, Mumbai, Mangalore","Hyderabad","Delhi","Cochin","Jaipur","Cochin"));
        listanalogy.add(new Modelclass("Transition : Change :: Immobility :  ?","Stillness","Liveliness","Action","Busyness","Stillness"));
        listanalogy.add(new Modelclass("583 is related to 293 in the same way as 488 is related to","291","378","487","581","378"));
        listanalogy.add(new Modelclass("Grain : Stock :: Stick : ?","Bundle","String","Collection","Heap","Bundle"));
        listanalogy.add(new Modelclass("Thread is to String as Cask is to","Barrel","Disc","Wallet","Box","Barrel"));
        listanalogy.add(new Modelclass("Modern : Antiquated :: Weak : ?","Strong","Fragile","Inadequate","Puny","Strong"));
        listanalogy.add(new Modelclass("Cup : Lip :: Bird : ?","Grass","Forest","Beak","Bush","Grass"));
        listanalogy.add(new Modelclass("Melt : Liquid :: Freeze : ?","Condense","Solid","Ice","Crystal","Solid"));
        listanalogy.add(new Modelclass("Develop is to assess as train is to","Change","Educate","Analyze","Recruit","Analyze"));
        listanalogy.add(new Modelclass("Convent : Cloister :: Eyrie : ?","Show","Open","Hide","Nest","Nest"));
        listanalogy.add(new Modelclass("Bill : Law :: ? : Insect","Pupa","Stage","Larva","Bird","Larva"));
        listanalogy.add(new Modelclass("Fossil : Extinction :: Puddle : ?","Wet","Rain","Lake","Dry","Rain"));
        listanalogy.add(new Modelclass("Grapes : Wine :: Squid : ?","Ocean","Salad","Calamari","Fishing","Calamari"));
        listanalogy.add(new Modelclass("34 is related to 12 in the same way as 59 is related to","45","38","26","14","45"));
        listanalogy.add(new Modelclass("Horse : Jockey :: Car : ?","Chauffeur","Steering","Mechanic","Brake","Chauffeur"));

        listclocks = new ArrayList<>();
        listclocks.add(new Modelclass("A clock is set right at 8 a.m. The clock gains 10 minutes in 24 hours will be the true time when the clock indicates 1 p.m. on the following day?","48 min. past 12","46 min. past 12","45 min. past 12","47 min. past 12","48 min. past 12"));
        listclocks.add(new Modelclass("At what time between 4 and 5 o'clock will the hands of a watch point in opposite directions?","54 past 4","(53 + 7/11) past 4","(54 + 8/11) past 4","(54 + 6/11) past 4","(54 + 6/11) past 4"));
        listclocks.add(new Modelclass("A clock is set right at 5 a.m. The clock loses 16 minutes in 24 hours.What will be the true time when the clock indicates 10 p.m. on 4th day?","11pm","12pm","1pm","2pm","11pm"));
        listclocks.add(new Modelclass("Find the angle between the hour hand and the minute hand of a clock when the time is 3.25","47.5°","57.5°","45.5°","55.5°","47.5°"));
        listclocks.add(new Modelclass("A watch which gains uniformly ,is 5 min,slow at 8 o'clock in the morning on sunday and it is 5 min 48 sec.fast at 8 p.m on following sunday. when was it correct?","7pm on wed","20m past 7pm on wed","15m past 7pm on wed","8pm on wed","20m past 7pm on wed"));
        listclocks.add(new Modelclass("An accurate clock shows 8 o'clock in the morning. Through how may degrees will the hour hand rotate when the clock shows 2 o'clock in the afternoon?","360","180","90","60","180"));
        listclocks.add(new Modelclass("At what time between 7 and 8 o'clock will the hands of a clock be in the same straight line but,not together?","(5 + 5/11 )m past 7","(6 + 5/11) m past 7","7","8","(5 + 5/11 )m past 7"));
        listclocks.add(new Modelclass("At what time between 9 and 10 o'clock will the hands of a watch be together?","(49 + 3/11)m past 11","(49 +1/11)m past 9","(45 +1/11)m past 9","(45 +7/11)m past 11","(49 +1/11)m past 9"));
        listclocks.add(new Modelclass("At what time between 5.30 and 6 will the hands of a clock be at right angles?","(43 + 5/11)m past 5","(43 + 7/11)m past 5","5","7","(43 + 7/11)m past 5"));
        listclocks.add(new Modelclass("At what angle the hands of a clock are inclined at 15 minutes past 5?","57.5°","67.5°","77.5°","87.5°","67.5°"));
        listclocks.add(new Modelclass("The angle between the minute hand and the hour hand of a clock when the time is 8:30 ","80°","75°","60°","105°","75°"));
        listclocks.add(new Modelclass("What time between 4 and 5 o'clock will the hands of a clock be at rightangle?","3  5/11","4  5/11","5  5/11","6  5/11","5  5/11"));
        listclocks.add(new Modelclass("At what time, in minutes, between 3 o'clock and 4 o'clock, both the needles will coincide each other?","11  4/11","13  4/11","15  4/11","16  4/11","16  4/11"));
        listclocks.add(new Modelclass("The reflex angle between the hands of a clock at 10.25 is","197  1/2","167  1/2","157  1/2","187  1/2","197  1/2"));
        listclocks.add(new Modelclass("How much does a watch lose per day, if its hands coincide ever 64 minutes?","32  8/11","33  8/11","34  8/11","35  8/11","32  8/11"));
        listclocks.add(new Modelclass("A watch gains 5 seconds in 3 minutes and was set right at 8 AM. What time will it show at 10 PM on the same day ?","10 : 27 : 41 AM","8 : 51 : 04 AM","9 : 45 : 15 PM","10 : 23 : 20 PM","10 : 23 : 20 PM"));
        listclocks.add(new Modelclass("A watch which gains 5 seconds in 3 minutes was set right at 7 a.m. In the afternoon of the same day, when the watch indicated quarter past 4 o'clock, the true time is:","4pm","5pm","6pm","7pm","4pm"));
        listclocks.add(new Modelclass("At what time between 3 and 4 o’clock will the minute hand and the hour hand are on the same straight line but facing opposite directions ?","3:15 2/8","3:49","3:49 1/11","3:51","3:49 1/11"));
        listclocks.add(new Modelclass("In 16 minutes, the minute hand gains over the hour hand by ","16°","80°","88°","94°","88°"));
        listclocks.add(new Modelclass("At what time, between 3 o’clock and 4 o’clock, both the hour hand and minute hand coincide each other  ? ","3:16 7/11","3:16 11/4","3:30","3:16 4/11","3:16 4/11"));
        listclocks.add(new Modelclass("An accurate clock shows 7 o'clock in the morning. Through how may degrees will the hour hand rotate when the clock shows 3 o'clock in the afternoon?","144°","168°","180°","150°","180°"));
        listclocks.add(new Modelclass("How many degrees will the minute hand move, in the same time in which the second hand move 4800 ?","80°","160°","140°","135°","80°"));
        listclocks.add(new Modelclass("What is the angle made by the hour hand and the minute hand, if the clock shows 9:15 pm ?","165°","172.5°","112.5°","125.5°","172.5°"));
        listclocks.add(new Modelclass("How many times are the hands of a clock at right angle in a day?","44","54","64","22","44"));
        listclocks.add(new Modelclass("How many degrees will the minute hand move, in the same time in which the second hand move 5400 ?","90°","85°","60°","45°","90°"));

        listtrains = new ArrayList<>();
        listtrains.add(new Modelclass("A man's speed with the current is 15 km/hr and the speed of the current is 2.5 km/hr. The man's speed against the current is :","9.5 km/hr","10 km/hr","10.5 km/hr","11 km/hr","10 km/hr"));
        listtrains.add(new Modelclass("A man sitting in a train which is traveling at 50 kmph observes that a goods train, traveling in opposite direction, takes 9 seconds to pass him. If the goods train is 280 m long, find its speed.?","60","62","64","65","62"));
        listtrains.add(new Modelclass("A train 125 m long passes a man, running at 5 km/hr in the same direction in which the train is going, in 10 seconds. The speed of the train is ?","45 kmph","25 kmph","30 kmph","50 kmph","50 kmph"));
        listtrains.add(new Modelclass("Two trains are running in opposite directions in the same speed. The length of each train is 120 meter. If they cross each other in 12 seconds, the speed of each train (in km/hr) is","42","36","28","20","36"));
        listtrains.add(new Modelclass("A train of length 110 meter is running at a speed of 60 kmph. In what time, it will pass a man who is running at 6 kmph in the direction opposite to that in which the train is going?","10","8","6","4","6"));
        listtrains.add(new Modelclass("Two trains started at the same time, one from A to B and the other from B to A . If they arrived at B and A respectively 4 hours and 9 hours after they passed each other the ratio of the speeds of the two trains was ","2 : 1","3 : 2","4 : 3","5 : 4","3 : 2"));
        listtrains.add(new Modelclass("A goods train runs at the speed of 72 kmph and crosses a 250 m long platform in 26 seconds. What is the length of the goods train?","230 m","240 m","260 m","270 m","270 m"));
        listtrains.add(new Modelclass("Two stations P and Q are 110 km apart on a straight track. One train starts from P at 7 a.m. and travels towards Q at 20 kmph. Another train starts from Q at 8 a.m. and travels towards P at a speed of 25 kmph. At what time will they meet?","10.30","10","8.45","9.30","10"));
        listtrains.add(new Modelclass("A train speeds past a pole in 15 seconds and a platform 100 m long in 25 seconds. Its length is:","150 m","200 m","data inadequate","50 m","150 m"));
        listtrains.add(new Modelclass("Two trains 140 m and 160 m long run at the speed of 60 km/hr and 40 km/hr respectively in opposite directions on parallel tracks. The time (in seconds) which they take to cross each other, is:","9","9.6","10","10.8","10.8"));
        listtrains.add(new Modelclass("A train moves with a speed of 108 kmph. Its speed in metres per second is :","10.8","18","30","38.8","30"));
        listtrains.add(new Modelclass("A train 110 metres long is running with a speed of 60 kmph. In what time will it pass a man who is running at 6 kmph in the direction opposite to that in which the train is going?","5","6","7","10","6"));
        listtrains.add(new Modelclass("Two cogged wheels of which one has 32 cogs and other 54 cogs, work into each other. If the latter turns 80 times in three quarters of a minute, how often does the other turn in 8 seconds?","48","24","38","36","24"));
        listtrains.add(new Modelclass("A train moves past a telegraph post and a bridge 264 m long in 8 seconds and 20 seconds respectively. What is the speed of the train ?","69.5 km/hr","70 km/hr","79 km/hr","79.2 km/hr","79.2 km/hr"));
        listtrains.add(new Modelclass("Two trains having equal lengths, take 10 seconds and 15 seconds respectively to cross a post. If the length of each train is 120 meters, in what time (in seconds) will they cross each other when traveling in opposite direction?","10","25","12","20","12"));
        listtrains.add(new Modelclass("Two trains are moving in opposite directions at 60 km/hr and 90 km/hr. Their lengths are 1.10 km and 0.9 km respectively. The time taken by the slower train to cross the faster train in seconds is ?","42 sec","44 sec","46 sec","48 sec","48 sec"));
        listtrains.add(new Modelclass("Two trains of equal length , running in opposite directions , pass a pole in 18 and 12 seconds. The trains will cross each other in","14.4 sec","15.5 sec","18.8 sec","20.2 sec","14.4 sec"));
        listtrains.add(new Modelclass("Length of train is 170 meters and speed of train is 63 km/hour. This train can pass a bridge in 30 seconds, then find the length of the bridge.","355 mts","325 mts","365 mts","312 mts","355 mts"));
        listtrains.add(new Modelclass("Two trains of equal length, running with the speeds of 60 and 40 kmph, take 50 seconds to cross each other while they are running in the same direction. What time will they take to cross each other if they are running in opposite directions  ?","10 sec","11 sec","12 sec","8 sec","10 sec"));
        listtrains.add(new Modelclass("A train covers a distance between station A and station B in 45 min.If the speed of the train is reduced by 5 km/hr,then the same distance is covered in 48 min.what is the distance between the stations A and B ?","80 kms","60 kms","45 kms","32 kms","60 kms"));
        listtrains.add(new Modelclass("A train running at the speed of 40 km/hr crosses a signal pole in 9 seconds. Find the length of the train ?","90 mts","150 mts","120 mts","100 mts","100 mts"));
        listtrains.add(new Modelclass("Two trains are moving in the same direction at 72 kmph and 36 kmph. The faster train crosses a girl sitting at window seat in the slower train in 32 seconds. Find the length of the faster train ?","170 m","100 m","270 m","320 m","320 m"));
        listtrains.add(new Modelclass("The two trains of lengths 400 m, 600 m respectively, running at same directions. The faster train can cross the slower train in 180 sec, the speed of the slower train is 48 kmph. Then find the speed of faster train  ?","68 kmph","52 kmph","76 kmph","50 kmph","68 kmph"));
        listtrains.add(new Modelclass("Train K crosses a stationary Train L in 50 seconds and a pole in 20 seconds with the same speed. The length of the Train K is 240 meters. What is the length of stationary Train L ?","60 mts","120 mts","240 mts","360 mts","360 mts"));
        listtrains.add(new Modelclass("A train is traveling at 48 kmph . It crosses another train having half of its length , traveling in opposite direction at 42 kmph, in 12 seconds. It also passes a railway platform in 45 seconds. What is the length of the platform ?","500","400","360","480","400"));

        listprofit = new ArrayList<>();
        listprofit.add(new Modelclass("If selling price is doubled, the profit triples. Find the profit percent ?","100%","200%","300%","400%","100%"));
        listprofit.add(new Modelclass("A trader mixes 26 kg of rice at Rs. 20 per kg with 30 kg of rice of other variety at Rs. 36 per kg and sells the mixture at Rs. 30 per kg. His profit percent is:","No profit, no loss","5%","8%","10%","5%"));
        listprofit.add(new Modelclass("A shopkeeper cheats to the extent of 10% while buying and selling, by using false weights. His total gain is.","20%","21%","22%","23%","21%"));
        listprofit.add(new Modelclass("By selling 45 lemons for Rs 40, a man loses 20%. How many should he sell for Rs 24 to gain 20% in the transaction ?","16","18","20","22","18"));
        listprofit.add(new Modelclass("A milkman purchases the milk at Rs. x per litre and sells it at Rs. 2x per litre still he mixes 2 litres water with every 6 litres of pure milk. What is the profit percentage?","116%","166.66%","60%","100%","166.66%"));
        listprofit.add(new Modelclass("The percentage profit earned by selling an article for Rs. 1920 is equal to the percentage loss incurred by selling the same article for Rs. 1280. At what price should the article be sold to make 25% profit?","Rs. 2000","Rs. 2200","Rs. 2400","Rs. 2600","Rs. 2000"));
        listprofit.add(new Modelclass("If the cost price is 25% of selling price. Then what is the profit percent.","150%","200%","300%","350%","300%"));
        listprofit.add(new Modelclass("A person incurs a loss of 5% be selling a watch for Rs. 1140. At what price should the watch be sold to earn 5% profit.","Rs. 1200","Rs. 1230","Rs. 1260","Rs. 1290","Rs. 1260"));
        listprofit.add(new Modelclass("Tarun got 30% concession on the labelled price of an article and sold it for Rs. 8750 with 25% profit on the price he bought. What was the labelled price ?","10000","12000","13000","14000","10000"));
        listprofit.add(new Modelclass("A Shopkeeper sells two articles at Rs.1000 each, making a profit of 20% on the first article and a loss of 20% on the second article. Find the net Profit or loss that he makes? ","4%","5%","6%","8%","4%"));
        listprofit.add(new Modelclass("What profit percent is made by selling an article at a certain price, if by selling at 2/3rd of that price, there would be a loss of 20%  ?","30%","25%","15%","20%","20%"));
        listprofit.add(new Modelclass("Due to reduction of 25% in price of oranges a customer can purchase 4 oranges more for Rs. 16. what is original price of an orange?","1/-","1.33/-","1.5/-","1.6/-","1.33/-"));
        listprofit.add(new Modelclass("Bhajan Singh purchased 120 reams of paper at Rs 80 per ream. He spent Rs 280 on transportation, paid octroi at the rate of 40 paise per ream and paid Rs 72 to the coolie. If he wants to have a gain of 8 %, what must be the selling price per ream?","90","89","87.48","86","90"));
        listprofit.add(new Modelclass("In a scheme, a pack of three soaps with MRP Rs.45 is available for Rs.42. If it still gives a profit of 5% to the shopkeeper, then the cost price of the pack is ?","38","39","40","41","40"));
        listprofit.add(new Modelclass("A trader sold an article at a loss of 5% but when he increased the selling price by Rs.65 he gained 3.33% on the cost price. If he sells the same article at Rs. 936, what is the profit percentage?","15%","16.66%","20%","17.5%","20%"));
        listprofit.add(new Modelclass("On selling 17 balls at Rs. 720, there is a loss equal to the cost price of 5 balls. The cost price of a ball is ?","Rs. 55","Rs. 60","Rs. 65","Rs. 70","Rs. 60"));
        listprofit.add(new Modelclass("By selling an article at Rs.800, a shopkeeper makes a profit of 25%.At what price should he sell the article so as to make a loss of 25%?","720/-","640/-","540/-","480/-","480/-"));
        listprofit.add(new Modelclass("The sale price of an article including the sales tax is Rs. 616. The rate of sales tax is 10%. If the shopkeeper has made a profit of 12%, then the cost price of the article is :","560/-","530/-","500/-","514/-","500/-"));
        listprofit.add(new Modelclass("A shopkeeper sells one-third of his goods at a profit of 10%, another one-third at a profit of 20%, and the rest at a loss of 6%.What is his overall profit percentage ?","6%","8%","10%","12%","8%"));
        listprofit.add(new Modelclass("If the manufacturer gains 10 %, the wholesale dealer 15 % and the retailer 25 %, then find the cost of production of a table if the retail price was Rs 1265","750/-","800/-","850/-","900/-","800/-"));
        listprofit.add(new Modelclass("A man bought an article and sold it at a gain of 5 %. If he had bought it at 5% less and sold it for Re 1 less, he would have made a profit of 10%. The C.P. of the article was","100/-","150/-","200/-","250/-","200/-"));
        listprofit.add(new Modelclass("The profit earned by selling an article for Rs. 832 is equal to the loss incurred when the same article is sold for Rs. 448. What should be the sale price for making 50% profit ?","660/-","560/-","1060/-","960/-","960/-"));
        listprofit.add(new Modelclass("The cash difference between the selling prices of an article at a profit of 4% and 6% is Rs 3. The ratio of two selling prices is","51:52","52:53","53:54","54:55","52:53"));
        listprofit.add(new Modelclass("A, B and C invest in the ratio of 3 : 4: 5. The percentage of return on their investments are in the ratio of  6 : 5 : 4. Find the total earnings, If B earns Rs. 250 more than A :","6000/-","7250/-","5000/-","None","7250/-"));
        listprofit.add(new Modelclass("In what ratio should water and wine be mixed so that after selling the mixture at the cost price a profit of 33.33% is made?","1:4","1:3","2:3","3:4","1:3"));

        listtime = new ArrayList<>();
        listtime.add(new Modelclass("A, B and C can do a piece of work in 24 days, 30 days and 40 days respectively. They began the work together but C left 4 days before the completion of the work. In how many days was the work completed?","11 days","12 days","13 days","14 days","11 days"));
        listtime.add(new Modelclass("A can do a piece of work in 10 days, B in 15 days. They work together for 5 days, the rest of the work is finished by C in two more days. If they get Rs. 3000 as wages for the whole work, what are the daily wages of A, B and C respectively (in Rs):","200,250,300","300,200,250","200,300,400","None","300,200,250"));
        listtime.add(new Modelclass("P can complete a work in 12 days working 8 hours a day.Q can complete the same work in 8 days working 10 hours a day. If both p and Q work together,working 8 hours a day,in how many days can they complete the work?","60/11","61/11","71/11","72/11","60/11"));
        listtime.add(new Modelclass("12 men can complete a work in 8 days. 16 women can complete the same work in 12 days. 8 men and 8 women started working  and worked for 6 days. How many more men are to be added to complete the remaining work in 1 day?","8","12","16","24","12"));
        listtime.add(new Modelclass("3 men, 4 women and 6 children can complete a work in 7 days. A woman does double the work a man does and a child does half the work a man does. How many women alone can complete this work in 7 days  ?","6","9","5","7","7"));
        listtime.add(new Modelclass("4 men can repair a road in 7 hours. How many men are required to repair the road in 2 hours ?","17 men","14 men","13 men","16 men","14 men"));
        listtime.add(new Modelclass("A and  B can do  a piece of work in 30 days , while  B and C can do the same work in 24 days and C and A in 20 days . They all work together for 10 days when B and C leave. How many days more will A take to finish  the work?","18 days","24 days","30 days","36 days","18 days"));
        listtime.add(new Modelclass("(x-2) men can do a piece of work in x days and (x+7) men can do 75% of the same work in (x-10)days. Then in how many days can (x+10) men finish the work?","27 days","12 days","25 days","18 days","12 days"));
        listtime.add(new Modelclass("10 men and 15 women together can complete a work in 6 days. It takes 100 days for one man alone to complete the same work. How many days will be required for one woman alone to complete the same work?","215 days","225 days","235 days","240 days","225 days"));
        listtime.add(new Modelclass("If 6 men and 8 boys can do a piece of work in 10 days while 26 men and 48 boys can do the same in 2 days what is time taken by 15 men and 20 boys?","4 days","6 days","7 days","5 days","4 days"));
        listtime.add(new Modelclass("A is thrice efficient as B and C is twice as efficient as B. what is the ratio of number of days taken by A,B and C, when they work individually?","2:6:3","2:3:6","1:2:3","3:1:2","2:6:3"));
        listtime.add(new Modelclass("A is 30% more efficient than B. How much time will they, working together, take to complete a job which A alone could have done in 23 days  ?","9 days","11 days","13 days","15 days","13 days"));
        listtime.add(new Modelclass("A and B together can do a piece of work in 40 days. A having worked for 20 days, B finishes the remaining work alone in 60 days. In How many days shall B finish the  whole work alone?","60","70","80","90","80"));
        listtime.add(new Modelclass("A is twice efficient as B and together they do the same work in as much time as C and D together. If C and D can complete the work in 20 and 30 daysrespectively, working alone ,then in how many days A can complete the work individually:","12 days","18 days","24 days","30 days","30 days"));
        listtime.add(new Modelclass("A does half as much work as Band C does half as much work as A and B together. If C alone can finish the work in 40 days, then together ,all will finish the work in  ?","17 + 4/7 days","13 + 1/3 days","15 + 3/2 days","16 days","13 + 1/3 days"));
        listtime.add(new Modelclass("A can do a certain work in the same time in which B and C together can do it.If A and B together could do it in 20 days and C alone in 60 days ,then B alone could do it in:","20 days","40 days","50 days","60 days","60 days"));
        listtime.add(new Modelclass("A and B can do a work in 4 hours and 12 hours respectively. A starts the work at 6 AM and they work alternately for one hour each. When will the work be completed?","4 days","5 days","6 days","7 days","6 days"));
        listtime.add(new Modelclass("A can finish a work in 18 days and B can do the same work in half the time taken by A. then, working together, what part of the same work they can finish in a day ?","Total work","One-fourth work","Half work","Two-third work","Half work"));
        listtime.add(new Modelclass("9 men and 12 boys finish a job in 12 days, 12 men and 12 boys finish it in 10 days. 10 men and 10 boys shall finish it in how many days ?","15 days","11 days","14 days","12 days","12 days"));
        listtime.add(new Modelclass("A can do a piece of work in 30 days. He works at it for 6 days and then B finishes it in 18 days. In what time can A and B together it ?","14 1/2 days","11 days","13 1/4 days","12 6/7 days","12 6/7 days"));
        listtime.add(new Modelclass("When A, B and C are deployed for a task , A and B together do 70% of the work and B and C together do 50% of the work. who is most efficient?","A","B","C","Can't be determined","A"));
        listtime.add(new Modelclass("Amar can do a piece of work in 10 days. He works at it for 4 days and then Arun finishes it in 9 days. In how many days can Amar and Arun together finish the work ?","4 days","8 days","3 days","6 days","6 days"));
        listtime.add(new Modelclass("P and Q can complete a job in 24 days working together. P alone can complete it in 32 days. Both of them worked together for 8 days and then P left. The number of days Q will take to complete the remaining work is ?","56 days","54 days","60 days","64 days","64 days"));
        listtime.add(new Modelclass("A, B and C can complete a piece of work in 24,6 and 12 days respectively.Working together, they will complete the same work in:","1/24 days","7/24 days","24/7 days","4 days","24/7 days"));
        listtime.add(new Modelclass("4 men and 6 women can complete a work in 8 days, while 3 men and 7 women can complete it in 10 days. In how many days will 10 women complete it ?","40 days","36 days","32 days","34 days","40 days"));


    }
}
