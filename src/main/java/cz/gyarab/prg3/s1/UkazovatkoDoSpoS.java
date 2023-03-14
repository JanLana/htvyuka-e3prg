package cz.gyarab.prg3.s1;

public class UkazovatkoDoSpoS implements MujIterator {
    SpojS aktualniPrvek;

    public UkazovatkoDoSpoS(SpojS aktualniPrvek) {
        this.aktualniPrvek = aktualniPrvek;
    }

    @Override
    public boolean hasNext() {
        /*
        if (aktualniPrvek.dalsi == null)
            return false;
        else
            return true;
        */
        return aktualniPrvek != null;
    }

    @Override
    public SpojS next() {
        SpojS dalsi = aktualniPrvek;
        aktualniPrvek = aktualniPrvek.dalsi;
        return dalsi;

    }
}
