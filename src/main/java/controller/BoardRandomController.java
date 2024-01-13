package controller;

import model.Board;
import model.Player;
import model.Player2;
import model.RandomPlayer;
import view.BoardView;

public class BoardRandomController {

    private Board board;
    private BoardView view;
    private Boolean tableUpdated=false;
    private int moveCount=0;


    Player player = new Player("Mark", "X");
    RandomPlayer player2 = new RandomPlayer("Random", "O");

    public BoardRandomController(Board board, BoardView view) {
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


        String[][] gameBoard =board.getGameBoard();
        try {
            if (gameBoard[row][column]==null||gameBoard[row][column].isEmpty()) {
                board.setRow(row);
                board.setColumn(column);
                gameBoard[board.getRow()][board.getColumn()] = value;
                setTableUpdated(true);
                moveCount++;
            }else{
                setTableUpdated(false);
            }
        }catch (NullPointerException exception){
            exception.printStackTrace();
        }

        return getTableUpdated();
    }

    public void user1UpdatesBoard(){
        if (moveCount < 9) {
            setTableUpdated(false);
            while (!getTableUpdated()) {
                updateGameBoard(player.getRowNumberFromUser(),
                        player.getColumnNumberFromUser(), player.getSign());
                getGameBoardView();
            }
        } else {
            getGameBoardView();

        }


    }

    public void user2UpdatesBoard() {
        setTableUpdated(false);

        if (moveCount < 9) {
            System.out.println("Random Player: ");
            while (!getTableUpdated()) {
                updateGameBoard(player2.getRowNumber(getBoard().getGameBoard().length),
                        player2.getColumnNumber(getBoard().getGameBoard().length), player2.getSign());
            }
            getGameBoardView();
        } else {
            getGameBoardView();
            System.out.println("Game board is full");
        }
    }

    public void runGame(){
        while (moveCount<=9||board.isPlayerWon()) {
            user1UpdatesBoard();
            board.getGameResult();
            if(board.isPlayerWon()==true){
                System.out.println("Game over "+player.getName()+ " is the winner");
                break;
            }
            user2UpdatesBoard();
            board.getGameResult();
            if(board.isPlayerWon()==true){
                System.out.println("Game over "+player2.getName()+ " is the winner");
                break;
            }
        }

    }

    public void getGameBoardView(){
        view.getGameBoard(getBoard().getGameBoard());
    }


}
