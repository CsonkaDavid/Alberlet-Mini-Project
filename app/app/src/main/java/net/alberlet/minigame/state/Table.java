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

    public void addToColumn(int columnIndex, int integer) {
        List<Integer> thisColumn = getColumn(columnIndex);
        if (thisColumn.size() < 3) {
            thisColumn.add(integer);
        }
    }

    public void deleteFromColumn(int columnIndex, int index){
        List<Integer> thisColumn = getColumn(columnIndex);
        thisColumn.remove(index);
    }

    public List<Integer> getColumn(int columnIndex) {
        if (columnIndex < 1 || columnIndex > 3) {
            throw new UnsupportedOperationException("Az oszlop indexe nem 1 es 3 kozott van!");
        }

        switch (columnIndex) {
            case 1:
                return firstColumn;
            case 2:
                return secondColumn;
            default:
                return thirdColumn;
        }
    }
}
