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


    public void getGameResult() {

        int boardLength = gameBoard.length;
        int rowMatchCount = 0;
        int columnMatchCount = 0;
        int digMatchCount1=0;
        int digMatchCount2=0;

        String userSign=gameBoard[getRow()][getColumn()];
        for (int i = 0; i < boardLength ; i++) {
            String rowSign = gameBoard[getRow()][i];
            if (rowSign ==userSign) {
                rowMatchCount++;
            }
            String columnSign = gameBoard[i][getColumn()];
            if (columnSign == userSign) {
                columnMatchCount++;
            }
            if (row == column) {
                String diogSign = gameBoard[i][i];
                if (diogSign == userSign) {
                    digMatchCount1++;
                }
            }
            if (row + column == boardLength -1) {
                int k = boardLength -1;
                String diogSign  = gameBoard[k][i];
                if (diogSign == userSign) {
                    digMatchCount2++;
                }
                k--;
            }

        }
        if (rowMatchCount == boardLength  || columnMatchCount ==
                boardLength ||digMatchCount1==boardLength ||digMatchCount2==boardLength ) {
            setPlayerWon(true);
        } else {
            setPlayerWon(false);
        }

    }


}
