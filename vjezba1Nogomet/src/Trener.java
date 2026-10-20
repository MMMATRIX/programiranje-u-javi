public class Trener extends Osoba{
    private int godineIskustva;

    public int getGodineIskustva() {
        return godineIskustva;
    }

    public void setGodineIskustva(int godineIskustva) {
        this.godineIskustva = godineIskustva;
    }

    public Trener(String prezime, String ime, int godinaRodenja, int godineIskustva) {
        super(godinaRodenja, prezime, ime);
        this.godineIskustva = godineIskustva;
    }
}
