package cz.gyarab.prg3.s2;

public class Jedinacek {
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
    private static Jedinacek singletonInstance;
    private Jedinacek() {
        stav = "init";
    }

    public static Jedinacek getInstance() {
        if (null == singletonInstance) {
            singletonInstance = new Jedinacek();
        }
        return singletonInstance;
    }
}
