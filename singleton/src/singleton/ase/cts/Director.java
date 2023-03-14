package singleton.ase.cts;

public class Director {
    private String nume;
    private int varsta;

    private static Director instanta = null;

    private Director(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }
    //versiunea lazy initialization
    // punem syncronized sa nu mearga pe 2 thread uri acelasi if
    // asteapta sa termine primul sa returneze si dupa intervine al doilea thread
    //thread safe initialization (asa se numeste metoda)
    public synchronized static Director getInstance(String nume) {
        if(instanta==null) {

            instanta = new Director(nume, 30);
        }
        return instanta;
    }

    @Override
    public String toString() {
        return "Director{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                '}';
    }
}
