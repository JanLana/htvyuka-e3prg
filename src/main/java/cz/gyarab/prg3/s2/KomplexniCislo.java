package cz.gyarab.prg3.s2;

public class KomplexniCislo {
    private double realnaCast;
    private double imaginarniCast;

    public KomplexniCislo(double realnaCast, double imaginarniCast) {
        this.realnaCast = realnaCast;
        this.imaginarniCast = imaginarniCast;
    }

    public KomplexniCislo prictiKomplexniCislo(KomplexniCislo k) {
        return new KomplexniCislo(
                realnaCast + k.realnaCast,
        imaginarniCast + k.imaginarniCast);
    }

    @Override
    public String toString() {
        return realnaCast + " + i * " + imaginarniCast;
    }
}
