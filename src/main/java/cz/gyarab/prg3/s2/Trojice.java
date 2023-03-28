package cz.gyarab.prg3.s2;

import java.util.Iterator;

public class Trojice<T> implements Iterable<T> {
    T a;
    T b;
    T c;

    public Trojice(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Iterator<T> iterator() {
        return new IteratorTrojice<>(this);
    }

    public static void main(String[] args) {
        Trojice<String> dataS = new Trojice<String>("ahoj", "nazdar", null);
        Trojice<Integer> dataI = new Trojice<>(1,2,3);

        IteratorTrojice<String> iterS = new IteratorTrojice<>(dataS);
        while(iterS.hasNext()) {
            String str = iterS.next();
            System.out.println(str);
        }

        Iterator<Integer> iter2 = dataI.iterator();
        while(iter2.hasNext()) {
            int str = iter2.next();
            System.out.println(str);
        }

        for (Iterator<Integer> iter3 = dataI.iterator(); iter3.hasNext();) {
            Integer element = iter3.next();
            System.out.println(element);
        }
        
        for(Integer element: dataI) {
            System.out.println(element);
        }


    }
}
