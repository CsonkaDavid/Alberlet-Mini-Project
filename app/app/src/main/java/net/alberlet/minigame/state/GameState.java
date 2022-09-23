package net.alberlet.minigame.state;

import java.util.Random;

public class GameState {

    private static final Player PLAYER_ONE = new Player();

    private static final Player PLAYER_TWO = new Player();

    private int dice;

    public GameState() {
        rollDice();
    }

    private void rollDice() {
        Random random = new Random();
        dice = random.nextInt(6) + 1;
    }

}
