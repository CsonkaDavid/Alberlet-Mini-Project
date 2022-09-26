package net.alberlet.minigame.gui;

import net.alberlet.minigame.state.GameState;

public class GameController {
    private static final GameState GAME_STATE = new GameState();

    public GameController(){

    }

    public void startNewTurn(){
        GAME_STATE.startTurn();
    }

//    public String getCurrentPlayerName(){
//
//        return GAME_STATE.getActivePlayer().toString();
//
//    }



}
