package hr.tvz.nogomet.klase;

import hr.tvz.nogomet.apstraktne.Gradjevina;
import hr.tvz.nogomet.sucelja.Opisivo;
import hr.tvz.nogomet.zapisi.Adresa;

public class NogometniKlub implements Opisivo {
    private String naziv;
    private String grad;
    private int godinaOsnivanja;
    private Trener trener;
    private Igrac[] igraci;

    private Gradjevina[] gradjevine;

    public NogometniKlub() {
    }

    public NogometniKlub(String naziv, String grad, int godinaOsnivanja, Trener trener, Igrac[] igraci, Gradjevina[] gradjevine) {
        this.naziv = naziv;
        this.grad = grad;
        this.godinaOsnivanja = godinaOsnivanja;
        this.trener = trener;
        this.igraci = igraci;
        this.gradjevine = gradjevine;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public int getGodinaOsnivanja() {
        return godinaOsnivanja;
    }

    public void setGodinaOsnivanja(int godinaOsnivanja) {
        this.godinaOsnivanja = godinaOsnivanja;
    }

    public Trener getTrener() {
        return trener;
    }

    public void setTrener(Trener trener) {
        this.trener = trener;
    }

    public Igrac[] getIgraci() {
        return igraci;
    }

    public void setIgraci(Igrac[] igraci) {
        this.igraci = igraci;
    }

    public Gradjevina[] getGradjevine() {
        return gradjevine;
    }

    public void setGradjevine(Gradjevina[] gradjevine) {
        this.gradjevine = gradjevine;
    }

    @Override
    public String getOpis() {
        String imeTrenera = trener == null ? "-" : trener.getIme() + " " + trener.getPrezime();
        String nazivGradjevina = "";
        int f=1;
        for(Gradjevina g : gradjevine){
            if(g instanceof Stadion){
                nazivGradjevina += "\n" + f + ". Stadion: " + g.getNaziv() + "\n";
                Adresa adresa = g.getAdresa();
                nazivGradjevina += "Adresa: " + adresa.grad() + ", " + adresa.ulica() + " " + adresa.kucniBroj() + "\n";
                nazivGradjevina += g.getKapacitetZaIspis() + "\n";
                nazivGradjevina += "Godina izgradnje: " + ((Stadion) g).getGodinaIzgradnje() + "\n";
                nazivGradjevina += "Natkriven: " + ((Stadion) g).getNatkriven();
            }else
            if(g instanceof SportskiDom){
                nazivGradjevina += "\n" + f + ". Sportski dom: " + g.getNaziv() + "\n";
                Adresa adresa = g.getAdresa();
                nazivGradjevina += "Adresa: " + adresa.grad() + ", " + adresa.ulica() + " " + adresa.kucniBroj() + "\n";
                nazivGradjevina += g.getKapacitetZaIspis() + "\n";
                nazivGradjevina += "Ima blagavaonicu: " + ((SportskiDom) g).isImaBlagovaonicu();
            }else
            if(g instanceof MedicinskaOrdinacija){
                nazivGradjevina += "\n" + f + ". Medicinska ordinacija: " + g.getNaziv() + "\n";
                Adresa adresa = g.getAdresa();
                nazivGradjevina += "Adresa: " + adresa.grad() + ", " + adresa.ulica() + " " + adresa.kucniBroj() + "\n";
                nazivGradjevina += g.getKapacitetZaIspis() + "\n";
                nazivGradjevina += "Ima hitnu službu: " + ((MedicinskaOrdinacija) g).isImaHitnuSluzbu();
            }
            f++;
        }

        String igraciIspis="";
        for(int i = 0; i<igraci.length; i++){
            igraciIspis += "\n" + (i+1) + ". " + igraci[i].getIme() +" " + igraci[i].getPrezime() + ", " + igraci[i].getGodinaRodenja() + "., dres " + igraci[i].getBrojDresa() + ", " + igraci[i].getPozicija().toString() + "\n";
        }
        int brojKreveta = getUkupanBrojKreveta();

        return "===== " + naziv.toUpperCase() + " =====\n"
                + "Grad: " + grad + "\n"
                + "Godina osnivanja: " + godinaOsnivanja + "\n"
                + "Trener: " + imeTrenera + "\n"
                + igraciIspis
                + nazivGradjevina + "\n"
                +"Ukupan broj kreveta: " + brojKreveta + "\n";
    }

    public int getUkupanBrojKreveta(){
        int num=0;
        for(Gradjevina g : gradjevine){
            if(g instanceof SportskiDom sd){
                num+=sd.getBrojKreveta();
            }
        }

        return num;
    }

}
