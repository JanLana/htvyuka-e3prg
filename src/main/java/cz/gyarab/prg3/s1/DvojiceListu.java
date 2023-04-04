package cz.gyarab.prg3.s1;

import java.util.ArrayList;
import java.util.List;

public class DvojiceListu<T extends Comparable> {
    List<T> prvni;
    List<T> druhy;

    /*
    public Dvojice(V prvni, V druhy) {
        this.prvni = prvni;
        this.druhy = druhy;
    }*/

    public DvojiceListu(List<T> prvni, List<T> druhy) {
        this.prvni = prvni;
        this.druhy = druhy;
    }

    public static void main(String[] args) {

        ArrayList<String> seznam1 = new ArrayList<>();
        seznam1.add("ahoj");
        seznam1.add("nazdar");

        ArrayList<String> seznam2 = new ArrayList<>();
        seznam1.add("dobry den");

        DvojiceListu<?> dvaSeznamyRetezcu = new DvojiceListu<>(seznam1, seznam2);

        System.out.println("kratsi seznam:" ); //dvaSeznamyRetezcu.dejKratsi());

        //System.out.println("kratsi seznam:" + dvaSeznamyRetezcu.dejPrvniZKratsiho());

    }

}
