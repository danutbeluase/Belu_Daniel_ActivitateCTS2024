package ro.ase.beludaniel.cts.sportiv2;

public abstract class Jucator {
    protected final String nume;

    public Jucator(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Jucator{" +
                "nume='" + nume + '\'' +
                '}';
    }

    public abstract void joaca();
}