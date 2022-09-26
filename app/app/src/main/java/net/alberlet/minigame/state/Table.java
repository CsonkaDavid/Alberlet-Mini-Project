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
        for(int i=0;i<3;i++)
            if(thisColumn.get(i)==0) {
                thisColumn.set(i, value);
                return;
            }
    }

    public void deleteFromColumn(int columnIndex, int index){
        List<Integer> thisColumn = getColumn(columnIndex);
        for(int i=0;i<3;i++)
            if(i==index)
                thisColumn.set(i, 0);
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

    public int getFirstEmptyCellIndex(int columnIndex){
        List<Integer> currentColumn = getColumn(columnIndex);

        for(int i=0; i<3; i++)
            if(currentColumn.get(i)==0)
                return i;
        return -1;
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
}
