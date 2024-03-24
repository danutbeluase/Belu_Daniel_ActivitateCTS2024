package ro.ase.beludaniel.cts.stb4.clase;

public class SistemBileteMetrou implements SistemBilete {
    @Override
    public void valideaza(TipBilet tipBilet) {
        System.out.printf("Validare bilet metrou %s.\n", tipBilet.name());
    }
}