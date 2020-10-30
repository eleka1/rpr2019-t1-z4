package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] artikli_korpa = new Artikl[50];
    private int broj_korpa;


    public boolean dodajArtikl(Artikl a) {
        if(broj_korpa == 50) return false;
        for (int i=0; i<50; i++){
            if(artikli_korpa[i] == null) {
                artikli_korpa[i] = a;
                broj_korpa = broj_korpa + 1;
                break;
            }
        }
        return true;
    }

    public Artikl[] getArtikli() {
        return artikli_korpa;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl a = null;
        for (int i=0; i<50; i++){
            if(artikli_korpa[i] == null) continue; //zastita od null !obavezno
            if(kod.equals(artikli_korpa[i].getKod())) {
                a = artikli_korpa[i];
                artikli_korpa[i] = null;
                broj_korpa = broj_korpa - 1;
                break;
            }
        }
        return a;
    }

    public int dajUkupnuCijenuArtikala() {
        int suma = 0;
        for(Artikl x : artikli_korpa){
            if(x != null) suma = suma + x.getCijena();
        }
        return suma;
    }

    public int getBroj_korpa() {
        return broj_korpa;
    }
}
