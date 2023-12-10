package view;

import java.util.Arrays;

public class GameView {

    public void getTableView(String [][] table){

        System.out.println("Current status of game: ");
        System.out.print(Arrays.toString(table[0]));
        System.out.print(Arrays.toString(table[1]));
        System.out.print(Arrays.toString(table[2]));
    }

}
