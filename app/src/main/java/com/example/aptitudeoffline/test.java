package com.example.aptitudeoffline;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class test extends AppCompatActivity {

    CardView test1,test2,test3,test4,test5;
    public static ArrayList<Modelclass> testone,testtwo,testthree,testfour,testfive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        setupUIViews();
        test1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(test.this,test1.class);
                startActivity(intent);
            }
        });
        test2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(test.this,test2.class);
                startActivity(intent);
            }
        });
        test3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(test.this,test3.class);
                startActivity(intent);
            }
        });
        test4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(test.this,test4.class);
                startActivity(intent);
            }
        });
        test5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(test.this,test5.class);
                startActivity(intent);
            }
        });

        testone = new ArrayList<>();
        testone.add(new Modelclass("A train running at the speed of 60 km/hr crosses a pole in 9 seconds. What is the length of the train?","120 m","180 m","324 m","150 m","150 m"));
        testone.add(new Modelclass("A can do a work in 15 days and B in 20 days. If they work on it together for 4 days, then the fraction of the work that is left is :","1/4","1/10","7/15","8/15","8/15"));
        testone.add(new Modelclass("Alfred buys an old scooter for Rs. 4700 and spends Rs. 800 on its repairs. If he sells the scooter for Rs. 5800, his gain percent is:","4  4/7 %","5  5/11 %","10 %","12 %","5  5/11 %"));
        testone.add(new Modelclass("A and B invest in a business in the ratio 3 : 2. If 5% of the total profit goes to charity and A's share is Rs. 855, the total profit is:","Rs. 1425","Rs. 1500","Rs. 1537.50","Rs. 1576","Rs. 1500"));
        testone.add(new Modelclass("A batsman scored 110 runs which included 3 boundaries and 8 sixes. What percent of his total score did he make by running between the wickets?","45%","45  5/11%","54  6/11%","55%","45  5/11%"));
        testone.add(new Modelclass("Father is aged three times more than his son Ronit. After 8 years, he would be two and a half times of Ronit's age. After further 8 years, how many times would he be of Ronit's age?","2 times","2  1/2 times","2  3/4 times","3 times","2 times"));
        testone.add(new Modelclass("It was Sunday on Jan 1, 2006. What was the day of the week Jan 1, 2010?","Sunday","Saturday","Friday","Wednesday","Friday"));
        testone.add(new Modelclass("An accurate clock shows 8 o'clock in the morning. Through how may degrees will the hour hand rotate when the clock shows 2 o'clock in the afternoon?","144°","150°","168°","180°","180°"));
        testone.add(new Modelclass("In the first 10 overs of a cricket game, the run rate was only 3.2. What should be the run rate in the remaining 40 overs to reach the target of 282 runs?","6.25","6.5","6.75","7","6.25"));
        testone.add(new Modelclass("If one-third of one-fourth of a number is 15, then three-tenth of that number is:","35","36","45","54","54"));
        testone.add(new Modelclass("Evaluate : [	(2.39)² - (1.61)²] / 2.39 - 1.61 ","2","4","6","8","4"));
        testone.add(new Modelclass("The cube root of .000216 is: ","0.6","0.06","77","87","0.06"));
        testone.add(new Modelclass("A and B together have Rs. 1210. If 4/15 of A's amount is equal to 2/5 of B's amount, how much amount does B have?","Rs. 460","Rs. 484","Rs. 550","Rs. 664","Rs. 484"));
        testone.add(new Modelclass("Tickets numbered 1 to 20 are mixed up and then a ticket is drawn at random. What is the probability that the ticket drawn has a number which is a multiple of 3 or 5?","1/2","2/5","8/15","9/20","9/20"));
        testone.add(new Modelclass("Look at this series: 2, 1, (1/2), (1/4), ... What number should come next?","1/3","1/8","2/8","1/16","1/8"));
        testone.add(new Modelclass("Odometer is to mileage as compass is to","speed","hiking","needle","direction","direction"));
        testone.add(new Modelclass("SCD, TEF, UGH, ____, WKL","CMN","UJI","VIJ","IJT","VIJ"));
        testone.add(new Modelclass("Pointing to a photograph of a boy Suresh said, 'He is the son of the only son of my mother.' How is Suresh related to that boy?","Brother","Uncle","Cousin","Father","Father"));
        testone.add(new Modelclass("One morning Udai and Vishal were talking to each other face to face at a crossing. If Vishal's shadow was exactly to the left of Udai, which direction was Udai facing?","East","West","North","South","North"));
        testone.add(new Modelclass("120, 99, 80, 63, 48, ?","35","38","39","40","35"));

        testtwo = new ArrayList<>();
        testtwo.add(new Modelclass("A train 125 m long passes a man, running at 5 km/hr in the same direction in which the train is going, in 10 seconds. The speed of the train is:","45 km/hr","50 km/hr","54 km/hr","55 km/hr","50 km/hr"));
        testtwo.add(new Modelclass("A can lay railway track between two given stations in 16 days and B can do the same job in 12 days. With help of C, they did the job in 4 days only. Then, C alone can do the job in:","9  1/5 days","9  2/5 days","9  3/5 days","10 days","9  3/5 days"));
        testtwo.add(new Modelclass("The cost price of 20 articles is the same as the selling price of x articles. If the profit is 25%, then the value of x is:","15","16","18","25","16"));
        testtwo.add(new Modelclass("A, B and C jointly thought of engaging themselves in a business venture. It was agreed that A would invest Rs. 6500 for 6 months, B, Rs. 8400 for 5 months and C, Rs. 10,000 for 3 months. A wants to be the working member for which, he was to receive 5% of the profits. The profit earned was Rs. 7400. Calculate the share of B in the profit.","Rs. 1900","Rs. 2660","Rs. 2800","Rs. 2840","Rs. 2660"));
        testtwo.add(new Modelclass("Two students appeared at an examination. One of them secured 9 marks more than the other and his marks was 56% of the sum of their marks. The marks obtained by them are:","39, 30","41, 32","42, 33","43, 34","42, 33"));
        testtwo.add(new Modelclass("The sum of ages of 5 children born at the intervals of 3 years each is 50 years. What is the age of the youngest child?","4 years","8 years","10 years","None of these","4 years"));
        testtwo.add(new Modelclass("What was the day of the week on 28th May, 2006?","Thursday","Friday","Saturday","Sunday","Sunday"));
        testtwo.add(new Modelclass("The reflex angle between the hands of a clock at 10.25 is:","180°","192  1/2°","195°","197  1/2°","197  1/2°"));
        testtwo.add(new Modelclass("A family consists of two grandparents, two parents and three grandchildren. The average age of the grandparents is 67 years, that of the parents is 35 years and that of the grandchildren is 6 years. What is the average age of the family?","28  4/7 years","31  5/7 years","32  1/7 years","None","31  5/7 years"));
        testtwo.add(new Modelclass("Three times the first of three consecutive odd integers is 3 more than twice the third. The third integer is:","9","11","13","15","15"));
        testtwo.add(new Modelclass("What decimal of an hour is a second ?","0.0025","0.0256","0.00027","0.000126","0.00027"));
        testtwo.add(new Modelclass("What should come in place of both x in the equation x/√128 = √162/x ","12","14","144","196","12"));
        testtwo.add(new Modelclass("Two numbers are respectively 20% and 50% more than a third number. The ratio of the two numbers is:","2:5","3:5","4:5","6:7","4:5"));
        testtwo.add(new Modelclass("A bag contains 2 red, 3 green and 2 blue balls. Two balls are drawn at random. What is the probability that none of the balls drawn is blue?","10/21","11/21","2/7","5/7","10/21"));
        testtwo.add(new Modelclass("Look at this series: 7, 10, 8, 11, 9, 12, ... What number should come next?","7","10","12","13","10"));
        testtwo.add(new Modelclass("Marathon is to race as hibernation is to","winter","bear","dream","sleep","sleep"));
        testtwo.add(new Modelclass("B2CD, _____, BCD4, B5CD, BC6D","B2C2D","BC3D","B2C3D","BCD7","BC3D"));
        testtwo.add(new Modelclass("If A + B means A is the mother of B; A - B means A is the brother B; A % B means A is the father of B and A x B means A is the sister of B, which of the following shows that P is the maternal uncle of Q?","Q - N + M x P","P + S x N - Q","P - M + N x Q","Q - S % P","P - M + N x Q"));
        testtwo.add(new Modelclass("Y is in the East of X which is in the North of Z. If P is in the South of Z, then in which direction of Y, is P?","North","South","South-East","None","None"));
        testtwo.add(new Modelclass("589654237, 89654237, 8965423, 965423, ?","58965","65423","89654","96542","96542"));

        testthree = new ArrayList<>();
        testthree.add(new Modelclass("The length of the bridge, which a train 130 metres long and travelling at 45 km/hr can cross in 30 seconds, is:","200 m","225 m","245 m","250 m","245 m"));
        testthree.add(new Modelclass("A, B and C can do a piece of work in 20, 30 and 60 days respectively. In how many days can A do the work if he is assisted by B and C on every third day?","12 days","15 days","16 days","18 days","15 days"));
        testthree.add(new Modelclass("If selling price is doubled, the profit triples. Find the profit percent.","66  2/3","100","105  1/3","120","100"));
        testthree.add(new Modelclass("A, B and C enter into a partnership in the ratio 7/2 : 4/3 : 6/5 . After 4 months, A increases his share 50%. If the total profit at the end of one year be Rs. 21,600, then B's share in the profit is:","Rs. 2100","Rs. 2400","Rs. 3600","Rs. 4000","Rs. 4000"));
        testthree.add(new Modelclass("A fruit seller had some apples. He sells 40% apples and still has 420 apples. Originally, he had:","588 apples","600 apples","672 apples","700 apples","700 apples"));
        testthree.add(new Modelclass("A father said to his son, 'I was as old as you are at the present at the time of your birth'. If the father's age is 38 years now, the son's age five years back was:","14 years","19 years","33 years","38 years","14 years"));
        testthree.add(new Modelclass("What was the day of the week on 17th June, 1998?","Monday","Tuesday","Wednesday","Thursday","Wednesday"));
        testthree.add(new Modelclass("A clock is started at noon. By 10 minutes past 5, the hour hand has turned through:","145°","150°","155°","160°","155°"));
        testthree.add(new Modelclass("A grocer has a sale of Rs. 6435, Rs. 6927, Rs. 6855, Rs. 7230 and Rs. 6562 for 5 consecutive months. How much sale must he have in the sixth month so that he gets an average sale of Rs. 6500?","Rs. 4991","Rs. 5991","Rs. 6001","Rs. 6991","Rs. 4991"));
        testthree.add(new Modelclass("The difference between a two-digit number and the number obtained by interchanging the positions of its digits is 36. What is the difference between the two digits of that number?","3","4","9","None","4"));
        testthree.add(new Modelclass("The value of [(0.96)³ - (0.1)³] / [(0.96)² + 0.096 + (0.1)²] is : ","0.86","0.95","0.97","1.06","0.86"));
        testthree.add(new Modelclass("The least perfect square, which is divisible by each of 21, 36 and 66 is:","213444","214344","214434","231444","213444"));
        testthree.add(new Modelclass("A sum of money is to be distributed among A, B, C, D in the proportion of 5 : 2 : 4 : 3. If C gets Rs. 1000 more than D, what is B's share?","Rs. 500","Rs. 1500","Rs. 2000","None of these","Rs. 2000"));
        testthree.add(new Modelclass("In a box, there are 8 red, 7 blue and 6 green balls. One ball is picked up randomly. What is the probability that it is neither red nor green?","1/3","3/4","7/19","8/21","1/3"));
        testthree.add(new Modelclass("Look at this series: 36, 34, 30, 28, 24, ... What number should come next?","20","22","23","26","22"));
        testthree.add(new Modelclass("Window is to pane as book is to","novel","glass","cover","page","page"));
        testthree.add(new Modelclass("FAG, GAF, HAI, IAH, ____","JAK","HAL","HAK","JAI","JAK"));
        testthree.add(new Modelclass("If A is the brother of B; B is the sister of C; and C is the father of D, how D is related to A?","Brother","Sister","Nephew","Cannot be determined","Cannot be determined"));
        testthree.add(new Modelclass("If South-East becomes North, North-East becomes West and so on. What will West become?","North-East","North-West","South-East","South-West","South-East"));
        testthree.add(new Modelclass("3, 10, 101,?","10101","10201","10202","11012","10202"));

        testfour = new ArrayList<>();
        testfour.add(new Modelclass("Two trains running in opposite directions cross a man standing on the platform in 27 seconds and 17 seconds respectively and they cross each other in 23 seconds. The ratio of their speeds is:","1:3","3:2","3:4","None","3:2"));
        testfour.add(new Modelclass("A is thrice as good as workman as B and therefore is able to finish a job in 60 days less than B. Working together, they can do it in:","20 days","22  1/2 days","25 days","30 days","22  1/2 days"));
        testfour.add(new Modelclass("In a certain store, the profit is 320% of the cost. If the cost increases by 25% but the selling price remains constant, approximately what percentage of the selling price is the profit?","30%","70%","100%","250%","70%"));
        testfour.add(new Modelclass("A, B, C subscribe Rs. 50,000 for a business. A subscribes Rs. 4000 more than B and B Rs. 5000 more than C. Out of a total profit of Rs. 35,000, A receives:","Rs. 8400","Rs. 11900","Rs. 13600","Rs. 14700","Rs. 14700"));
        testfour.add(new Modelclass("What percentage of numbers from 1 to 70 have 1 or 9 in the unit's digit?","1","14","20","21","20"));
        testfour.add(new Modelclass("A is two years older than B who is twice as old as C. If the total of the ages of A, B and C be 27, then how old is B?","7","8","9","10","10"));
        testfour.add(new Modelclass("What will be the day of the week 15th August, 2010?","Sunday","Monday","Tuesday","Friday","Sunday"));
        testfour.add(new Modelclass("A watch which gains 5 seconds in 3 minutes was set right at 7 a.m. In the afternoon of the same day, when the watch indicated quarter past 4 o'clock, the true time is:","59  7/12 min past 3","4 PM","58  7/11 min past 3","2  3/11 min past 4","4 PM"));
        testfour.add(new Modelclass("The average of 20 numbers is zero. Of them, at the most, how many may be greater than zero?","0","1","10","19","19"));
        testfour.add(new Modelclass("The difference between a two-digit number and the number obtained by interchanging the digits is 36. What is the difference between the sum and the difference of the digits of the number if the ratio between the digits of the number is 1 : 2 ?","4","8","16","None","8"));
        testfour.add(new Modelclass("The value of [0.1 x 0.1 x 0.1 + 0.02 x 0.02 x 0.02] / [0.2 x 0.2 x 0.2 + 0.04 x 0.04 x 0.04]","0.0125","0.125","0.25","0.5","0.125"));
        testfour.add(new Modelclass("√1.5625 = ?","1.05","1.25","1.45","1.55","1.25"));
        testfour.add(new Modelclass("Seats for Mathematics, Physics and Biology in a school are in the ratio 5 : 7 : 8. There is a proposal to increase these seats by 40%, 50% and 75% respectively. What will be the ratio of increased seats?","2:3:4","6:7:8","6:8:9","None of these","2:3:4"));
        testfour.add(new Modelclass("What is the probability of getting a sum 9 from two throws of a dice?","1/6","1/8","1/9","1/12","1/9"));
        testfour.add(new Modelclass("Look at this series: 22, 21, 23, 22, 24, 23, ... What number should come next?","22","24","25","26","25"));
        testfour.add(new Modelclass("Cup is to coffee as bowl is to","dish","soup","spoon","food","soup"));
        testfour.add(new Modelclass("ELFA, GLHA, ILJA, _____, MLNA","OLPA","KLMA","LLMA","KLLA","KLLA"));
        testfour.add(new Modelclass("If A + B means A is the brother of B; A - B means A is the sister of B and A x B means A is the father of B. Which of the following means that C is the son of M?","M - N x C + F","F - C + N x M","N + M - F x C","M x N - C + F","M x N - C + F"));
        testfour.add(new Modelclass("A man walks 5 km toward south and then turns to the right. After walking 3 km he turns to the left and walks 5 km. Now in which direction is he from the starting place?","West","South","North-East","South-West","South-West"));
        testfour.add(new Modelclass("In the series 2, 6, 18, 54, ...... what will be the 8th term ?","4370","4374","7443","7434","4374"));

        testfive = new ArrayList<>();
        testfive.add(new Modelclass("A train passes a station platform in 36 seconds and a man standing on the platform in 20 seconds. If the speed of the train is 54 km/hr, what is the length of the platform?","120 m","240 m","300 m","None","240 m"));
        testfive.add(new Modelclass("A alone can do a piece of work in 6 days and B alone in 8 days. A and B undertook to do it for Rs. 3200. With the help of C, they completed the work in 3 days. How much is to be paid to C?","Rs. 375","Rs. 400","Rs. 600","Rs. 800","Rs. 400"));
        testfive.add(new Modelclass("A vendor bought toffees at 6 for a rupee. How many for a rupee must he sell to gain 20%?","3","4","5","6","5"));
        testfive.add(new Modelclass("Three partners shared the profit in a business in the ratio 5 : 7 : 8. They had partnered for 14 months, 8 months and 7 months respectively. What was the ratio of their investments?","5 : 7 : 8","20 : 49 : 64","38 : 28 : 21","None of these","20 : 49 : 64"));
        testfive.add(new Modelclass("If A = x% of y and B = y% of x, then which of the following is true?","A is smaller than B","A is greater than B","Cannot be determined","None of these","None of these"));
        testfive.add(new Modelclass("Present ages of Sameer and Anand are in the ratio of 5 : 4 respectively. Three years hence, the ratio of their ages will become 11 : 9 respectively. What is Anand's present age in years?","24","27","40","Cannot be determined","24"));
        testfive.add(new Modelclass("Today is Monday. After 61 days, it will be:","Wednesday","Saturday","Tuesday","Thursday","Saturday"));
        testfive.add(new Modelclass("How much does a watch lose per day, if its hands coincide every 64 minutes?","32  8/11 min","36  5/11 min","90 min","96 min","32  8/11 min"));
        testfive.add(new Modelclass("The average weight of 8 person's increases by 2.5 kg when a new person comes in place of one of them weighing 65 kg. What might be the weight of the new person?","76 kg","76.5 kg","85 kg","Data inadquate","85 kg"));
        testfive.add(new Modelclass("A two-digit number is such that the product of the digits is 8. When 18 is added to the number, then the digits are reversed. The number is:","18","24","42","81","24"));
        testfive.add(new Modelclass("If 2994 ÷ 14.5 = 172, then 29.94 ÷ 1.45 = ?","0.172","1.72","17.2","172","17.2"));
        testfive.add(new Modelclass("If 3√5 + √125 = 17.88, then what will be the value of √80 + 6√5 ?","13.41","20.46","21.66","22.35","22.35"));
        testfive.add(new Modelclass("In a mixture 60 litres, the ratio of milk and water 2 : 1. If this ratio is to be 1 : 2, then the quantity of water to be further added is:","20 L","30 L","40 L","60 L","60 L"));
        testfive.add(new Modelclass("Three unbiased coins are tossed. What is the probability of getting at most two heads?","3/4","1/4","3/8","7/8","7/8"));
        testfive.add(new Modelclass("Look at this series: 53, 53, 40, 40, 27, 27, ... What number should come next?","12","14","27","53","14"));
        testfive.add(new Modelclass("Yard is to inch as quart is to","gallon","ounce","milk","liquid","ounce"));
        testfive.add(new Modelclass("CMM, EOO, GQQ, _____, KUU","GRR","GSS","ISS","ITT","ISS"));
        testfive.add(new Modelclass("Introducing a boy, a girl said, 'He is the son of the daughter of the father of my uncle.' How is the boy related to the girl?","Brother","Nephew","Uncle","Son-in-law","Brother"));
        testfive.add(new Modelclass("Rahul put his timepiece on the table in such a way that at 6 P.M. hour hand points to North. In which direction the minute hand will point at 9.15 P.M. ?","South-East","South","North","West","West"));
        testfive.add(new Modelclass("125,80,45,20,?","5","8","10","12","5"));


    }

    private void setupUIViews() {
        test1 = findViewById(R.id.test1);
        test2 = findViewById(R.id.test2);
        test3 = findViewById(R.id.test3);
        test4 = findViewById(R.id.test4);
        test5 = findViewById(R.id.test5);
    }
}
