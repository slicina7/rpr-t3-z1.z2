package ba.unsa.etf.rpr;

public class MedunarodniBroj extends TelefonskiBroj implements Comparable{
    private String drzava, broj;
    public MedunarodniBroj(String drzava, String broj) {
        this.drzava = drzava;
        this.broj = broj;
    }

    @Override
    public String ispisi() {
        return drzava+"/"+broj;
    }

    @Override
    public int hashCode() {
        return 0;
    }
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
