package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {

    @Test
    void getNaziv() {
        Artikl a = new Artikl("biciklo", 500, "3427");
        Artikl b = new Artikl("tocak", 500, "3a5");
        assertEquals("biciklo", a.getNaziv());
        assertEquals("tocak", b.getNaziv());
    }

    @Test
    void testgetKod() {
        Artikl a = new Artikl("biciklo", 500, "3427");
        Artikl b = new Artikl("tocak", 300, "3a5");
        assertEquals(500, a.getCijena());
        assertEquals(300, b.getCijena());
    }

    @Test
    void testgetCijena() {
        Artikl a = new Artikl("biciklo", 500, "3427");
        Artikl b = new Artikl("tocak", 300, "3a5");
        assertEquals("3427", a.getKod());
        assertEquals("3a5", b.getKod());
    }
}