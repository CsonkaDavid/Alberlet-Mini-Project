package net.alberlet.minigame.state;

import java.util.List;
import java.util.Objects;
import java.util.Random;

public class GameState {

    private final Player PLAYER_ONE = new Player("player1");

    private final Player PLAYER_TWO = new Player("player2");

    private int dice;

    private Player activePlayer;

    private Player inactivePlayer;

    public GameState() {
        startTurn();
        rollDice();
    }

    public void startTurn() {
        if(Objects.isNull(activePlayer) || activePlayer.equals(PLAYER_TWO)) {
            activePlayer = PLAYER_ONE;
            inactivePlayer = PLAYER_TWO;
        } else {
            activePlayer = PLAYER_TWO;
            inactivePlayer = PLAYER_ONE;
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

    public void addValueToPlayerTableOnColumn(String playerName, int column, int value) {
        getPlayer(playerName).getTable().addToColumn(column, value);
    }

    public void deleteValueFromColumnFromPlayer(String playerName, int column, int value) {
        Player player = getPlayer(playerName);
        while (isPresentInPlayerTableInColumn(player, column, value)) {
            player.getTable().deleteFromColumn(column, player.getTable().findInColumn(column, value));
        }
    }

    private boolean isPresentInPlayerTableInColumn(Player player, int column, int value) {
        return player.getTable().findInColumn(column, value) != -1;
    }

    public int getDice() {
        return dice;
    }


    public String getActivePlayerName() {
        return activePlayer.getName();
    }

    public String getInactivePlayerName() {
        return inactivePlayer.getName();
    }

    public int getSizeOfColumnFromPlayer(String playerName, int columnIndex) {
        return getPlayer(playerName).getTable().getColumnSize(columnIndex);
    }

    private Player getPlayer(String playerName) {
        if (playerName.equals(PLAYER_ONE.getName())) {
            return PLAYER_ONE;
        } else if (playerName.equals(PLAYER_TWO.getName())){
            return PLAYER_TWO;
        } else {
            return null;
        }
    }

}
