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
                getSpaces(3) + "A" + "\n" +
                getSpaces(2) + "B" + getSpaces(1) + "B" + "\n" +
                getSpaces(1) + "C" + getSpaces(3) + "C" + "\n" +
                getSpaces(0) + "D" + getSpaces(5) + "D" + "\n" +
                getSpaces(1) + "C" + getSpaces(3) + "C" + "\n" +
                getSpaces(2) + "B" + getSpaces(1) + "B" + "\n" +
                getSpaces(3) + "A";
        }
        if (widthLetter == 'C') {
            return "" +
            getSpaces(2) + "A" + "\n" +
            getSpaces(1) + "B" + getSpaces(1) + "B" + "\n" +
            getSpaces(0) + "C" + getSpaces(3) + "C" + "\n" +
            getSpaces(1) + "B" + getSpaces(1) + "B" + "\n" +
            getSpaces(2) + "A";
        }
        if (widthLetter == 'B') {
            return "" +
                getSpaces(1) + "A" + "\n" +
                getSpaces(0) + "B" + getSpaces(1) + "B" + "\n" +
                getSpaces(1) + "A";
        }

        return "A";
    }

    private static String getSpaces(int spacesNumber) {
        return " ".repeat(spacesNumber);
    }

}
