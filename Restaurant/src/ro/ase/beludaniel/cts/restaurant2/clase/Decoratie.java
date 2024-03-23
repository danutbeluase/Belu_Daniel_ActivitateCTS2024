package ro.ase.beludaniel.cts.restaurant2.clase;

public class Decoratie {
    private String nume;

    public Decoratie(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Decoratie{" +
                "nume='" + nume + '\'' +
                '}';
    }
}