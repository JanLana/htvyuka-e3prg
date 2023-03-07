package cz.gyarab.prg3.s2.restaurace;

public class TovarnaNaJidlo {
    public static Jidlo vyrobJidlo(String jmenoJidla) {
        if (jmenoJidla == null) {
            return null;
        } else if (jmenoJidla.equals("dort")) {
            return new DortPejskaAKocicky();
        } else if (jmenoJidla.equals("svickova")) {
            return new Svickova(false);
        } else if (jmenoJidla.equals("detska svickova")) {
            return new Svickova(true);
        } else {
            throw new IllegalArgumentException("Nezname jidlo.");
        }
    }
}
