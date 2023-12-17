package controller;

import model.Board;
import model.Player;
import view.BoardView;
import view.PlayerView;

import java.util.Scanner;

public class BoardController {

    private Board board;
    private Player player;

    public BoardView getView() {
        return view;
    }

    public void setView(BoardView view) {
        this.view = view;
    }

    private BoardView view;
    private PlayerView playerView;

    Player player1=new Player("Pl1","X");
    Player player2=new Player("Pl2", "O");
    Board gameBoard=new Board(new String[3][3]);

    public BoardController(Board board,BoardView view){
        this.board=board;
        this.view=view;

    }

    public int getRowNumberFromUser(String playerName){
        int rowNum=0;

        try {
            System.out.println(playerName+" row number");
            Scanner scanner=new Scanner(System.in);
            rowNum=scanner.nextInt();

        }catch (Exception exception) {


        }
        return rowNum;
    }

    public int getColumnNumberFromUser(String playerName){
        System.out.println(playerName+ " column number");
        Scanner scanner=new Scanner(System.in);
        int columnNum=scanner.nextInt();
        return columnNum;
    }













}
