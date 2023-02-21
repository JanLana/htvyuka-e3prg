package cz.gyarab.prg3.s1;

public class Jedinacek {
    public String stav;

    @Override
    public String toString() {
        return "Jedinacek{" +
                "stav='" + stav + '\'' +
                '}';
    }

    private static Jedinacek singletonInstance;
    private Jedinacek() {


    }

    public static Jedinacek getInstance() {
        if (null == singletonInstance) {
            singletonInstance = new Jedinacek();
        }
        return singletonInstance;
    }
}