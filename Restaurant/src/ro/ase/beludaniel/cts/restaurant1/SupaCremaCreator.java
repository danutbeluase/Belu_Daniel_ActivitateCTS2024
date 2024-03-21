package ro.ase.beludaniel.cts.restaurant1;

public class SupaCremaCreator extends SupaCreator {
    @Override
    public Supa prepara() {
        return new SupaCreama();
    }
}
