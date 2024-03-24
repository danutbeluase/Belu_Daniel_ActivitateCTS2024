package ro.ase.beludaniel.cts.banca5.clase;

public class SoftwareExistent implements SoftwareLeasing {
    private final int valoare;

    public SoftwareExistent(int valoare) {
        this.valoare = valoare;
    }

    @Override
    public int getValoare() {
        return this.valoare;
    }

    @Override
    public void acorda() {
        System.out.println("Acorda credite folosind vechiul software.");
    }
}