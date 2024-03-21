package ro.ase.beludaniel.cts.sportiv2;

public class Atacant extends Jucator {
    public Atacant(String nume) {
        super(nume);
    }

    @Override
    public void joaca() {
        System.out.printf("%s joaca pe postul de atacant.\n", this.nume);
    }
}