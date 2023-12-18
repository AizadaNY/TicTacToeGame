package model;

import java.util.Scanner;

public  class  Player {

    private String name;
    private String sign;

    public Player(String name,String sign) {
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


    public int getRowNumberFromUser(){
        int row=0;
        try {
            System.out.println(getName()+" please provide row number");
            Scanner scanner=new Scanner(System.in);
            row=scanner.nextInt();

        }catch (ArrayIndexOutOfBoundsException exception) {

        }
        return row;
    }

    public int getColumnNumberFromUser(){
        int column=0;
        try {
            System.out.println(getName()+ " please provide column number");
            Scanner scanner=new Scanner(System.in);
            column=scanner.nextInt();
        }catch (ArrayIndexOutOfBoundsException exception){

        }

        return column;
    }




}
