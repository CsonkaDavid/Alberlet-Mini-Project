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
        this.score = sumOfScores();
    }

    private int sumOfScores() {
        int score = 0;

        for(int i = 0; i < 3; i++) {
            score += sumOfScoresInTableColumn(table.getColumn(i));
        }

        return score;
    }

    private int sumOfScoresInTableColumn(List<Integer> column) {
        int score = 0;
        int value;
        int savedValue = 0;

        for(int i = 0; i < 3; i++) {
            value = column.get(i);

            if(value == savedValue)
                continue;

            int counter = 1;

            for(int j = i+1; j < 3; j++)
                if (column.get(j) == value)
                    counter++;

            switch (counter) {
                case 1: {
                    score += value;
                    break;
                }
                case 2: {
                    score += value * 4;
                    savedValue = value;
                    break;
                }
                case 3: {
                    score += value * 9;
                    i = counter;
                    break;
                }
            }
        }

        return score;
    }
}
