package ro.ase.beludaniel.cts.sportiv6.clase;

public class AplicatieFederatie  {
    private static AplicatieFederatie instance = new AplicatieFederatie();

    private AplicatieFederatie() {
    }

    public static AplicatieFederatie getInstance() {
        return instance;
    }

    public void verificaAntecedentePersoana(String nume) {
        System.out.printf("Verificare antecedente %s.\n", nume);
    }
}