package cz.gyarab.prg3.s1;

public class PouzijJedinacka {
    public static void delejNeco() {
        Jedinacek j1 = Jedinacek.getInstance();
        System.out.println(j1);
        j1.stav = "hotovo";

    }

    public static void main(String[] args) {
        Jedinacek j = Jedinacek.getInstance();
        //Jedinacek j2 = new Jedinacek();

        j.stav = "startuju";

        System.out.println(j);

        delejNeco();

        System.out.println(j);

    }
}
