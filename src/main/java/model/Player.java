package model;

public class Player extends Board{

    private String userName;
    private String sign;


    public Player(String userName,String sign){
        this.userName=userName;
        this.sign=sign;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public void move(int row,int column){
        while (getTableUpdated()) {
            updateGameBoard(row, column, getSign());
            if(getTableUpdated()){
              int count=getMoveCount();
              setMoveCount(count++);
            }
        }

    }



}
