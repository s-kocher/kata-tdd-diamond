package fr.arolla.skocher.diamond;

import java.util.Arrays;

public class Diamond {

    private final char widthLetter;

    public Diamond(char widthLetter) {
        this.widthLetter = widthLetter;
    }

    public String display() {
        if (widthLetter == 'D') {
            return "" +
                displayTip() + "\n" +
                getSpaces(2) + "B" + getSpaces(1) + "B" + "\n" +
                getSpaces(1) + "C" + getSpaces(3) + "C" + "\n" +
                getSpaces(0) + "D" + getSpaces(5) + "D" + "\n" +
                getSpaces(1) + "C" + getSpaces(3) + "C" + "\n" +
                getSpaces(2) + "B" + getSpaces(1) + "B" + "\n" +
                displayTip();
        }
        if (widthLetter == 'C') {
            return "" +
                displayTip() + "\n" +
                getSpaces(1) + "B" + getSpaces(1) + "B" + "\n" +
                getSpaces(0) + "C" + getSpaces(3) + "C" + "\n" +
                getSpaces(1) + "B" + getSpaces(1) + "B" + "\n" +
                displayTip();
        }
        if (widthLetter == 'B') {
            return "" +
                displayTip() + "\n" +
                getSpaces(0) + "B" + getSpaces(1) + "B" + "\n" +
                displayTip();
        }

        return displayTip();
    }

    private String displayTip() {
        int depth = Character.getNumericValue(widthLetter) - Character.getNumericValue('A');
        String leftSpaces = getSpaces(depth);
        return leftSpaces + "A";
    }

    private static String getSpaces(int spacesNumber) {
        return " ".repeat(spacesNumber);
    }

}
