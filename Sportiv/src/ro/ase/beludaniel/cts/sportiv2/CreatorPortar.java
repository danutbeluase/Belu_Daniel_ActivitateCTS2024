package ro.ase.beludaniel.cts.sportiv2;

public class CreatorPortar implements CreatorJucator {
    @Override
    public Jucator creaza(String nume) {
        return new Portar(nume);
    }
}