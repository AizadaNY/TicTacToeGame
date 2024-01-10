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

    String[][] board=getGameBoard();
    public Boolean getGameResult(String name,String sign) {

        int size = board.length;
        int rowMatchCount = 0;
        int columnMatchCount = 0;
        for (int i = 0; i < board.length; i++) {
            String rowData = board[getRow()][i];
            if (rowData == board[getRow()][getColumn()]) {
                rowMatchCount++;
            }
            String columnData = board[i][getColumn()];
            if (columnData == board[getRow()][getColumn()]) {
                columnMatchCount++;
            }
            if (row == column) {
                String sign1 = board[i][i];
            }
            if (row + column == getGameBoard().length) {
                int k = board.length;
                String sign1 = board[k][i];
                k--;
            }

        }
        if (rowMatchCount == board.length || columnMatchCount == board.length) {
            setPlayerWon(true);
        } else {
            return false;
        }
          return isPlayerWon;
    }

     //diogonal

        public void getDiagonalResult(int i){
            if(row==column){
             String sign1=board[i][i];
            }else if(row+column==getGameBoard().length){
                int k=board.length;
                String sign1=board[k][i];
                k--;
            }
        }
}
