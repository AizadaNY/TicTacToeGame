package demo;

import controller.PlayerController;
import model.Player;
import view.PlayerView;

public class GameDemo {
    public static void main(String[] args) {

        Player model=retrieveDataFromPlayer();
        PlayerView view=new PlayerView();
        PlayerController controller=new PlayerController(model, view);

        controller.setPlayerName("User1");
        controller.updateView();

    }
        private static Player retrieveDataFromPlayer() {
              Player player=new Player();
              player.setPlayerName("Aizada");
              player.setPlayerSign("X");
              return player;
        }

}
