package controller;

import model.Player;
import sun.plugin.com.Utils;
import view.PlayerView;

import java.util.Arrays;
import java.util.Scanner;

public class PlayerController extends TableController{

    private Player model;
    private PlayerView view;
    Scanner input=new Scanner(System.in);
    boolean userMadeMove=false;

    public PlayerController(Player model,PlayerView view){
        this.model=model;
        this.view=view;
    }



    //to control model object
    public void setPlayerName(String name){
        model.setPlayerName(name);
    }

    public void setPlayerSign(String sign){
        model.setPlayerSign(sign);
    }

    public String getPlayerName(){
        return model.getPlayerName();
    }

    public String getPlayerSign(){
        return model.getPlayerSign();
    }

    //to control view object

    public void updateView(){
        view.playerDetails(model.getPlayerName(),model.getPlayerSign());
    }




    public int getPlayerRowNumber() {
        System.out.println(getPlayerName() + " Insert location of the cell");
        System.out.println("Insert row number");
        int row=input.nextInt();
        return row;
    }

    public int getPlayerColumnNumber() {
        System.out.println("Column number");
        int column=input.nextInt();
        return column;
    }

    public void insertValueToTable() {
        int row = getPlayerRowNumber();
        int column = getPlayerColumnNumber();
        String value =getPlayerSign();
         String[][] arrTable=getTable();
        if ( arrTable[row][column].isEmpty()){
            arrTable[row][column] = value;
            userMadeMove=true;
        }else{
            System.out.println("Cell already occupied.Select different location");
        }
    }


    public void userMoveOnTable(String value, String[][] arr, Scanner scanner){
        do {
           insertValueToTable();
        }while (!userMadeMove);
    }



}
