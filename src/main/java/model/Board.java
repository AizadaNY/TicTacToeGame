package model;

public class Board {

    private String[][] gameBoard;
    private int row;
    private int column;

    public boolean isPlayerWon() {
        return isPlayerWon;
    }

    public void setPlayerWon(boolean playerWon) {
        isPlayerWon = playerWon;
    }

    private boolean isPlayerWon=false;

    public int getRow() { return row; }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }


    public Board(){ }

    public Board (String[][] gameBoard){
        this.gameBoard=gameBoard;
    }


    public String[][] getGameBoard() { return gameBoard; }

    public void setGameBoard(String[][] gameBoard) {
        this.gameBoard = gameBoard;
    }



    String rowData="";
    String columnData="";
    String diogData="";
    public Boolean getGameResult(String name,String sign){
        String match="";
        switch(sign) {
            case "X":
             match="XXX";
                break;
            case "O":
                match="OOO";
                break;
            default:

        }
        String[][] board=getGameBoard();
        rowData=board[getRow()][0]+board[getRow()][1]+board[getRow()][2].toUpperCase();
        columnData=board[0][getColumn()]+board[1][getColumn()]+board[2][getColumn()].toUpperCase();

        if(rowData==match||columnData==match){
            setPlayerWon(true);
            System.out.println(name+ " won the game");
        }else if(columnData==match||columnData==match){
            setPlayerWon(true);
            System.out.println(name+ " won the game");

        }

      return isPlayerWon();
    }
}
