package ro.ase.beludaniel.cts.stb4.clase;

import ro.ase.beludaniel.cts.stb4.interfete.SistemPlataStb;

public class SistemStb implements SistemPlataStb {
    @Override
    public void achizitioneaza(TipBiletStb tipBilet) {
        System.out.printf("Achizitioneaza bilet %s.\n", tipBilet.name());
    }
}