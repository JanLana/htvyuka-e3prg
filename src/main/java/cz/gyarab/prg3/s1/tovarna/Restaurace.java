package cz.gyarab.prg3.s1.tovarna;

public class Restaurace {
    public static void main(String[] args) {
        Jidlo j = TovarnaNaJidlo.vyrobJidlo("svickova se sesti");

        System.out.println("cena: " + j.dejCenu());
        System.out.println("vyrobni postup: " + j.vyrobTo());
    }
}
