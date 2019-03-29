package com.example.randomgame;


import java.util.concurrent.ThreadLocalRandom;

public class GenerateRandomNuber {

    private int num1,num2;


    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void randomNumber(){
        num1= ThreadLocalRandom.current().nextInt(100);
        num2=ThreadLocalRandom.current().nextInt(100);


    }
}
