package model;

public class Board {

    private String[][] gameBoard;
    private Boolean tableUpdated=false;
    private int moveCount=0;

    public Board(){

    }

    public Board (String[][] gameBoard){
        this.gameBoard=gameBoard;
    }

    public Boolean getTableUpdated() {
        return tableUpdated;
    }

    public void setTableUpdated(Boolean tableUpdated) {
        this.tableUpdated = tableUpdated;
    }

    public String[][] getGameBoard() {
        return gameBoard;
    }

    public void setGameBoard(String[][] gameBoard) {
        this.gameBoard = gameBoard;
    }

    public int getMoveCount() {
        return moveCount;
    }

    public void setMoveCount(int moveCount) {
        this.moveCount = moveCount;
    }

    public Boolean updateGameBoard(int row,int column,String value){
        try {
            if (gameBoard[row][column]==null) {
                gameBoard[row][column] = value;
                tableUpdated=true;
            }else{
                tableUpdated=false;
            }
        }catch (NullPointerException exception){

        }

        return tableUpdated;
    }


}
