package ro.ase.beludaniel.cts.spital7.program;

import ro.ase.beludaniel.cts.spital7.clase.RezultatLaborator;
import ro.ase.beludaniel.cts.spital7.decorator.DecoratorRezultat;
import ro.ase.beludaniel.cts.spital7.decorator.DecoratorRezultatLaborator;

public class Program {
    public static void main(String[] args) {
        RezultatLaborator rezultat = new RezultatLaborator();
        rezultat.printeaza();

        DecoratorRezultat decoratorRezultat = new DecoratorRezultatLaborator(rezultat);
        decoratorRezultat.printeaza();
        decoratorRezultat.trimiteRezultat("danutbelu@gmail.com");
    }
}