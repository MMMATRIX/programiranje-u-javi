public class Osoba  {


    private String ime;
    private String prezime;
    private int godinaRodenja;

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

    public Osoba(int godinaRodenja, String prezime, String ime) {
        this.godinaRodenja = godinaRodenja;
        this.prezime = prezime;
        this.ime = ime;
    }
}
