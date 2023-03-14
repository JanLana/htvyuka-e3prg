package cz.gyarab.prg3.s1;

public interface MujIterator {
    boolean hasNext();  // existuje jeste nejaky dalsi prvek kde jsem jeste nebyl?
    SpojS next();        // vrat aktualni prvek a posun se na dalsi
}
