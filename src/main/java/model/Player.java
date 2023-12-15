package model;

public class Player {

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

    public void playerMove(){

    }



}
