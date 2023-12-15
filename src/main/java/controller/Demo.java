package controller;

import model.Board;
import model.Player;
import view.BoardView;

public class Demo {

    public static void main(String[] args) {
        Board model=retriveGameBoard();
        BoardView view=new BoardView();

        BoardController controller=new BoardController(model,view);

        model.updateGameBoard(controller.getRowNumberFromUser(),controller.getColumnNumberFromUser(),"X");
        model.updateGameBoard(controller.getRowNumberFromUser(),controller.getColumnNumberFromUser(),"O");
        view.getGameBoard(model.getGameBoard());



    }

    private static Board retriveGameBoard(){
       String[][] array=new String[3][3];
       Board board=new Board(array);
       return board;
    }
}
