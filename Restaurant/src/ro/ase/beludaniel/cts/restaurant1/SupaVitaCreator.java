package ro.ase.beludaniel.cts.restaurant1;

public class SupaVitaCreator extends SupaCreator {
    @Override
    public Supa prepara() {
        return new SupaVita();
    }
}
