package ro.ase.beludaniel.cts.restaurant1;

public class SuparCiuperciCreator extends SupaCreator {
    @Override
    public Supa prepara() {
        return new SupaCiuperci();
    }
}
