package cz.gyarab.prg3.s1.tovarna;

public class Svickova  implements Jidlo {
    int knedliku;

    public Svickova(int knedliku) {
        this.knedliku = knedliku;
    }

    @Override
    public int dejCenu() {
        return 110 + knedliku*10;
    }

    @Override
    public String vyrobTo() {
        return "Lidl vari za vas... a pridej " + knedliku + " knedliky";
    }
}
