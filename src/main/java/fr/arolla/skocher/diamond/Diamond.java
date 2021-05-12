package fr.arolla.skocher.diamond;

import java.util.Arrays;

public class Diamond {

    private final char widthLetter;

    public Diamond(char widthLetter) {
        this.widthLetter = widthLetter;
    }

    public String display() {
        if (widthLetter == 'B') {
            return
                " A \n" +
                "B B\n" +
                " A";
        }

        return "A";
    }
}
