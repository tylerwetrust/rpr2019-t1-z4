package ba.unsa.etf.rpr;

public class Korpa {
    private final int MAX_VALUE = 50;
    private int brojArtikala = 0;
    public Artikl[] niz = new Artikl[MAX_VALUE];
    public Korpa(){
        brojArtikala = 0;
    }
    public boolean dodajArtikl(Artikl a){
        brojArtikala++;
        if(brojArtikala < 50){
            this.niz[brojArtikala-1] = new Artikl(a);
            return true;
        }
        return false;
    }
    public Artikl izbaciArtiklSaKodom(String kod){
        Artikl a = null;
        for(int i = 0; i < brojArtikala; i++){
            if(kod.equals(niz[i].getNaziv()) == true){
                a = niz[i];
                for(int j = i; j < brojArtikala - 1; j++) niz[j] = niz[j+1];
                brojArtikala--;
                return a;
            }
        }
        return a;
    }
    public Artikl[] getArtikli(){
        return niz;
    }

    public int dajUkupnuCijenuArtikala(){
        int suma = 0;
        for(int i = 0; i < brojArtikala; i++) suma += niz[i].getCijena();
        return suma;
    }
}
