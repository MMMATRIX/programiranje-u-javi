public class Igrac extends Osoba{

    static int playerCount;
    public static final String POZICIJA_BRANIC = "BRANIC";
    public static final String POZICIJA_VEZNI = "VEZNJAK";
    public static final String POZICIJA_NAPAD = "NAPAD";
    public static final String POZICIJA_VRATA = "VRATAR";

    private int brojDresa;
    private String pozicija;

    public Igrac(String ime, String prezime, int godinaRodenja, int brojDresa, String pozicija) {
        super(godinaRodenja, prezime, ime);
        this.brojDresa = brojDresa;
        this.pozicija = pozicija.toUpperCase();
    }

    public int getBrojDresa() {
        return brojDresa;
    }

    public void setBrojDresa(int brojDresa) {
        this.brojDresa = brojDresa;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }
}
