package model;

import java.util.Random;
import java.util.Scanner;

public class RandomPlayer {

    private String name;
    private String sign;

    public RandomPlayer(String name,String sign) {
        this.name=name;
        this.sign=sign;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }


    public int getRowNumber(int bound){
        int row=generateRandomNumber(bound);

        return row;
    }

    public int getColumnNumber(int bound){
        int column=generateRandomNumber(bound);

        return column;
    }

    public int generateRandomNumber(int bound){
        Random random=new Random();
        int number=random.nextInt(bound);
        return number;
    }
}
