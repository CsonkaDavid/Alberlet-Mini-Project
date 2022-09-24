package net.alberlet.minigame.state;

import java.util.ArrayList;
import java.util.List;

public class Table {

    private List<Integer> firstColumn;

    private List<Integer> secondColumn;

    private List<Integer> thirdColumn;

    public Table() {
        this.firstColumn = new ArrayList<>();
        this.secondColumn = new ArrayList<>();
        this.thirdColumn = new ArrayList<>();
    }

    public void addFirstColumn(Integer integer) {
        if(this.firstColumn.size() < 3) {
            this.firstColumn.add(integer);
        }
    }

    public void addSecondColumn(Integer integer) {
        if(this.secondColumn.size() < 3) {
            this.secondColumn.add(integer);
        }
    }

    public void addThirdColumn(Integer integer) {
        if(this.thirdColumn.size() < 3) {
            this.thirdColumn.add(integer);
        }
    }

    public void deleteFromFirstColumn(int index) {
        firstColumn.remove(index);
    }

    public void deleteFromSecondColumn(int index) {
        secondColumn.remove(index);
    }

    public void deleteFromThirdColumn(int index) {
        thirdColumn.remove(index);
    }

    public Integer getFirstColumn(int index) {
        return firstColumn.get(index);
    }

    public Integer getSecondColumn(int index) {
        return secondColumn.get(index);
    }

    public Integer getThirdColumn(int index) {
        return thirdColumn.get(index);
    }
}
