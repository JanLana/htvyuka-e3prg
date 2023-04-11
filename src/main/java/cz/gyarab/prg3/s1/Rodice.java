package cz.gyarab.prg3.s1;

import java.util.ArrayList;

public class Rodice {
    public static void vypis(Class<?> cl) {
        if (cl == null)
            return;

        System.out.println(cl.getName());
        System.out.println("interfaces:");
        for(var x :cl.getInterfaces()) {
            System.out.println("   " + x);
        }
        vypis(cl.getSuperclass());
    }

    public static void vypisPredky(Object o) {
        vypis(o.getClass());
    }

    public static ArrayList<Class<?>> dejPolePredku(Object a) {
        ArrayList<Class<?>> predci = new ArrayList<>();

        for(Class<?> cl = a.getClass(); cl != null; cl = cl.getSuperclass()) {
            predci.add(0, cl);
        }

        return predci;
    }

    public static void coMajiSpolecneho(Object a, Object b) {
        var predciA = dejPolePredku(a);
        var predciB = dejPolePredku(b);

        for(int i = 0; ; i++) {
            if (i < predciA.size() && i < predciB.size()
                    && predciA.get(i) == predciB.get(i)) {
                continue;
            }
            System.out.println(predciA.get(i-1));
            break;
        }

    }



    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        var b = new ArrayList();

        //vypisPredky(a);

        coMajiSpolecneho(new Integer(1), new Double(1));


    }
}
