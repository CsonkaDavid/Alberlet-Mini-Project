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

    public void addFirstColumn(int integer) {
        if(this.firstColumn.size() < 3) {
            this.firstColumn.add(integer);
        }
    }

    public void addSecondColumn(int integer) {
        if(this.secondColumn.size() < 3) {
            this.secondColumn.add(integer);
        }
    }

    public void addThirdColumn(int integer) {
        if(this.thirdColumn.size() < 3) {
            this.thirdColumn.add(integer);
        }
    }

    public List<Integer> getFirstColumn() {
        return firstColumn;
    }
    public List<Integer> getSecondColumn() {
        return secondColumn;
    }

    public List<Integer> getThirdColumn() {
        return thirdColumn;
    }
}
