package ro.ase.beludaniel.cts.spital6;

public class Pacient {
    private final String nume;
    private final int varsta;
    private final int stareSanatate;

    public Pacient(String nume, int varsta, int stareSanatate) {
        this.nume = nume;
        this.varsta = varsta;
        this.stareSanatate = stareSanatate;
    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public int getStareSanatate() {
        return stareSanatate;
    }

    @Override
    public String toString() {
        return String.format("%s in varsta de %d ani", this.getNume(), this.getVarsta());
    }
}