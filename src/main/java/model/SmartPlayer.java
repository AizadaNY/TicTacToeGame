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


    public void checkNeighbourCells(String[][] table, int row, int column, String competitorSign){
        int rowToMove=0;
        int columnToMove=0;
        int bottomRow=row-1;
        int topRow=row+1;
        int rightColumn=row-1;
        int leftColumn=row+1;
        String bottomCell;
        String topCell;
        String rightCell;
        String leftCell;
         if(row>0&&row<table.length-1){
             bottomCell=table[bottomRow][column];
             topCell=table[topRow][column];
             //check sign-----------------------------------
             if(topCell==competitorSign) {
                 if(bottomCell==null||bottomCell.isEmpty()||bottomCell==null||bottomCell==null) {
                     rowToMove = bottomRow;
                     columnToMove = column;
                 }
             }else if(bottomCell==competitorSign){
                 if(topCell==null||topCell.isEmpty()){
                     rowToMove=topRow;
                     rowToMove=column;
                 }
             }
             //----  ------------------------------
             if(column>0&&column< table.length-1){
                  leftCell=table[row][leftColumn];
                  rightCell=table[row][rightColumn];

                  if(leftCell==competitorSign) {
                      if (rightCell == null || rightCell.isEmpty()) {
                          rowToMove = row;
                          columnToMove = rightColumn;
                      }
                  }
                 if(rightCell==competitorSign) {
                     if (leftCell == null || leftCell.isEmpty()) {
                         rowToMove = row;
                         columnToMove = leftColumn;
                     }
                 }
                 if(row==column){
                     //dopgRow
                 }

             }else if(column==0){
                  rightCell=table[row][rightColumn];
                  if(rightCell==competitorSign){
                      if(table[row][rightColumn+1].isEmpty()||table[row][rightColumn+1]==null){
                          rowToMove=row;
                          columnToMove=rightColumn+1;
                      }
                  }
             }else{
                  leftCell=table[row][leftColumn];
                  if(leftCell==competitorSign){
                      if(table[row][leftColumn-1].isEmpty()||table[row][leftColumn-1]==null){
                          rowToMove=row;
                          columnToMove=leftColumn-1;
                      }
                  }
             }


         } else if(row==0){
                  bottomCell=table[bottomRow][column];
             if(column>0&&column< table.length-1){
                 String neighCellValue2=table[row][leftColumn];
                 String neighCellValue3=table[row][rightColumn];
             }else if(column==0){
                 String neighCellValue2=table[row][rightColumn];
                 String neighCellValue3=table[topRow][leftColumn];
             }else{
                 String neighCellValue2=table[row][leftColumn];
                 String neighCellValue3=table[topRow][leftColumn];
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
