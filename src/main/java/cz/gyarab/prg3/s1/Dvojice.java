package cz.gyarab.prg3.s1;

import java.util.ArrayList;
import java.util.List;

public class Dvojice<V extends Comparable> {
    V prvni;
    V druhy;

    public Dvojice(V prvni, V druhy) {
        this.prvni = prvni;
        this.druhy = druhy;
    }

    public V getPrvni() {
        if (prvni.compareTo(druhy) < 0)
            return prvni;
        else
            return druhy;
    }

    public void setPrvni(V prvni) {
        this.prvni = prvni;
    }

    public V getDruhy() {
        return druhy;
    }

    public void setDruhy(V druhy) {
        this.druhy = druhy;
    }

    @Override
    public String toString() {
        Class cl = prvni.getClass();

        return "Dvojice<" + cl.getSimpleName() + ">{" +
                "prvni=" + prvni +
                ", druhy=" + druhy +
                '}';
    }

    public static void main(String[] args) {
        Dvojice<Integer> dveCisla = new Dvojice<>(123123, 1234);
        Dvojice<String> dvaRetezce = new Dvojice<>("aaa", "bbb");

        dvaRetezce.setPrvni("123");

        System.out.println(dveCisla);
        System.out.println(dvaRetezce);

        System.out.println(dveCisla.getPrvni());



    }
}
