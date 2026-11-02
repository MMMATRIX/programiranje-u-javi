package hr.tvz.nogomet.sucelja;

public interface KapacitetObjekta extends Opisivo {
    String getKapacitetZaIspis();

    @Override
    default String getOpis() {
        return getKapacitetZaIspis();
    }
}
