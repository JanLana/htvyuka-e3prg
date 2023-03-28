package cz.gyarab.prg3.s2;

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
            case 0: return data.a;
            case 1: return data.b;
            case 2: return data.c;
            default: return null;
        }
    }
}
