import controller.BoardController;
import model.Board;
import view.BoardView;

public class Game {


    public static void main(String[] args) {


        Board model = getBoard();
        BoardView view = new BoardView();
        BoardController boardController = new BoardController(model, view);


        boardController.runGame();

    }
    public static Board getBoard(){
        Board board=new Board();
        String[][] gameBoard_3X3=new String[3][3];
        board.setGameBoard(gameBoard_3X3);
        return board;
    }









}
