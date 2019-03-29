package com.example.randomgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.concurrent.ThreadLocalRandom;

public class MainActivity extends AppCompatActivity {

    private TextView tvResult,tvWin,tvLoss;
    private Button btnFirst,btnSecond;

    private int Correct=0;
    private int incorrect = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFirst=findViewById(R.id.btnFirst);
        btnSecond=findViewById(R.id.btnSecond);
        tvResult=findViewById(R.id.tvResult);
        tvWin=findViewById(R.id.tvWin);
        tvLoss=findViewById(R.id.tvLoss);

        int first,second;



        GenerateRandomNuber grandom=new GenerateRandomNuber();
        grandom.randomNumber();
        first=grandom.getNum1();
        second=grandom.getNum2();

        if(first==second) {

            grandom.randomNumber();
            first=grandom.getNum1();
            second=grandom.getNum2();
            btnFirst.setText(Integer.toString(first));
            btnSecond.setText(Integer.toString(second));
        }else {
            btnFirst.setText(Integer.toString(first));
            btnSecond.setText(Integer.toString(second));

        }





        btnFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int first,second,win,loss;
                first=Integer.parseInt(btnFirst.getText().toString());
                second=Integer.parseInt(btnSecond.getText().toString());

                 if(first>second){
                     Correct=Correct+1;
                    tvResult.setText(Integer.toString(Correct));

                     tvWin.setText(Integer.toString(Correct));
                    GenerateRandomNuber grandom=new GenerateRandomNuber();
                    grandom.randomNumber();
                     grandom.randomNumber();
                     first=grandom.getNum1();
                     second=grandom.getNum2();

                     if(first==second) {

                         grandom.randomNumber();
                         first=grandom.getNum1();
                         second=grandom.getNum2();
                         btnFirst.setText(Integer.toString(first));
                         btnSecond.setText(Integer.toString(second));
                     }else {
                         btnFirst.setText(Integer.toString(first));
                         btnSecond.setText(Integer.toString(second));

                     }


                }else{

                     Correct=Correct-1;
                     tvResult.setText(Integer.toString(Correct));

                     tvWin.setText(Integer.toString(Correct));
                    GenerateRandomNuber grandom=new GenerateRandomNuber();
                    grandom.randomNumber();
                     grandom.randomNumber();
                     first=grandom.getNum1();
                     second=grandom.getNum2();

                     if(first==second) {

                         grandom.randomNumber();
                         first=grandom.getNum1();
                         second=grandom.getNum2();
                         btnFirst.setText(Integer.toString(first));
                         btnSecond.setText(Integer.toString(second));
                     }else {
                         btnFirst.setText(Integer.toString(first));
                         btnSecond.setText(Integer.toString(second));

                     }


                }

            }
        });


        btnSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first,second;
                first=Integer.parseInt(btnFirst.getText().toString());
                second=Integer.parseInt(btnSecond.getText().toString());

                if(first<second){

                    tvResult.setText("You Win");
                    GenerateRandomNuber grandom=new GenerateRandomNuber();
                    grandom.randomNumber();
                    first=grandom.getNum1();
                    second=grandom.getNum2();

                    if(first==second) {

                        grandom.randomNumber();
                        first=grandom.getNum1();
                        second=grandom.getNum2();
                        btnFirst.setText(Integer.toString(first));
                        btnSecond.setText(Integer.toString(second));
                    }else {
                        btnFirst.setText(Integer.toString(first));
                        btnSecond.setText(Integer.toString(second));

                    }




                }else{
                    tvResult.setText("You Loss");
                    GenerateRandomNuber grandom=new GenerateRandomNuber();
                    grandom.randomNumber();
                    grandom.randomNumber();
                    first=grandom.getNum1();
                    second=grandom.getNum2();

                    if(first==second) {

                        grandom.randomNumber();
                        first=grandom.getNum1();
                        second=grandom.getNum2();
                        btnFirst.setText(Integer.toString(first));
                        btnSecond.setText(Integer.toString(second));
                    }else {
                        btnFirst.setText(Integer.toString(first));
                        btnSecond.setText(Integer.toString(second));

                    }

                }

            }
        });



    }




}
