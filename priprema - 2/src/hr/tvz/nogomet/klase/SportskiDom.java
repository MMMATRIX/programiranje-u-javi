package hr.tvz.nogomet.klase;

import hr.tvz.nogomet.apstraktne.Gradjevina;
import hr.tvz.nogomet.sucelja.KapacitetObjekta;
import hr.tvz.nogomet.zapisi.Adresa;

public class SportskiDom extends Gradjevina implements KapacitetObjekta {

    private int brojKreveta = 0;
    private boolean imaBlagovaonicu;

    public SportskiDom(String naziv, Adresa adresa, int brojKreveta, boolean imaBlagovaonicu) {
        super(naziv, adresa);
        this.brojKreveta = brojKreveta;
        this.imaBlagovaonicu = imaBlagovaonicu;
    }

    public int getBrojKreveta() {
        return brojKreveta;
    }

    public void setBrojKreveta(int brojKreveta) {
        this.brojKreveta = brojKreveta;
    }

    public boolean isImaBlagovaonicu() {
        return imaBlagovaonicu;
    }

    public void setImaBlagovaonicu(boolean imaBlagovaonicu) {
        this.imaBlagovaonicu = imaBlagovaonicu;
    }

    @Override
    public String getKapacitetZaIspis() {

        return "Broj kreveta: " + brojKreveta;
    }
}
