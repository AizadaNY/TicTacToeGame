package controller;

import model.Board;
import model.Player;
import model.SmartPlayer;
import view.BoardView;

public class BoardSmartPlayerController {

    private Board board;
    private BoardView view;
    private Boolean tableUpdated=false;
    private int moveCount=0;


    Player player = new Player("Mark", "X");
    SmartPlayer player2=new SmartPlayer("Smart Player", "O");

    public BoardSmartPlayerController(Board board, BoardView view) {
        this.board = board;
        this.view = view;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public BoardView getView() {
        return view;
    }

    public void setView(BoardView view) {
        this.view = view;
    }


    public Boolean getTableUpdated() {
        return tableUpdated;
    }

    public void setTableUpdated(Boolean tableUpdated) {
        this.tableUpdated = tableUpdated;
    }

    public Boolean updateGameBoard(int row,int column,String value){

        System.out.println("before method "+tableUpdated);
        String[][] gameBoard =board.getGameBoard();
        try {
            if (gameBoard[row][column]==null||gameBoard[row][column].isEmpty()) {
                gameBoard[row][column] = value;
                setTableUpdated(true);
                moveCount++;
            }else{
                setTableUpdated(false);
            }
        }catch (NullPointerException exception){
            exception.printStackTrace();
        }
        System.out.println(tableUpdated);
        return getTableUpdated();
    }

    public void user1UpdatesBoard(){
        setTableUpdated(false);
        while (!getTableUpdated()) {
            updateGameBoard(player.getRowNumberFromUser(),
                    player.getColumnNumberFromUser(), player.getSign());
            getGameBoardView();
        }

    }


    public void getGameBoardView(){
        view.getGameBoard(getBoard().getGameBoard());
    }


}
