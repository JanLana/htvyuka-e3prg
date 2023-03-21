package cz.gyarab.prg3.s1;

import java.util.Iterator;

public class Trojice<T> implements Iterable<T> {
    T p1;
    T p2;
    T p3;

    public Trojice(T p1, T p2, T p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Iterator<T> iterator() {
        return new IteratorTrojice<T>(this);
    }


    public static void main(String[] args) {
        Iterable<Integer> data = new Trojice<>(1,2,3);
        Trojice<String> data2 = new Trojice<>("ahoj", "nazdar", "cau");

        IteratorTrojice<String> it2 = new IteratorTrojice<>(data2);
        while(it2.hasNext()) {
            String x = it2.next();
            System.out.println(x);
        }

        Iterator<Integer> it = data.iterator();
        while(it.hasNext()) {
            Integer x = it.next();
            System.out.println(x);
        }

        for (Iterator<Integer> it3 = data.iterator(); it3.hasNext(); ) {
            Integer element = it3.next();
            System.out.println(element);
        }

        for(Integer x: data) {
            System.out.println(x);
        }




    }
}
