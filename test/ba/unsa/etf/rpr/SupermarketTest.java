package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void dodajArtikl() {
        Supermarket sm = new Supermarket();
        Artikl a = new Artikl("Biciklo", 100, "2a3");
        Artikl b = new Artikl("Biciklo", 100, "21a3");
        Artikl c = new Artikl("Biciklo", 100, "23a3");
        sm.dodajArtikl(a);
        sm.dodajArtikl(b);
        sm.dodajArtikl(c);
        assertEquals(3, sm.getBroj_sm());
    }

    @Test
    void izbaciArtiklSaKodom() {
        Supermarket supermarket = new Supermarket();
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "1"));
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "2"));
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "3"));
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "4"));
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "5"));
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "6"));
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "7"));
        supermarket.izbaciArtiklSaKodom("1");
        supermarket.izbaciArtiklSaKodom("6");
        Artikl izbaceni = supermarket.izbaciArtiklSaKodom("3");
        Artikl pomoc = new Artikl("Biciklo", 1000, "3");
        assertEquals(pomoc.getCijena(), izbaceni.getCijena());
        assertEquals(pomoc.getKod(), izbaceni.getKod());
        assertEquals(pomoc.getNaziv(), izbaceni.getNaziv());
        assertEquals(4, supermarket.getBroj_sm());
    }
}