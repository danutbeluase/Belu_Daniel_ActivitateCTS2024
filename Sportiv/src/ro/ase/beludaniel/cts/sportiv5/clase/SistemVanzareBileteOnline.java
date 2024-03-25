package ro.ase.beludaniel.cts.sportiv5.clase;

import ro.ase.beludaniel.cts.sportiv5.interfete.SistemBileteOnline;

public class SistemVanzareBileteOnline implements SistemBileteOnline {

    @Override
    public void rezervaBiletOnline() {
        System.out.println("Rezerva bilet online folosind eBilet.ro.");
    }

    @Override
    public void cumparaBileteOnline() {
        System.out.println("Cumpara bilet online folosind eBilet.ro.");
    }
}