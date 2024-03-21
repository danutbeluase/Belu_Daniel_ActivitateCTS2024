package ro.ase.beludaniel.cts.sportiv2;

public class CreatorFundas implements CreatorJucator {

    @Override
    public Jucator creaza(String nume) {
        return new Fundas(nume);
    }
}