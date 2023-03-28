package cz.gyarab.prg3.s2;

import java.util.HashSet;
import java.util.Set;

public class DvojiceMnozin<T extends Set> {
    T prvni;
    T druhy;


    public static void main(String[] args) {
        Set<Integer> mn1 = new HashSet<>();
        mn1.add(132);
        System.out.println(mn1);
        mn1.add(12);
        System.out.println(mn1);
        mn1.add(132);
        System.out.println(mn1);

        Set<Integer> mn2 = new HashSet<>();

        DvojiceMnozin<Set<Integer>> m = new DvojiceMnozin<>(mn1, mn2);

        //System.out.println(m.mensi());
        //System.out.println(m.nejmensiPrvek());



    }

}
