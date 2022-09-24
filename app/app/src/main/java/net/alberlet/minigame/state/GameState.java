package net.alberlet.minigame.state;

import java.util.List;
import java.util.Random;

public class GameState {

    private static final Player PLAYER_ONE = new Player();

    private static final Player PLAYER_TWO = new Player();

    private int dice;

    private Player activePlayer;

    private Player inactivePlayer;

    public GameState() {
        activePlayer = PLAYER_ONE;
        inactivePlayer = PLAYER_TWO;
        rollDice();

    }

    private void startTurn() {
        if(activePlayer.equals(PLAYER_ONE)) {
            activePlayer = PLAYER_TWO;
            inactivePlayer = PLAYER_ONE;
        } else {
            activePlayer = PLAYER_ONE;
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
                activePlayer.getTable().addFirstColumn(value);
                break;
            case 2:
                activePlayer.getTable().addSecondColumn(value);
                break;
            default:
                activePlayer.getTable().addThirdColumn(value);
                break;
        }
    }

    public boolean isPresentInInactivePlayerTableInColumn(int value, int column) {
        return getColumnFromPlayer(inactivePlayer, column).contains(value);

    }

    public List<Integer> getColumnFromPlayer(Player player, int column) {
        switch (column) {
            case 1:
                return player.getTable().getFirstColumn();
            case 2:
                return player.getTable().getSecondColumn();
            default:
                return player.getTable().getThirdColumn();
        }
    }
}
