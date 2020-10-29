package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] artikli_sm = new Artikl[1000];
    private int broj_sm;


    public void dodajArtikl(Artikl novi) {
        for(int i=0; i<1000; i++){
            if(artikli_sm[i] == null){
                artikli_sm[i] = novi;
                broj_sm = broj_sm + 1;
            }
        }
    }

    public Artikl[] getArtikli() {
        return artikli_sm;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl povratni = null;
        for(int i=0; i<1000; i++){
            if(artikli_sm[i] == null) continue;
            if(kod.equals(artikli_sm[i].getKod())){
                povratni = artikli_sm[i];
                artikli_sm[i] = null;
                broj_sm = broj_sm - 1;
                break;
            }
        }
        return povratni;
    }
}
