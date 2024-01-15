package model;

import java.util.Random;

public class SmartPlayer extends Player {


    public SmartPlayer(String name, String sign) {
        super(name, sign);
    }

    public int getRowNumber(int bound) {
        int row = 0;

        return row;
    }

    public int getColumnNumber(int bound) {
        int column = 0;

        return column;
    }

    //block user1
    //collect 3
    public void blockUser() {
        //get user move
        //move to next cell
    }


    int blankRow = 0;
    int blankColumn = 0;
    int rowCount = 0;
    int columnCount = 0;
    int diagonal1Count = 0;
    int diagonal2Count = 0;
    int myRowCount = 0;

    public void checkUserElements(String[][] table, int row, int column, String competitorSign) {
        for (int i = 0; i < table.length; i++) {
            //check row
            if (table[row][i] == competitorSign) {
                rowCount++;
            } else if (table[row][i] == getSign()) {
                myRowCount++;
            } else {
                blankColumn = i;
            }
            //column
            if (table[i][column] == competitorSign) {
                columnCount++;
            } else {
                blankColumn = column;
                blankRow = i;
            }
            if (row == column) {
                //diagonal
                if (table[i][i] == competitorSign) {
                    diagonal1Count++;
                } else {
                    blankColumn = i;
                    blankRow = i;
                }

            } else if (row + column == table.length - 1) {
                int k = table.length - 1;
                k--;
                if (table[k][i] == competitorSign) {
                    diagonal2Count++;
                } else {
                    blankColumn = i;
                    blankRow = i;
                }
            }

        }


    }

    public int checkRow(String[][] table, int row, String competitorSign, int i) {
        int count = 0;

        if (table[row][i] == competitorSign) {
            count++;
        } else {
            blankRow = row;
            blankColumn = i;
        }

        return count;
    }


    public int checkColumn(String[][] table, int column, String competitorSign, int i) {
        int count = 0;

        if (table[i][column] == competitorSign) {
            count++;
        } else {
            blankColumn = column;
            blankRow = i;
        }
        return count;
    }

    public int checkDiagonal(String[][] table, int row, int column, String competitorSign, int i) {
        int count = 0;

        if (table[i][i] == competitorSign) {
            count++;
        } else {
            blankColumn = i;
            blankRow = i;
        }

        return count;
    }


    public void checkNeighbourCells(String[][] table, int row, int column, String competitorSign){


         if(row>0&&row<table.length-1){
             String neighCellValue1=table[row-1][column];
             String neighCellValue2=table[row+1][column];
             if(column>0&&column< table.length-1){
                 String neighCellValue3=table[row][column-1];
                 String neighCellValue4=table[row][column+1];
             }else if(column==0){
                 String neighCellValue3=table[row][column+1];
             }else{
                 String neighCellValue3=table[row][column-1];
             }
         } else if(row==0){
             String neighCellValue1=table[row+1][column];
             if(column>0&&column< table.length-1){
                 String neighCellValue2=table[row][column-1];
                 String neighCellValue3=table[row][column+1];
             }else if(column==0){
                 String neighCellValue2=table[row][column+1];
                 String neighCellValue3=table[row+1][column+1];
             }else{
                 String neighCellValue2=table[row][column-1];
                 String neighCellValue3=table[row+1][column-1];
             }
         }else{
             String neighCellValue1=table[row-1][column];
             if(column>0&&column< table.length-1){
                 String neighCellValue2=table[row][column-1];
                 String neighCellValue3=table[row][column+1];
             }else if(column==0){
                 String neighCellValue2=table[row][column+1];
                 String neighCellValue3=table[row-1][column+1];
             }else{
                 String neighCellValue2=table[row][column-1];
                 String neighCellValue3=table[row-1][column-1];
             }
         }



    }




    }
