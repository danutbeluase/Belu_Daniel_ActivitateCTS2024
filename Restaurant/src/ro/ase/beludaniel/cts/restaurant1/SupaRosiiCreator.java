package ro.ase.beludaniel.cts.restaurant1;

public class SupaRosiiCreator extends SupaCreator {
    @Override
    public Supa prepara() {
        return new SupaRosii();
    }
}
