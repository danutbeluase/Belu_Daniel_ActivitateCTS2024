package ro.ase.beludaniel.cts.spital4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reteta {
    private static Reteta instance;

    private List<Integer> cantitati;

    private Reteta() {
        cantitati = new ArrayList<>();
    }

    public static Reteta getInstance() {
        if (instance == null) {
            instance = new Reteta();
        }

        return instance;
    }

    public void adaugaSolutii(Integer[] cantitati) {
        this.cantitati.addAll(Arrays.asList(cantitati));
    }

    public List<Integer> getSolutii() {
        return this.cantitati;
    }
}