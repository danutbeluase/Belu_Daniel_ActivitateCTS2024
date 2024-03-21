package ro.ase.beludaniel.cts.sportiv2;

public class Fundas extends Jucator {
    protected Fundas(String nume) {
        super(nume);
    }

    @Override
    public void joaca() {
        System.out.printf("%s joaca pe postul de fundas.\n", this.nume);
    }
}