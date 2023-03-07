package cz.gyarab.prg3.s1;

public class PouzijJedinacka {
    public static void delejNeco() {
        Jedinacek j1 = Jedinacek.getInstance();
        System.out.println(j1);
        j1.stav = "hotovo";

    }

    public static void main(String[] args) {
        // Jedinacek
        /*Jedinacek j = Jedinacek.getInstance();

        j.stav = "startuju";
        System.out.println(j);
        delejNeco();
        System.out.println(j);


*/
        // Multiton
        Multiton m1 = Multiton.getInstance("config");
        m1.stav = "config startuje";

        Multiton m2 = Multiton.getInstance("dobry den");
        m2.stav = "dobry den startuje";

        Multiton m3 = Multiton.getInstance("config");
        m3.stav = "config startuje podruhe";


        System.out.println(m1);  // config startuje podruhe
        System.out.println(m2);  // dobry den startuje
        System.out.println(m3);  // config startuje podruhe
    }
}
