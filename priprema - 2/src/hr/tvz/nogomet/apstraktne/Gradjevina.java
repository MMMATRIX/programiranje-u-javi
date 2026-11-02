package hr.tvz.nogomet.apstraktne;

import hr.tvz.nogomet.sucelja.KapacitetObjekta;
import hr.tvz.nogomet.zapisi.Adresa;

public abstract class Gradjevina implements KapacitetObjekta {

    private String naziv="";
    private Adresa adresa;

    protected Gradjevina(String naziv, Adresa adresa) {
        this.naziv = naziv;
        this.adresa = adresa;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Adresa getAdresa() {
        return adresa;
    }

    public void setAdresa(Adresa adresa) {
        this.adresa = adresa;
    }


}
