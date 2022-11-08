package ba.unsa.etf.rpr;

public class MobilniBroj extends TelefonskiBroj implements Comparable{
    private int mobilnaMreza;
    private String broj;

    public MobilniBroj(int mobilnaMreza, String broj){
        this.mobilnaMreza = mobilnaMreza;
        this.broj = broj;
    }
    @Override
    public String ispisi() {
        return "0"+mobilnaMreza+"/"+broj;
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
