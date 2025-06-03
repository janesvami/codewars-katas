package katas.encryption;

import java.util.Arrays;

public class Counter {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        int counter = 0;
        for (int i = 0; i < arrayOfSheeps.length; i++) {
            if (arrayOfSheeps[i] != null) {
                if (arrayOfSheeps[i]) {
                    counter++;
                }
            } else {
                throw new IllegalArgumentException("There is not an object");
            }
        }
        System.out.println("There are " + counter + " real sheep");
        return counter;
    }

}

