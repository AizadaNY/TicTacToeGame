package model;

import java.util.Random;

public class SmartPlayer {

    private String name;
    private String sign;

    public SmartPlayer(String name,String sign) {
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
        int row=0;

        return row;
    }

    public int getColumnNumber(int bound){
        int column=0;

        return column;
    }

    //block user1
    //collect 3
    public void blockUser(){
        //get user move
        //move to next cell
    }

    public void checkUserElements(int row, int column,String[][] table){
        //check user move
        for (int i = 0; i < table.length ; i++) {
            for (int j = 0; j < table[i].length; j++) {

            }
        }

    }

    public void checkRow(String[][] table,int row,String competitorSign){
        int count=0;
        int blankRow=0;
        int blankColumn=0;
        for (int i = 0; i <table.length; i++) {
            if (table[row][i] ==competitorSign) {
                count++;
            } else {
                blankRow = row;
                blankColumn = i;
            }
        }
            if(count==2){
                table[row][blankColumn]=getSign();
            }else if(count==1){

            }

    }


    public void checkColumn(String[][] table,int column,String competitorSign){
        int count=0;
        int blankRow=0;
        int blankColumn=0;
        for (int i = 0; i <table.length; i++) {
            if (table[i][column] == competitorSign) {
                count++;
            } else {
                blankColumn = column;
                blankRow = i;
            }
        }
        if(count==2){
            table[blankRow][column]=getSign();
        }else if(count==1){

        }

    }

    public void checkDiagonal(String[][] table,int row,int column,String competitorSign){
        int count=0;
        int blankRow=0;
        int blankColumn=0;
        for (int i = 0; i < table.length; i++) {
              if(table[i][i]==competitorSign){
                 count++;
              }else{
                blankColumn=i;
                blankRow=i;
              }
            }

        if(count==2){
            table[blankRow][column]=getSign();
        }else if(count==1){

        }
        }


    }

    //decide if assign sign of user should be only 1 for all of them








}
