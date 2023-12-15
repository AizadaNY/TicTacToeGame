package model;

public class Board {

    private String[][] gameBoard;

    public Board (String[][] gameBoard){
        this.gameBoard=gameBoard;
    }

    public String[][] getGameBoard() {
        return gameBoard;
    }

    public void setGameBoard(String[][] gameBoard) {
        this.gameBoard = gameBoard;
    }

    public Boolean updateGameBoard(int row,int column,String value){
        try {
            if (gameBoard[row][column]==null) {
                gameBoard[row][column] = value;
            }
        }catch (NullPointerException exception){

        }

        return true;
    }
}
