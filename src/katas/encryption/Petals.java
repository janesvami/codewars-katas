package katas.encryption;

public class Petals {
    public static String howMuchILoveYou(int nb_petals) {
        int petalNumber = nb_petals % 6;
        String rezult = switch (petalNumber) {
            case 1 -> "I love you";
            case 2 -> "a little";
            case 3 -> "a lot";
            case 4 -> "passionately";
            case 5 -> "madly";
            case 0 -> "not at all";
            default -> throw new IllegalStateException("Unexpected value: " + petalNumber);
        };
        System.out.println(rezult);
        return rezult;
    }
}

