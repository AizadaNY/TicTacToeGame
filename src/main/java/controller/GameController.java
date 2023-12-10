package controller;

import model.Game;
import view.GameView;

import java.util.Scanner;

public class GameController {

    private Game model;
    private GameView view;


    public GameController(Game model,GameView view){
        this.model=model;
        this.view=view;
    }

    public Game getModel() {
        return model;
    }

    public void setModel(Game model) {
        this.model = model;
    }

    public GameView getView() {
        return view;
    }

    public void setView(GameView view) {
        this.view = view;
    }
}
