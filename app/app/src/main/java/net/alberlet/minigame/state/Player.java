package net.alberlet.minigame.state;

import java.util.List;

public class Player {
    private final String name;
    private final Table table;

    private int score;

    public Player(String name) {
        this.name = name;
        table = new Table();
        score = 0;
    }

    public String getName() {
        return name;
    }

    public Table getTable() {
        return table;
    }

    public int getScore() {
        return score;
    }

    public void setScore() {
        this.score = this.table.getSumOfValues();
    }


}
