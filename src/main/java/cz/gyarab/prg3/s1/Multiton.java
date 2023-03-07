package cz.gyarab.prg3.s1;

import java.util.HashMap;

public class Multiton {
    public String stav;

    @Override
    public String toString() {
        return "Multion{" +
                "stav='" + stav + '\'' +
                '}';
    }

    private static HashMap<String,Multiton> multitonInstances;

    private Multiton() {


    }

    public static Multiton getInstance(String key) {
        if (null == multitonInstances) {
            multitonInstances = new HashMap<>();
        }
        if (multitonInstances.containsKey(key)) {
            return multitonInstances.get(key);
        }

        multitonInstances.put(key, new Multiton());
        return multitonInstances.get(key);
    }
}