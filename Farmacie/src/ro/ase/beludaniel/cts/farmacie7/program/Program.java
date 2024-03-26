package ro.ase.beludaniel.cts.farmacie7.program;

import ro.ase.beludaniel.cts.farmacie7.clase.BonCasa;
import ro.ase.beludaniel.cts.farmacie7.interfete.DecoratorBon;
import ro.ase.beludaniel.cts.farmacie7.interfete.PrototipBon;

public class Program {
    public static void main(String[] args) {
        PrototipBon bonCasa = new BonCasa("TT", 523360);
        bonCasa.tipareste();

        DecoratorBon decoratorBon = new DecoratorBon(bonCasa);
        decoratorBon.tipareste();
    }
}