package hr.tvz.nogomet.klase;

import hr.tvz.nogomet.apstraktne.Gradjevina;
import hr.tvz.nogomet.sucelja.KapacitetObjekta;
import hr.tvz.nogomet.zapisi.Adresa;

public class MedicinskaOrdinacija extends Gradjevina implements KapacitetObjekta {

    private int brojAmbulanti;
    private boolean imaHitnuSluzbu;

    public MedicinskaOrdinacija(String naziv, Adresa adresa, int brojAmbulanti, boolean imaHitnuSluzbu) {
        super(naziv, adresa);
        this.brojAmbulanti = brojAmbulanti;
        this.imaHitnuSluzbu = imaHitnuSluzbu;
    }

    public int getBrojAmbulanti() {
        return brojAmbulanti;
    }

    public void setBrojAmbulanti(int brojAmbulanti) {
        this.brojAmbulanti = brojAmbulanti;
    }

    public boolean isImaHitnuSluzbu() {
        return imaHitnuSluzbu;
    }

    public void setImaHitnuSluzbu(boolean imaHitnuSluzbu) {
        this.imaHitnuSluzbu = imaHitnuSluzbu;
    }

    @Override
    public String getKapacitetZaIspis() {

        return "Broj ambulanti: "+brojAmbulanti;
    }
}
