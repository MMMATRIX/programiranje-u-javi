package hr.tvz.nogomet.apstraktne;

public abstract class Osoba {
    private String ime;
    private String prezime;
    private int godinaRodenja;

    public Osoba() {
    }

    public Osoba(String ime, String prezime, int godinaRodenja) {
        this.ime = ime;
        this.prezime = prezime;
        this.godinaRodenja = godinaRodenja;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getGodinaRodenja() {
        return godinaRodenja;
    }

    public void setGodinaRodenja(int godinaRodenja) {
        this.godinaRodenja = godinaRodenja;
    }
}
