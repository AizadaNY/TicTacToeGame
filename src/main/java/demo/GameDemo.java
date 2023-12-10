package demo;

import controller.PlayerController;
import model.Player1;
import view.PlayerView;

public class GameDemo {
    public static void main(String[] args) {

        Player1 model=retrieveDataFromPlayer();
        PlayerView view=new PlayerView();
        PlayerController controller=new PlayerController(model, view);

        controller.setPlayerName("User1");
        controller.updateView();

    }
        private static Player1 retrieveDataFromPlayer() {
              Player1 player=new Player1();
              player.setPlayerName("Aizada");
              player.setPlayerSign("X");
              return player;
        }

}
