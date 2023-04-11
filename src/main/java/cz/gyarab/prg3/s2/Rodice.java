package cz.gyarab.prg3.s2;

import java.util.ArrayList;
import java.util.List;

public class Rodice {

    static void vypis(Class<?> cl) {
        if (cl == null)
            return;

        System.out.println(cl.getName());
        for(var x : cl.getInterfaces()) {
            System.out.println("   " + x.getName());
        }

        vypis(cl.getSuperclass());
    }
    static void vypisPredky(Object o) {
        vypis(o.getClass());
    }

    static List<Class> dejPolePredku(Class cl) {
        List<Class> arr = new ArrayList<>();

        while(cl != null) {
            arr.add(cl);
            cl = cl.getSuperclass();
        }

        return arr;
    }


    static void dejSpolecnehoPredka(Object a, Object b) {
        var predciA = dejPolePredku(b.getClass());
        var predciB = dejPolePredku(b.getClass());

        for (var x : predciA) {
            for (var y: predciB) {
                if (x.equals(y))
                    System.out.println(x);
            }
        }

        /*
        for(int i = 0; ; i++) {
            if (i < predciA.size() &&
                    i < predciB.size() &&
                    predciA.get(i) == predciB.get(i))
                continue;

        }
        */




    }

    public static void main(String[] args) {
        ArrayList<String> o = new ArrayList<String>();

        //vypisPredky(o);

        dejSpolecnehoPredka(new Integer(1), new Float(1.1));

    }
}
