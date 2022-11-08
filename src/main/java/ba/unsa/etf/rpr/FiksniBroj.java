package ba.unsa.etf.rpr;

public class FiksniBroj extends TelefonskiBroj implements Comparable{
    private Grad grad;
    private String broj;

    public FiksniBroj(Grad grad, String broj) {
        this.grad = grad;
        this.broj = broj;
    }

    public Grad getGrad() {
        return grad;
    }

    public String getBroj() {
        return broj;
    }

    @Override
    public String ispisi() {
        return grad.toString() +"/"+broj;
    }

    @Override
    public int hashCode() {
        return 0;
    }
    @Override
    public int compareTo(Object o) {
        FiksniBroj t=(FiksniBroj) o;
        return this.ispisi().compareTo(t.ispisi());
    }
}
