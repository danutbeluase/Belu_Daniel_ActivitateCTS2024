package ro.ase.beludaniel.cts.sportiv5.program;

import ro.ase.beludaniel.cts.sportiv5.adaptor.SistemVanzareBileteMixt;
import ro.ase.beludaniel.cts.sportiv5.clase.SistemVanzareBilete;
import ro.ase.beludaniel.cts.sportiv5.clase.SistemVanzareBileteOnline;
import ro.ase.beludaniel.cts.sportiv5.interfete.SistemBilete;
import ro.ase.beludaniel.cts.sportiv5.interfete.SistemBileteOnline;

public class Program {
    public static void main(String[] args) {
        SistemBilete sistemBilete = new SistemVanzareBilete();
        sistemBilete.rezervaBilet();
        sistemBilete.cumparaBilet();

        SistemBileteOnline sistemBileteOnline = new SistemVanzareBileteOnline();
        sistemBileteOnline.rezervaBiletOnline();
        sistemBileteOnline.cumparaBileteOnline();

        SistemVanzareBileteMixt sistemVanzareBileteMixt = new SistemVanzareBileteMixt(sistemBileteOnline);
        sistemVanzareBileteMixt.cumparaBilet();
        sistemVanzareBileteMixt.rezervaBilet();
        sistemVanzareBileteMixt.rezervaBiletOnline();
        sistemVanzareBileteMixt.rezervaBiletOnline();
    }
}