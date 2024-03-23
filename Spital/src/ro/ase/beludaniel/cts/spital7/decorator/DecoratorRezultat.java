package ro.ase.beludaniel.cts.spital7.decorator;

import ro.ase.beludaniel.cts.spital7.clase.Rezultat;
import ro.ase.beludaniel.cts.spital7.clase.RezultatLaborator;

public abstract class DecoratorRezultat implements Rezultat {
    private final RezultatLaborator rezultatLaboator;

    public DecoratorRezultat(RezultatLaborator rezultatLaborator) {
        this.rezultatLaboator = rezultatLaborator;
    }

    @Override
    public void printeaza() {
        this.rezultatLaboator.printeaza();
        System.out.println("Online");
    }

    public abstract void trimiteRezultat(String email);
}