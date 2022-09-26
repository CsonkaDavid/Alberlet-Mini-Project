package net.alberlet.minigame.state;

import java.util.ArrayList;
import java.util.List;

public class Table {

    private final List<Integer> firstColumn;

    private final List<Integer> secondColumn;

    private final List<Integer> thirdColumn;

    public Table() {
        this.firstColumn = new ArrayList<>();
        this.secondColumn = new ArrayList<>();
        this.thirdColumn = new ArrayList<>();
    }

    public void addToColumn(int columnIndex, int value) {
        List<Integer> thisColumn = getColumn(columnIndex);
        thisColumn.add(value);
    }

    public void deleteFromColumn(int columnIndex, int index){
        List<Integer> thisColumn = getColumn(columnIndex);
        thisColumn.remove(index);
    }

    public int findInColumn(int columnIndex, int value) {
        List<Integer> thisColumn = getColumn(columnIndex);
        for (int i = 0; i < thisColumn.size(); i++){
            if (thisColumn.get(i) == value ) {
                return i;
            }
        }
        return -1;
    }

    public int getSumOfValues() {
        int score = 0;

        for(int i = 0; i < 3; i++) {
            score += getSumOfValuesInColumn(i);
        }

        return score;
    }

    private int getSumOfValuesInColumn(int columnIndex) {
        List<Integer> thisColumn = getColumn(columnIndex);

        int score = 0;
        int value;
        int savedValue = 0;

        for(int i = 0; i < thisColumn.size(); i++) {
            value = thisColumn.get(i);

            if(value == savedValue)
                continue;

            int counter = 1;

            for(int j = i+1; j < thisColumn.size(); j++)
                if (thisColumn.get(j) == value)
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

    public List<Integer> getColumn(int columnIndex) throws UnsupportedOperationException {
        if (columnIndex < 0 || columnIndex > 2) {
            throw new UnsupportedOperationException("Az oszlop indexe nem 0 es 2 kozott van!");
        }

        switch (columnIndex) {
            case 0:
                return firstColumn;
            case 1:
                return secondColumn;
            default:
                return thirdColumn;
        }
    }

    public int getColumnSize(int columnIndex) {
        return getColumn(columnIndex).size();
    }

}
