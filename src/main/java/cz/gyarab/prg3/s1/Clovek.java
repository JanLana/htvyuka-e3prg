package cz.gyarab.prg3.s1;

import lombok.ToString;

@ToString()
public class Clovek {
    String jmeno;
    String prijmeni;

    int vek = 123;

    public Clovek(String jmeno, String prijmeni) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
    }

    public static void main(String[] args) {
        Clovek cl = new Clovek("Jan", "Lana");
        System.out.println(cl);
    }
}
