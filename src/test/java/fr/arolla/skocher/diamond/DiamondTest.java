package fr.arolla.skocher.diamond;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DiamondTest {

    @Test
    public void should_for_A_get_single_a_diamond() {
        Diamond diamond = new Diamond('A');

        String diamondDisplay = diamond.display();

        assertEquals("A", diamondDisplay);
    }

}
