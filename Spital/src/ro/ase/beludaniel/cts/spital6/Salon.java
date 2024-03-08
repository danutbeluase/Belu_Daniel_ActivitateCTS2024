package ro.ase.beludaniel.cts.spital6;

import java.util.ArrayList;
import java.util.List;

public class Salon {
    private static final int CAPACITATE = 10;
    private static Salon instanta;
    private int locuriDisponibile;
    private List<Pacient> pacienti;

    private Salon() {
        this.locuriDisponibile = CAPACITATE;
        this.pacienti = new ArrayList<>();
    }

    public static synchronized Salon getInstanta() {
        if (instanta == null) {
            instanta = new Salon();
        }

        return instanta;
    }

    public synchronized boolean rezervaLoc(Pacient pacient) throws Exception {
        if (this.locuriDisponibile > 0) {
            this.locuriDisponibile--;
            this.pacienti.add(pacient);
            return true;
        } else {
            throw new Exception("Toate locurile sunt ocupate");
        }
    }
}