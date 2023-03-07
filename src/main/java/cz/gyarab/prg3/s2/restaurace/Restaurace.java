package cz.gyarab.prg3.s2.restaurace;

public class Restaurace {
    public static void main(String[] args) {
        Jidlo j = TovarnaNaJidlo.vyrobJidlo("detska svickova");

        System.out.println("cena: " + j.dejCenu());
        System.out.println("recept: " + j.vyrobTo());
    }
}
