package net.alberlet.minigame.state;

import java.util.List;

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

    public int sumOfScores() {
        int score = 0;

        score += sumOfScoresInTableColumn(table.getFirstColumn());
        score += sumOfScoresInTableColumn(table.getSecondColumn());
        score += sumOfScoresInTableColumn(table.getThirdColumn());

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
