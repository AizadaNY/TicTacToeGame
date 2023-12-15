package controller;

import model.Board;
import model.Player;
import view.BoardView;
import view.PlayerView;

import java.util.Scanner;

public class BoardController {

    private Board board;
    private Player player;
    private BoardView view;
    private PlayerView playerView;


    public BoardController(Board board,BoardView view){
        this.board=board;
        this.player=player;
        this.view=view;
        this.playerView=playerView;
    }

    public int getRowNumberFromUser(){
        System.out.println("Player row number");
        Scanner scanner=new Scanner(System.in);
        int rowNum=scanner.nextInt();
        return rowNum;
    }

    public int getColumnNumberFromUser(){
        System.out.println("Player column number");
        Scanner scanner=new Scanner(System.in);
        int columnNum=scanner.nextInt();
        return columnNum;
    }


}
