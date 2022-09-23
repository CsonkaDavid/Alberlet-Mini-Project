package net.alberlet.minigame.state;

import java.util.Random;

public class GameState {

    private static final Player PLAYER_ONE = new Player();

    private static final Player PLAYER_TWO = new Player();

    private int dice;

    private Player currentPlayer;

    public GameState() {
        currentPlayer = PLAYER_ONE;
        rollDice();

    }

    private void startTurn() {
        if(currentPlayer.equals(PLAYER_ONE)) {
            currentPlayer = PLAYER_TWO;
        } else {
            currentPlayer = PLAYER_ONE;
        }
        rollDice();

    }

    private void rollDice() {
        Random random = new Random();
        dice = random.nextInt(6) + 1;
    }

    public void addValueToTableOnColumn(int value, int column) throws UnsupportedOperationException{
        if(column < 1 || column > 3) {
            throw new UnsupportedOperationException("Az oszlop indexe nem 1 es 3 kozott van!");
        }

        if(column == 1) {
            currentPlayer.getTable().addFirstColumn(value);
        } else if (column == 2) {
            currentPlayer.getTable().addSecondColumn(value);
        } else if (column == 3) {
            currentPlayer.getTable().addThirdColumn(value);
        }

    }

}
