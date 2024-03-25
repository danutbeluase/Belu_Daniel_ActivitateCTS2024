package ro.ase.beludaniel.cts.sportiv6.clase;

public class AplicatieStadion {
    private static AplicatieStadion instance = new AplicatieStadion();

    private final AplicatiePolitie aplicatiePolitie;
    private final AplicatieFederatie aplicatieFederatie;

    private AplicatieStadion() {
        this.aplicatiePolitie = AplicatiePolitie.getInstance();
        this.aplicatieFederatie = AplicatieFederatie.getInstance();
    }

    public static AplicatieStadion getInstance() {
        return instance;
    }

    private void verificareBilet(String cod) {
        System.out.printf("Verificare bilet %s.\n", cod);
    }


    public void verificaEligibilitate(String codBilet, String nume) {
        this.verificareBilet(codBilet);

        System.out.println("Verificare in baza de date a Politiei.");
        this.aplicatiePolitie.verificaCazierPersoana(nume);

        System.out.println("Verificare in baza de date a Federatiei.");
        this.aplicatieFederatie.verificaAntecedentePersoana(nume);
    }
}