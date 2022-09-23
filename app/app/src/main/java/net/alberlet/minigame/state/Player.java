package net.alberlet.minigame.state;

public class Player {

    private final Table table;

    private int score;

    public Player() {
        table = new Table();
        score = 0;
    }

    public Table getTable() {
        return table;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

}
