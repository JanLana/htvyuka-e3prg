package cz.gyarab.prg3.s1;

import java.util.Scanner;

public class CesarovaSifra {
    public static void main(String[] args) {
        char[] abeceda = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        Scanner sc = new Scanner(System.in);
        String vstup = sc.nextLine();
        int klic = sc.nextInt();
        for(char ch: vstup.toCharArray()) {
            System.out.print(ch);
        }
    }
}
