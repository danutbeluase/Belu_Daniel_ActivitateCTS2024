package ro.ase.beludaniel.cts.farmacie8.clase;

import ro.ase.beludaniel.cts.farmacie8.interfete.Compus;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements Compus {
    private final List<Compus> elemente = new ArrayList<>();
    private final String denumire;

    public String getDenumire() {
        return denumire;
    }

    public Sectiune(String denumire) {
        this.denumire = denumire;
    }

    /**
     * @param index
     * @return
     */
    @Override
    public Compus get(int index) {
        return 0 <= index && index <= this.elemente.size() ? this.elemente.get(index) : null;
    }

    /**
     * @param compus
     * @throws UnsupportedOperationException
     */
    @Override
    public void adaugaCompus(Compus compus) throws UnsupportedOperationException {
        if(compus != null) {
            this.elemente.add(compus);
        }
    }

    /**
     * @param compus
     * @throws UnsupportedOperationException
     */
    @Override
    public void stergeCompus(Compus compus) throws UnsupportedOperationException {
        if(compus != null && this.elemente.contains(compus)) {
            this.elemente.remove(compus);
        }
    }

    /**
     *
     */
    @Override
    public void prezentare() {
        System.out.printf("Prezentare %s\n", this.toString());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(this.denumire);
        sb.append("\n").append("Elemente componente.\n");
        for(Compus compus : this.elemente) {
            sb.append(compus).append("\n");
        }

        return sb.toString();
    }
}
