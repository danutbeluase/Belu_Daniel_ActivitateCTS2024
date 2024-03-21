package ro.ase.beludaniel.cts.sportiv2;

public class CreatorMijlocas implements CreatorJucator {
    @Override
    public Jucator creaza(String nume) {
        return new Mijlocas (nume);
    }
}