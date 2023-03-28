package cz.gyarab.prg3.s2;

import java.util.ArrayList;
import java.util.List;

public class Dvojice<V extends Comparable<V>> { //implements Comparable<Dvojice>{
    V prvni;
    V druhy;

    public Dvojice(V prvni, V druhy) {
        this.prvni = prvni;
        this.druhy = druhy;
    }

    public V getPrvni() {
        return prvni;
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

    public V nejmensi() {
        if (prvni.compareTo(druhy) < 0)
            return prvni;
        else
            return druhy;
    }

    @Override
    public String toString() {
        return "Dvojice{" +
                "prvni=" + prvni +
                ", druhy=" + druhy +
                '}';
    }

    public static void main(String[] args) {
        /*
        List l1 = new ArrayList();
        List<String> l2;

        Dvojice d1 = new Dvojice("c",l1);
        Dvojice<?> d2 = new Dvojice("c",123);
         */


        Dvojice<String> d2;

        //System.out.println(d1.nejmensi());

        Dvojice<Double>  komplexniCislo;
        Dvojice<String> dvaRetezce = new Dvojice<>("12afadsfa3", "ahoj");
        Dvojice<Integer> dveCisla = new Dvojice<>(123, 13);
        //Dvojice<Dvojice> ctverice = new Dvojice(dveCisla, dvaRetezce);


        System.out.println(dvaRetezce);
        System.out.println(dveCisla);
        System.out.println("prvni: " + dveCisla.getPrvni());
        System.out.println("min: " + dveCisla.nejmensi());
    }

    /*
    @Override
    public int compareTo(Dvojice o) {
        return prvni.compareTo(o.getPrvni());
    }

     */
}
