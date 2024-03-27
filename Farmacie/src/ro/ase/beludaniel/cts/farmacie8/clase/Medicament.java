package ro.ase.beludaniel.cts.farmacie8.clase;

import ro.ase.beludaniel.cts.farmacie8.interfete.Compus;

public class Medicament implements Compus {
    public static final String OPERATIA_NU_ESTE_SUPORTATA = "Operatia nu este suportata.";
    private final String denumire;

    public Medicament(String denumire) {
        this.denumire = denumire;
    }

    public String getDenumire() {
        return this.denumire;
    }

    /**
     * @param index
     * @return
     */
    @Override
    public Compus get(int index) {
        throw new UnsupportedOperationException(OPERATIA_NU_ESTE_SUPORTATA);
    }

    /**
     * @param compus
     * @throws UnsupportedOperationException
     */
    @Override
    public void adaugaCompus(Compus compus) throws UnsupportedOperationException {
        throw new UnsupportedOperationException(OPERATIA_NU_ESTE_SUPORTATA);
    }

    /**
     * @param compus
     * @throws UnsupportedOperationException
     */
    @Override
    public void stergeCompus(Compus compus) throws UnsupportedOperationException {
        throw new UnsupportedOperationException(OPERATIA_NU_ESTE_SUPORTATA);
    }

    /**
     * Prezentare medicament
     */
    @Override
    public void prezentare() {
        System.out.printf("Prezentare produs %s.\n", this.toString());
    }

    @Override
    public String toString() {
        return this.denumire;
    }
}