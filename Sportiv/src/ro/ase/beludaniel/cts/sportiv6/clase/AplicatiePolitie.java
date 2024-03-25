package ro.ase.beludaniel.cts.sportiv6.clase;

public class AplicatiePolitie {
    private static AplicatiePolitie instance = new AplicatiePolitie();

    private AplicatiePolitie() {
    }

    public static AplicatiePolitie getInstance() {
        return instance;
    }

    public void verificaCazierPersoana(String nume) {
        System.out.printf("Verificare cazier %s.\n", nume);
    }
}