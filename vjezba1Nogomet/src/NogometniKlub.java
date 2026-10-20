public class NogometniKlub {

    public static int instanceCount;

    private String naziv;
    private String grad;
    private int godinaOsnivanja;
    private Stadion stadion;
    private Trener trener;
    private Igrac[] igraci;

    public NogometniKlub(String naziv, String grad, int godinaOsnivanja, Stadion stadion, Trener trener, Igrac[] igraci) {
        this.naziv = naziv;
        this.grad = grad;
        this.godinaOsnivanja = godinaOsnivanja;
        this.stadion = stadion;
        this.trener = trener;
        this.igraci = igraci;
        instanceCount++;
    }

    public NogometniKlub() {
        instanceCount++;
    }

    public void dataInput(String naziv, String grad, int godinaOsnivanja, Stadion stadion, Trener trener, Igrac[] igraci)
    {
        this.naziv = naziv;
        this.grad = grad;
        this.godinaOsnivanja = godinaOsnivanja;
        this.stadion = stadion;
        this.trener = trener;
        this.igraci = igraci;
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

    public Stadion getStadion() {
        return stadion;
    }

    public void setStadion(Stadion stadion) {
        this.stadion = stadion;
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

    public void addPlayer(Igrac player,int itterator,int max){
        if(igraci == null) igraci = new Igrac[max];
        igraci[itterator] = player;
    }

    public String getOpis() {
        String s = "===== " + naziv + " =====" + "\nGrad: " + grad + "\nGodina osnivanja: " + godinaOsnivanja + "\nTrener: " + trener.getIme() + " " + trener.getPrezime() + "\nStadion: " + stadion.getNaziv();
        return s;
    }
}

