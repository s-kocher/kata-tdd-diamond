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

        String expectedDisplay = "" +
            " A\n" +
            "B B\n" +
            " A";

        assertEquals(expectedDisplay, diamondDisplay);
    }

    @Test
    public void should_draw_diamond_c() {
        Diamond diamond = new Diamond('C');

        String diamondDisplay = diamond.display();

        String expectedDisplay = "" +
            "  A\n" +
            " B B\n" +
            "C   C\n" +
            " B B\n" +
            "  A";

        assertEquals(expectedDisplay, diamondDisplay);
    }

    @Test
    public void should_draw_diamond_d() {
        Diamond diamond = new Diamond('D');

        String diamondDisplay = diamond.display();

        String expectedDisplay = "" +
            "   A\n" +
            "  B B\n" +
            " C   C\n" +
            "D     D\n" +
            " C   C\n" +
            "  B B\n" +
            "   A";

        assertEquals(expectedDisplay, diamondDisplay);
    }

    @Test
    public void should_draw_diamond_e() {
        Diamond diamond = new Diamond('E');

        String diamondDisplay = diamond.display();

        String expectedDisplay = "" +
            "    A\n" +
            "   B B\n" +
            "  C   C\n" +
            " D     D\n" +
            "E       E\n" +
            " D     D\n" +
            "  C   C\n" +
            "   B B\n" +
            "    A";

        assertEquals(expectedDisplay, diamondDisplay);
    }

}
