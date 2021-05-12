package fr.arolla.skocher.diamond;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DiamondTest {

    @Test
    public void should_draw_diamond_a() {
        Diamond diamond = new Diamond('A');

        String diamondDisplay = diamond.display();

        assertEquals("A", diamondDisplay);
    }

    @Test
    public void should_draw_diamond_b() {
        Diamond diamond = new Diamond('B');

        String diamondDisplay = diamond.display();

        String expectedDisplay =
            " A \n" +
            "B B\n" +
            " A";

        assertEquals(expectedDisplay, diamondDisplay);
    }

}
