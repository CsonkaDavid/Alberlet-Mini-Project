package net.alberlet.minigame.state;

import java.util.List;
import java.util.Objects;
import java.util.Random;

public class GameState {

    private final Player PLAYER_ONE = new Player();

    private final Player PLAYER_TWO = new Player();

    private int dice;

    private Player activePlayer;

    private Player inactivePlayer;

    public GameState() {
        startTurn();
        rollDice();
    }

    public void startTurn() {
        if(Objects.isNull(activePlayer) || activePlayer.equals(PLAYER_ONE)) {
            activePlayer = PLAYER_TWO;
            inactivePlayer = PLAYER_ONE;
        } else {
            activePlayer = PLAYER_ONE;
            inactivePlayer = PLAYER_TWO;
        }
        rollDice();
    }

    public void rollDice() {
        Random random = new Random();
        dice = random.nextInt(6) + 1;
    }

    public void refreshScores() {
        PLAYER_ONE.setScore();
        PLAYER_TWO.setScore();
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
        return player.getTable().findInColumn(column, value) != -1;
    }

    public int getDice() {
        return dice;
    }

    public Player getActivePlayer() {
        return activePlayer;
    }

    public Player getInactivePlayer() {
        return inactivePlayer;
    }
}
