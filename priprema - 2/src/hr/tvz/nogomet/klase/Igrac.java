package hr.tvz.nogomet.klase;

import hr.tvz.nogomet.apstraktne.Osoba;
import hr.tvz.nogomet.enumeracije.Pozicija;

public class Igrac extends Osoba {


    private int brojDresa;
    private Pozicija pozicija;

    public Igrac(String ime, String prezime, int godinaRodenja, int brojDresa, Pozicija pozicija) {
        super(ime, prezime, godinaRodenja);
        this.brojDresa = brojDresa;
        this.pozicija = pozicija;
    }

    public int getBrojDresa() {
        return brojDresa;
    }

    public void setBrojDresa(int brojDresa) {
        this.brojDresa = brojDresa;
    }

    public Pozicija getPozicija() {
        return pozicija;
    }

    public void setPozicija(Pozicija pozicija) {
        this.pozicija = pozicija;
    }
}
