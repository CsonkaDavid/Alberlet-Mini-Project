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

    public void addValueToPlayerTableOnColumn(Player player, int column, int value) {
        player.getTable().addToColumn(column, value);
    }

    public void deleteValueFromColumnFromPlayer(Player player, int column, int value) {
        while (isPresentInPlayerTableInColumn(player, column, value)) {
            player.getTable().deleteFromColumn(column, player.getTable().findInColumn(column, value));
        }
    }

    public boolean isPresentInPlayerTableInColumn(Player player, int column, int value) {
        if (player.getTable().findInColumn(column, value) == -1) {
            return false;
        } else {
            return true;
        }
    }

}
