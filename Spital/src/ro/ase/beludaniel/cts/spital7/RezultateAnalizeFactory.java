package ro.ase.beludaniel.cts.spital7;

public class RezultateAnalizeFactory {
    private static RezultateAnalizeFactory instanta;

    private RezultateAnalizeFactory() {
    }

    public static synchronized RezultateAnalizeFactory getInstanta() {
        if (instanta == null) {
            instanta = new RezultateAnalizeFactory();
        }

        return instanta;
    }

    public RezultatAnalize furnizeazaRezultat(TipRezultate tipRezultate) throws Exception {
        switch (tipRezultate) {
            case Digital -> {
                return new RezultatDigital();
            }
            case Tiparit -> {
                return new RezultatTiparit();
            }
            default -> throw new Exception("Acest tip nu este suportat.");
        }
    }
}
