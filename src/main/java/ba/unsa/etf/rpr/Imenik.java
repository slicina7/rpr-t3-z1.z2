package ba.unsa.etf.rpr;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Imenik {
    private HashMap<String,TelefonskiBroj> imenik;

    public Imenik() {
        imenik=new HashMap<>();
    }

    public Imenik(HashMap<String, TelefonskiBroj> map) {
        this.imenik=map;
    }

    public void dodaj(String ime, TelefonskiBroj broj){
        imenik.put(ime,broj);
    }

    public String dajBroj(String ime) {
        return imenik.get(ime).ispisi();
    }

    public String dajIme(TelefonskiBroj broj) throws GreskaException{
        String i="";
        for(Map.Entry<String,TelefonskiBroj> osoba : imenik.entrySet()){
            if(broj.equals(osoba.getValue()))
                i=osoba.getKey();
        }
        if(i.equals("")) throw new GreskaException("Ne postoji");
        return i;
    }
    public String naSlovo(char s){
        String o="";
        int i=1;
        for(Map.Entry<String,TelefonskiBroj> osoba : imenik.entrySet()){
            if(osoba.getKey().charAt(0)==s){
                o+=i+". "+osoba.getKey()+" - "+osoba.getValue().ispisi()+"\n";
                i++;
            }
        }
        return o;
    }
    public Set<String> izGrada(Grad g){
        TreeSet<String> skup=new TreeSet<>();
        for(Map.Entry<String,TelefonskiBroj> osoba : imenik.entrySet()){
            if(osoba.getValue() instanceof FiksniBroj && ((FiksniBroj) osoba.getValue()).getGrad().equals(g)) {
                skup.add(osoba.getKey());
            }
        }
        return skup;
    }
    public Set<TelefonskiBroj> izGradaBrojevi(Grad g) {
        TreeSet<TelefonskiBroj> skup=new TreeSet<>();
        for(Map.Entry<String,TelefonskiBroj> osoba : imenik.entrySet()){
            if(osoba.getValue() instanceof FiksniBroj && ((FiksniBroj) osoba.getValue()).getGrad().equals(g)){
                skup.add(osoba.getValue());
            }}
        return skup;
    }
}

