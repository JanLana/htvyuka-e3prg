package cz.gyarab.prg3.s2;

public class PouzitiJedinacka {
    public static void udelejNeco() {
        Jedinacek k = Jedinacek.getInstance();
        System.out.println("delam neco:" + k);
    }

    public static void main(String[] args) {
        Jedinacek j = Jedinacek.getInstance();
        Jedinacek j2 = Jedinacek.getInstance();

        System.out.println(j);
        System.out.println(j2);

        j.setStav("hotovo");

        System.out.println(j);
        System.out.println(j2);

        udelejNeco();

        Multiton m1 = Multiton.getInstance(0);
        Multiton m2 = m1.getInstance(100);
        Multiton m3 = Multiton.getInstance(0);

        m1.stav = "jedna";
        m2.stav = "dva";
        m3.stav = "tri";

        System.out.println(m1); // tri
        System.out.println(m2); // dva
        System.out.println(m3); // tri

    }
}
