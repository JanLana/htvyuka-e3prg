package cz.gyarab.prg3.s2.restaurace;

public class Svickova implements Jidlo {
    boolean detskaPorce;

    public Svickova(boolean detskaPorce) {
        this.detskaPorce = detskaPorce;
    }

    @Override
    public int dejCenu() {
        return detskaPorce ? 170 : 180;
    }

    @Override
    public String vyrobTo() {
        return "vezmi mrkev, .... a pridej " + (detskaPorce ? 2 : 4) + " knedliky";
    }
}
