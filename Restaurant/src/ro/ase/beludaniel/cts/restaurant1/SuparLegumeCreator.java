package ro.ase.beludaniel.cts.restaurant1;

public class SuparLegumeCreator extends SupaCreator {
    @Override
    public Supa prepara() {
        return new SupaLegume();
    }
}
