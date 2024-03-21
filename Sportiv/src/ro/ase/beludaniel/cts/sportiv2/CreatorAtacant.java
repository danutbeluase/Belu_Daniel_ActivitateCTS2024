package ro.ase.beludaniel.cts.sportiv2;

public class CreatorAtacant implements CreatorJucator {
    @Override
    public Jucator creaza(String nume) {
        return new Atacant(nume);
    }
}