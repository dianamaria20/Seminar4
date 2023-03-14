package singleton.registry.nerecomandat;

public class Firma {
    private String nume;
    private int nrAngajati;

    public Firma(String nume, int nrAngajati) {
        this.nume = nume;
        this.nrAngajati = nrAngajati;
    }

    @Override
    public String toString() {
        return "Firma{" +
                "nume='" + nume + '\'' +
                ", nrAngajati=" + nrAngajati +
                '}';
    }
}
