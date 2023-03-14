package cz.gyarab.prg3.s1;

import java.util.LinkedList;
import java.util.Queue;

public class UkazovatkoDoStromu implements MujIterator {
    Queue<Strom> fronta;

    public UkazovatkoDoStromu(Strom s) {
        fronta = new LinkedList<>();
        fronta.add(s);
    }

    @Override
    public boolean hasNext() {
        return ! fronta.isEmpty();
    }

    @Override
    public Strom next() {
        return null;
    }
}
