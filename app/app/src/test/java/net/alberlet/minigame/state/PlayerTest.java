package net.alberlet.minigame.state;

import junit.framework.TestCase;

import org.junit.Test;

public class PlayerTest extends TestCase {

    @Test
    public void testSetScoreWithTwoEqualValues() {
        Player testPlayer = new Player("testplayer");

        testPlayer.getTable().addToColumn(0, 4);
        testPlayer.getTable().addToColumn(0, 5);
        testPlayer.getTable().addToColumn(0, 5);

        testPlayer.getTable().addToColumn(1, 5);
        testPlayer.getTable().addToColumn(1, 4);
        testPlayer.getTable().addToColumn(1, 5);

        testPlayer.getTable().addToColumn(2, 5);
        testPlayer.getTable().addToColumn(2, 5);
        testPlayer.getTable().addToColumn(2, 4);

        testPlayer.setScore();
        assertEquals(72, testPlayer.getScore());
    }

    @Test
    public void testSetScoreWithEqualValues() {
        Player testPlayer = new Player("testplayer");

        testPlayer.getTable().addToColumn(0, 5);
        testPlayer.getTable().addToColumn(0, 5);
        testPlayer.getTable().addToColumn(0, 5);

        testPlayer.getTable().addToColumn(1, 5);
        testPlayer.getTable().addToColumn(1, 5);
        testPlayer.getTable().addToColumn(1, 5);

        testPlayer.getTable().addToColumn(2, 5);
        testPlayer.getTable().addToColumn(2, 5);
        testPlayer.getTable().addToColumn(2, 5);

        testPlayer.setScore();
        assertEquals(135, testPlayer.getScore());
    }

    @Test
    public void testSetScoreWithDifferentValues() {
        Player testPlayer = new Player("testplayer");

        testPlayer.getTable().addToColumn(0, 5);
        testPlayer.getTable().addToColumn(0, 4);
        testPlayer.getTable().addToColumn(0, 3);

        testPlayer.getTable().addToColumn(1, 5);
        testPlayer.getTable().addToColumn(1, 4);
        testPlayer.getTable().addToColumn(1, 3);

        testPlayer.getTable().addToColumn(2, 5);
        testPlayer.getTable().addToColumn(2, 4);
        testPlayer.getTable().addToColumn(2, 3);

        testPlayer.setScore();
        assertEquals(36, testPlayer.getScore());
    }

    @Test
    public void testSetScoreWithAllZeros() {
        Player testPlayer = new Player("testplayer");

        testPlayer.setScore();
        assertEquals(0, testPlayer.getScore());
    }

    @Test
    public void testSetScoreWithFewZeros() {
        Player testPlayer = new Player("testplayer");
        testPlayer.getTable().addToColumn(0, 5);
        testPlayer.getTable().addToColumn(0, 0);
        testPlayer.getTable().addToColumn(0, 0);

        testPlayer.getTable().addToColumn(1, 5);
        testPlayer.getTable().addToColumn(1, 5);
        testPlayer.getTable().addToColumn(1, 0);

        testPlayer.getTable().addToColumn(2, 5);
        testPlayer.getTable().addToColumn(2, 0);
        testPlayer.getTable().addToColumn(2, 0);

        testPlayer.setScore();
        assertEquals(30, testPlayer.getScore());
    }


}