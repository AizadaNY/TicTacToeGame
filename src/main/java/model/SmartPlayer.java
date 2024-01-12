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
    int blankRow=0;
    int blankColumn=0;
    public void checkUserElements(String[][] table,int row,int column,String competitorSign){
        int rowCount=0;
        int columnCount=0;
        int diagonalCount=0;
        for (int i = 0; i < table.length; i++) {
            //check row
            if (table[row][i] ==competitorSign) {
                rowCount++;
            } else {
                blankRow = row;
                blankColumn = i;
            }
            //column
            if (table[i][column] == competitorSign) {
                columnCount++;
            } else {
                blankColumn = column;
                blankRow = i;
            }

            //diagonal
            if(table[i][i]==competitorSign){
                diagonalCount++;
            }else{
                blankColumn=i;
                blankRow=i;
            }

        }


    }

    public int checkRow(String[][] table,int row,String competitorSign,int i){
        int count=0;

            if (table[row][i] ==competitorSign) {
                count++;
            } else {
                blankRow = row;
                blankColumn = i;
            }

            return count;
    }


    public int checkColumn(String[][] table,int column,String competitorSign,int i){
        int count=0;

            if (table[i][column] == competitorSign) {
                count++;
            } else {
                blankColumn = column;
                blankRow = i;
            }
            return count;
    }

    public int checkDiagonal(String[][] table,int row,int column,String competitorSign,int i){
        int count=0;

             if(table[i][i]==competitorSign){
                 count++;
              }else{
                blankColumn=i;
                blankRow=i;
              }

        return count;
}










}
