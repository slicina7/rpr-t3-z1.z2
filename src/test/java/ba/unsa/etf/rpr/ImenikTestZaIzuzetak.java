package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImenikTestZaIzuzetak {

    @Test
    void dajIme() {
        Imenik i=new Imenik();
        TelefonskiBroj br1=new FiksniBroj(Grad.SARAJEVO,"334");
        TelefonskiBroj br2=new FiksniBroj(Grad.ZVORNIK,"932");
        i.dodaj("",br1);
        try {
            i.dajIme(br2);
        }catch (GreskaException poruka){
            System.out.println(poruka.getMessage());
        }

    }
}