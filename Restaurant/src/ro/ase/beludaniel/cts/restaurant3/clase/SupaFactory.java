package ro.ase.beludaniel.cts.restaurant3.clase;

public class SupaFactory {
    private static SupaFactory instance;

    private SupaFactory() {
    }

    public static SupaFactory getInstance() {
        return SingletonHelper.instance;
    }

    public Supa createSupa(TipSupa tipSupa) {
        switch (tipSupa) {
            case SupaCiuperci -> {
                return new SupaCiuperci();
            }
            case SupaLegume -> {
                return new SupaLegume();
            }

            case SupaVita -> {
                return new SupaVita();
            }

            default -> {
                return null;
            }
        }
    }

    private static class SingletonHelper {
        public static final SupaFactory instance = new SupaFactory();
    }
}