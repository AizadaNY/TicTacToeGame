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
        int row=

        return row;
    }

    public int getColumnNumber(int bound){
        int column=

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
                if(table[row][column])
            }
        }

    }

    public void getNextValuesOfCell(String[][] table,int row, int column){
        int count=0;
        int blankRow;
        int blankColumn;
        for (int i = 0; i <table.length; i++) {
            if(table[row][i]=="X"){
                 count++;
            }else{
               blankRow=row;
               blankColumn=i;
            }
            if(count==2){
                table[row][i]="O";
            }
        }
    }






}
