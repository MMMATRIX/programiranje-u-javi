package hr.tvz.nogomet.klase;

import hr.tvz.nogomet.apstraktne.Gradjevina;
import hr.tvz.nogomet.zapisi.Adresa;

public class Stadion extends Gradjevina {

    private Integer kapacitet;
    private Integer godinaIzgradnje;
    private Boolean natkriven;

    public Stadion(String naziv, Adresa adresa, Integer kapacitet, Integer godinaIzgradnje, Boolean natkriven) {
        super(naziv, adresa);
        this.kapacitet = kapacitet;
        this.godinaIzgradnje = godinaIzgradnje;
        this.natkriven = natkriven;
    }

    public Integer getKapacitet() {
        return kapacitet;
    }

    public void setKapacitet(Integer kapacitet) {
        this.kapacitet = kapacitet;
    }

    public Integer getGodinaIzgradnje() {
        return godinaIzgradnje;
    }

    public void setGodinaIzgradnje(Integer godinaIzgradnje) {
        this.godinaIzgradnje = godinaIzgradnje;
    }

    public Boolean getNatkriven() {
        return natkriven;
    }

    public void setNatkriven(Boolean natkriven) {
        this.natkriven = natkriven;
    }

    @Override
    public String getKapacitetZaIspis() {
        if (kapacitet == null ){
            return 	"Kapacitet: nije unesen";
        }
        return 	"Kapacitet: " + kapacitet + " gledatelja";
    }
}
