package ro.ase.beludaniel.cts.restaurant1;

public class Client {
    private final SupaCreator supaCreator;

    public Client(SupaCreator supaCreator) {
        this.supaCreator = supaCreator;
    }

    public Supa prepara() {
        return this.supaCreator.prepara();
    }
}
