package cz.gyarab.prg3.s1;

public class Strom {
    String jmeno;

    Strom levySyn;
    Strom pravySyn;

    public Strom(String jmeno, Strom levySyn, Strom pravySyn) {
        this.jmeno = jmeno;
        this.levySyn = levySyn;
        this.pravySyn = pravySyn;
    }

    @Override
    public String toString() {
        return jmeno;
    }
}
