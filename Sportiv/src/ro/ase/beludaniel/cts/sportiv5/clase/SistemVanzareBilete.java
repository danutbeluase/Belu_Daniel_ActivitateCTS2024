package ro.ase.beludaniel.cts.sportiv5.clase;

import ro.ase.beludaniel.cts.sportiv5.interfete.SistemBilete;

public class SistemVanzareBilete implements SistemBilete {
    @Override
    public void rezervaBilet() {
        System.out.println("Rezerva bilet folosind aplicatia existenta.");
    }

    @Override
    public void cumparaBilet() {
        System.out.println("Cumpara bilete folosind aplicatia existenta.");
    }
}