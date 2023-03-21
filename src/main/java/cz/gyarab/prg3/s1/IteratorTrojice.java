package cz.gyarab.prg3.s1;

import java.util.Iterator;

public class IteratorTrojice<T> implements Iterator<T> {
    Trojice<T> data;
    int k;
    public IteratorTrojice(Trojice<T> data) {
        this.data = data;
        k = 0;
    }

    public boolean hasNext() {
        return k < 3;
    }

    public T next() {
        switch(k++) {
            case 0: return data.p1;
            case 1: return data.p2;
            case 2: return data.p3;
            default: return null;
        }

    }

}
