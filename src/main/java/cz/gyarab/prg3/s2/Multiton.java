package cz.gyarab.prg3.s2;

import java.util.HashMap;

public class Multiton {
    String stav;

    public void setStav(String s) {
        stav = s;
    }

    @Override
    public String toString() {
        return "Jedinacek{" +
                "stav='" + stav + '\'' +
                '}';
    }


    //============================
    private static HashMap<Integer, Multiton> multitonInstances;
    private Multiton() {
        stav = "init";
    }

    public static Multiton getInstance(int i) {
        if (multitonInstances == null)
            multitonInstances = new HashMap<>();

        if (! multitonInstances.containsKey(i)) {
            Multiton m = new Multiton();
            multitonInstances.put(i, m);
        }

        return multitonInstances.get(i);
    }
}




















