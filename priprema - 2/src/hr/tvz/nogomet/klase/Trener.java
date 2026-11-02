package hr.tvz.nogomet.klase;

import hr.tvz.nogomet.apstraktne.Osoba;

public class Trener extends Osoba {
    private int godineIskustva;

    public Trener(String ime, String prezime, int godinaRodenja, int godineIskustva) {
        super(ime, prezime, godinaRodenja);
        this.godineIskustva = godineIskustva;
    }

    public int getGodineIskustva() {
        return godineIskustva;
    }

    public void setGodineIskustva(int godineIskustva) {
        this.godineIskustva = godineIskustva;
    }
}
