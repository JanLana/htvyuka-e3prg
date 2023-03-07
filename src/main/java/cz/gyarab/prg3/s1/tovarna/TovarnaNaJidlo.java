package cz.gyarab.prg3.s1.tovarna;

public class TovarnaNaJidlo {
    public static Jidlo vyrobJidlo(String jmenoJidla) {
        if (jmenoJidla == null) {
            return null;
        } if (jmenoJidla.equals("dort")) {
            return new DortPejskaAKocicky();
        } if (jmenoJidla.equals("svickova")) {
            return new Svickova(4);
        } if (jmenoJidla.equals("svickova se sesti")) {
            return new Svickova(6);
        } else {
            throw new IllegalArgumentException("Nezname jidlo.");
        }
    }
}
