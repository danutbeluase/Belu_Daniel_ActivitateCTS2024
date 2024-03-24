package ro.ase.beludaniel.cts.stb4.clase;

public class SistemBileteStb implements  SistemBilete {
    @Override
    public void valideaza(TipBilet tipBilet) {
        System.out.printf("Validare bilet STB %s.\n", tipBilet.name());
    }
}