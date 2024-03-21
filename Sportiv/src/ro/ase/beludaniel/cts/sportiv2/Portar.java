package ro.ase.beludaniel.cts.sportiv2;

public class Portar extends Jucator {
    public Portar(String nume) {
        super(nume);
    }

    @Override
    public void joaca() {
        System.out.printf("%s joaca pe postul de portar.\n", this.nume);
    }
}