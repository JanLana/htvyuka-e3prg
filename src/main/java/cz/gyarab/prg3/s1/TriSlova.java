package cz.gyarab.prg3.s1;

import lombok.ToString;

import java.util.Iterator;

@ToString
public class TriSlova implements Iterable<String> {
    String slovoA;
    String slovoB;
    String slovoC;

    public TriSlova(String slovoA, String slovoB, String slovoC) {
        this.slovoA = slovoA;
        this.slovoB = slovoB;
        this.slovoC = slovoC;
    }

    @Override
    public Iterator<String> iterator() {
        return new TriSlovaIterator();
    }


    class TriSlovaIterator implements Iterator<String> {
        int pocitadlo;

        public TriSlovaIterator() {
            this.pocitadlo = 0;
        }

        @Override
        public boolean hasNext() {
            return pocitadlo < 3;
        }

        @Override
        public String next() {
            switch(pocitadlo++) {
                case 0: return slovoA; //break;
                case 1: return slovoB;
                case 2: return slovoC;
                default: return null;
            }
        }
    }

    public static void main(String[] args) {
        TriSlova tri = new TriSlova("ahoj", "nazdar", "dobry den");
        System.out.println(tri);

        Iterator<String> i = tri.iterator();
        while (i.hasNext()) {
            String s = i.next();
            System.out.println(s);
        }

        for(String s: tri) {
            for(String s2: tri) {
                System.out.println(s + " - " + s2);
            }
        }
    }


}
