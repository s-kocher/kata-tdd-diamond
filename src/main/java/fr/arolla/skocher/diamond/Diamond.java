package fr.arolla.skocher.diamond;

import java.util.Arrays;

public class Diamond {

    public static final String LINE_SEPARATOR = "\n";

    private final char widthLetter;
    private int AIndex;
    private int depth;

    public Diamond(char widthLetter) {
        this.widthLetter = widthLetter;

        this.AIndex = Character.getNumericValue('A');

        //Ex :  A => 10; D => 13; depth = 13-10 => diamond depth for D is 3
        this.depth = Character.getNumericValue(widthLetter) - AIndex;
    }

    public String display() {
        StringBuilder result = new StringBuilder();

        result.append(displayTip());

        if (depth > 0) {
            result.append(LINE_SEPARATOR);
        }

        //Ex : From B to D
        for (int level = 1; level <= depth; level++) {
            result.append(displayLineLetter(level));
        }
        //Ex : From C to B
        for (int level = depth - 1; level > 0; level--) {
            result.append(displayLineLetter(level));
        }

        if (depth > 0) {
            result.append(displayTip());
        }

        return result.toString();
    }

    private String displayTip() {
        String leftSpaces = getSpaces(depth);
        return leftSpaces + "A";
    }

    private String displayLineLetter(int level) {
        int letterIndex = AIndex + level;
        char letter = getLetterFromIndex(letterIndex);

        String leftSpaces = getSpaces(depth - level);
        String middleSpaces = getSpaces(level * 2 - 1);

        return leftSpaces + letter + middleSpaces + letter + LINE_SEPARATOR;
    }

    private static char getLetterFromIndex(int letterIndex) {
        return Character.toUpperCase(Character.forDigit(letterIndex, Character.MAX_RADIX));
    }

    private static String getSpaces(int spacesNumber) {
        return " ".repeat(spacesNumber);
    }

}
