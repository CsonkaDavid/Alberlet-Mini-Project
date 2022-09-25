package net.alberlet.minigame.state;

import junit.framework.TestCase;

public class TableTest extends TestCase {

    public void testAddToColumn() {
        //Given
        Table testTable = new Table();

        //When
        testTable.addToColumn(1, 4);
        testTable.addToColumn(1, 3);
        testTable.addToColumn(1, 6);

        //Then
        assertEquals(4, (int) testTable.getColumn(1).get(0));
        assertEquals(3, (int) testTable.getColumn(1).get(1));
        assertEquals(6, (int) testTable.getColumn(1).get(2));
    }

    public void testDeleteFromColumn() {
        //Given
        Table testTable = new Table();

        //When
        testTable.addToColumn(1, 4);
        testTable.addToColumn(1, 3);
        testTable.addToColumn(1, 6);
        testTable.deleteFromColumn(1, 1);

        //Then
        assertEquals(4, (int) testTable.getColumn(1).get(0));
        assertEquals(6, (int) testTable.getColumn(1).get(1));
    }

    public void testFindInColumn() {
        //Given
        Table testTable = new Table();

        //When
        testTable.addToColumn(1, 4);
        testTable.addToColumn(1, 3);
        testTable.addToColumn(1, 4);

        //Then
        assertEquals(1, testTable.findInColumn(1,3));
    }
}