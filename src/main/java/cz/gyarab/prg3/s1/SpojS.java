package cz.gyarab.prg3.s1;

public class SpojS<T> {
    T jmeno;
    SpojS dalsi;

    public SpojS(T jmeno, SpojS dalsi) {
        this.jmeno = jmeno;
        this.dalsi = dalsi;
    }

    @Override
    public String toString() {
        return jmeno.toString();
    }

    public static void main(String[] args) {
        //SpojS prvni = new SpojS("jan", null);
        SpojS<String> seznam = new SpojS<>("pepa",
                new SpojS<>("jan",
                        new SpojS<>("lenka",
                                new SpojS<>("jana", null))));

        Strom s = new Strom("jan",
                new Strom("simon", null, null),
                new Strom("josefina",
                        new Strom("pepa", null, null),
                        null));


        //MujIterator i = new UkazovatkoDoSpoS(seznam);
        /* MujIterator i = new UkazovatkoDoStromu(s);

        while (i.hasNext()) {
            //SpojS s = i.next();
            //System.out.printf(s);
            System.out.println(i.next());
        }

         */


    }

}
