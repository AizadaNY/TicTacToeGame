package model;

import java.util.Random;


public class RandomPlayer extends Player {


    public RandomPlayer(String name, String sign) {
        super(name, sign);
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
