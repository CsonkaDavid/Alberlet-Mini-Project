package net.alberlet.minigame.state;

import java.util.Random;

public class GameState {

    private static final Player PLAYER_ONE = new Player();

    private static final Player PLAYER_TWO = new Player();

    private int dice;

    private Player currentPlayer;

    private Player inactivePlayer;

    public GameState() {
        currentPlayer = PLAYER_ONE;
        inactivePlayer = PLAYER_TWO;
        rollDice();

    }

    private void startTurn() {
        if(currentPlayer.equals(PLAYER_ONE)) {
            currentPlayer = PLAYER_TWO;
            inactivePlayer = PLAYER_ONE;
        } else {
            currentPlayer = PLAYER_ONE;
            inactivePlayer = PLAYER_TWO;
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

        switch (column) {
            case 1:
                currentPlayer.getTable().addFirstColumn(value);
                break;
            case 2:
                currentPlayer.getTable().addSecondColumn(value);
                break;
            default:
                currentPlayer.getTable().addThirdColumn(value);
                break;
        }
    }



}
