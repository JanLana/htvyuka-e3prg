package cz.gyarab.prg3.s1;

public class NemennyObjekt {
    public static void main(String[] args) {
        String vstup = "AHoj";

        vstup =
                Character.toLowerCase(vstup.charAt(0)) +
                        vstup.substring(1);

        System.out.println(vstup);   // "aHoj";

    }
}
