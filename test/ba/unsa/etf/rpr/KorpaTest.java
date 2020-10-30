package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void dodajArtikl() {
        Artikl a = new Artikl("Biciklo", 100, "2a3");
        Korpa k = new Korpa();
        k.dodajArtikl(a);
        assertEquals(1, k.getBroj_korpa());
    }

    @Test
    void izbaciArtiklSaKodom() {
        Korpa k = new Korpa();
        k.dodajArtikl(new Artikl("Biciklo", 1000, "1"));
        k.dodajArtikl(new Artikl("Biciklo", 1000, "2"));
        k.dodajArtikl(new Artikl("Biciklo", 1000, "3"));
        k.dodajArtikl(new Artikl("Biciklo", 1000, "4"));
        k.dodajArtikl(new Artikl("Biciklo", 1000, "5"));
        k.dodajArtikl(new Artikl("Biciklo", 1000, "6"));
        k.izbaciArtiklSaKodom("1");
        k.izbaciArtiklSaKodom("6");
        Artikl izbaceni = k.izbaciArtiklSaKodom("3");
        Artikl pomoc = new Artikl("Biciklo", 1000, "3");
        assertEquals(pomoc.getCijena(), izbaceni.getCijena());
        assertEquals(pomoc.getKod(), izbaceni.getKod());
        assertEquals(pomoc.getNaziv(), izbaceni.getNaziv());
        assertEquals(3, k.getBroj_korpa());
    }

    @Test
    void dajUkupnuCijenuArtikala() {
        Korpa k = new Korpa();
        k.dodajArtikl(new Artikl("Biciklo", 1000, "1"));
        k.dodajArtikl(new Artikl("Biciklo", 1000, "2"));
        k.dodajArtikl(new Artikl("Biciklo", 1000, "3"));
        k.dodajArtikl(new Artikl("Biciklo", 1000, "4"));
        k.dodajArtikl(new Artikl("Biciklo", 1000, "5"));
        k.dodajArtikl(new Artikl("Biciklo", 1000, "6"));
        k.izbaciArtiklSaKodom("1");
        k.izbaciArtiklSaKodom("3");
        assertEquals(4000, k.dajUkupnuCijenuArtikala());
    }
}