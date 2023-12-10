package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {


    private String[][] gameBoard = {{"", "", ""}, {"", "", ""}, {"", "", ""}};
    Player player = new Player();

    Scanner input = new Scanner(System.in);
    Boolean userMadeMove = false;
    Boolean gameOver = false;

    public String[][] getGameBoard() {
        return gameBoard;
    }

    public int getPlayerRowNumber() {
        System.out.println(player.getPlayerName() + " Insert location of the cell");
        System.out.println("Insert row number");
        int row = input.nextInt();
        return row;
    }

    public int getPlayerColumnNumber() {
        System.out.println("Column number");
        int column = input.nextInt();
        return column;
    }

    public void updateGameBoard() {
        int row = getPlayerRowNumber();
        int column = getPlayerColumnNumber();
        String value = player.getPlayerSign();
        String[][] gameBoard = getGameBoard();
        if (gameBoard[row][column].isEmpty()) {
            gameBoard[row][column] = value;
            userMadeMove = true;
        } else {
            System.out.println("Cell already occupied.Select different location");
        }
    }

    public void userMoveOnTable() {
        do {
            updateGameBoard();
        } while (!userMadeMove);
    }

    public boolean gameBoardStatus() {
        String[][] gameBoard = getGameBoard();
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                if (!gameBoard[i][j].isEmpty()) {
                    gameOver = true;
                } else {
                    gameOver = false;
                    System.out.println("GameBoard is not full");
                    break;
                }
            }
        }

        return gameOver;
    }


    public boolean gameResult() {
        String[][] gameBoard = getGameBoard();
        List<String> rowValues = new ArrayList<>();
        List<String> columnValues = new ArrayList<>();
        List<String> dioValues1 = new ArrayList<>();
        List<String> dioValues2 = new ArrayList<>();
        String playerSign = player.getPlayerSign();
        for (int i = 0; i < gameBoard.length; i++) {
            rowValues.clear();
            columnValues.clear();
            dioValues1.clear();
            dioValues2.clear();
            for (int j = 0; j < gameBoard[i].length; j++) {
                rowValues.add(gameBoard[i][j]);
                columnValues.add(gameBoard[j][i]);
                dioValues1.add(gameBoard[j][j]);
                dioValues2.add(gameBoard[j][j--]);
                if ((rowValues.stream().allMatch(n -> n.equals(playerSign))) || (columnValues.stream().allMatch(n -> n.equals(playerSign)))
                        || (dioValues1.stream().allMatch(n -> n.equals(playerSign))) || (dioValues2.stream().allMatch(n -> n.equals(playerSign)))) {
                    gameOver = true;
                    System.out.println(player.getPlayerName() + " won the game");
                    break;
                }else{
                    System.out.println("Game is not over");
                }
            }

        }
        return gameOver;
    }


}