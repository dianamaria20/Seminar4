package singleton.registry.nerecomandat;

import java.util.HashMap;

public class Registru {
    private static HashMap<String, Firma> firme = new HashMap<>();
    public static Firma getFirma(String nume) {
        if(!firme.containsKey(nume)) {
            firme.put(nume, new Firma(nume, 0));
        }
        return firme.get(nume);
    }
}
