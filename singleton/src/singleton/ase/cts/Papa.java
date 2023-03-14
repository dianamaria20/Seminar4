package singleton.ase.cts;

public class Papa {
    private String nume;
    private int nrAniFunctie;
    private int alCatelea;

    private static Papa papa = new Papa("Benedict", 2, 276); // se apeleaza doar 1 data constructorul

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNrAniFunctie() {
        return nrAniFunctie;
    }

    public void setNrAniFunctie(int nrAniFunctie) {
        this.nrAniFunctie = nrAniFunctie;
    }

    public int getAlCatelea() {
        return alCatelea;
    }

    public void setAlCatelea(int alCatelea) {
        this.alCatelea = alCatelea;
    }
//facem constructorul privat sa nu ne creeze nimeni obiecte, vrem doar unul
    // e accesat doar din interiorul clasei
    private Papa(String nume, int nrAniFunctie, int alCatelea) {
        this.nume = nume;
        this.nrAniFunctie = nrAniFunctie;
        this.alCatelea = alCatelea;
    }

    public static Papa getInstance() {

        return papa; //eagel initialization
    }
}
