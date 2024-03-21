package ro.ase.beludaniel.cts.sportiv2;

public class Mijlocas extends Jucator {
    public Mijlocas(String nume) {
        super(nume);
    }

    @Override
    public void joaca() {
        System.out.printf("%s joaca pe postul de mijlocas.\n", this.nume);
    }
}