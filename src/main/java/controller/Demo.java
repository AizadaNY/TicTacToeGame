package controller;

import model.Board;
import model.Player;
import view.BoardView;

public class Demo {

    public static void main(String[] args) {
        Board model=retriveGameBoard();
        BoardView view=new BoardView();
        Player player1=new Player("Pl1", "X");
        Player player2=new Player("Pl2","O");


        BoardController controller=new BoardController(model,view);


        int moveCount=0;
        while (moveCount!=9) {
            player1.move(controller.getRowNumberFromUser(player1.getUserName()),
                    controller.getColumnNumberFromUser(player1.getUserName()));
            controller.getView().getGameBoard(model.getGameBoard());

            player2.move(controller.getRowNumberFromUser(player2.getUserName()),
                    controller.getColumnNumberFromUser(player2.getUserName()));
            controller.getView().getGameBoard(model.getGameBoard());

        }





    }

    private static Board retriveGameBoard(){
        Board board=new Board(new String[3][3]);
       return board;
    }
}
