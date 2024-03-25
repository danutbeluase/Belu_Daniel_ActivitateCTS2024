package ro.ase.beludaniel.cts.sportiv5.adaptor;

import ro.ase.beludaniel.cts.sportiv5.clase.SistemVanzareBilete;
import ro.ase.beludaniel.cts.sportiv5.clase.SistemVanzareBileteOnline;
import ro.ase.beludaniel.cts.sportiv5.interfete.SistemBilete;
import ro.ase.beludaniel.cts.sportiv5.interfete.SistemBileteOnline;

public class SistemVanzareBileteMixt extends SistemVanzareBileteOnline implements SistemBilete {
    private final SistemBileteOnline sistemBileteOnline;
    private final SistemBilete sistemBilete;

    public SistemVanzareBileteMixt(SistemBileteOnline sistemBileteOnline) {
        this.sistemBileteOnline = sistemBileteOnline;
        this.sistemBilete = new SistemVanzareBilete();
    }

    @Override
    public void rezervaBilet() {
        this.sistemBilete.rezervaBilet();
    }

    @Override
    public void cumparaBilet() {
        this.sistemBilete.cumparaBilet();
    }

    @Override
    public void rezervaBiletOnline() {
        System.out.println("Se folosete sistemul adaptat.");
        this.sistemBileteOnline.rezervaBiletOnline();
    }

    @Override
    public void cumparaBileteOnline() {
        System.out.println("Se folosete sistemul adaptat.");
        this.sistemBileteOnline.cumparaBileteOnline();
    }
}