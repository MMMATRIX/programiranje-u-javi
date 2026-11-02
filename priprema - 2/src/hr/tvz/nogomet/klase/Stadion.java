package hr.tvz.nogomet.klase;

public class Stadion {
    private String naziv;
    private String grad;
    private Integer kapacitet;
    private Integer godinaIzgradnje;
    private Boolean natkriven;

    public Stadion(String naziv, String grad) {
        this.naziv = naziv;
        this.grad = grad;
    }

    public Stadion(String naziv, String grad, Integer kapacitet, Integer godinaIzgradnje, Boolean natkriven) {
        this.naziv = naziv;
        this.grad = grad;
        this.kapacitet = kapacitet;
        this.godinaIzgradnje = godinaIzgradnje;
        this.natkriven = natkriven;
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
}
