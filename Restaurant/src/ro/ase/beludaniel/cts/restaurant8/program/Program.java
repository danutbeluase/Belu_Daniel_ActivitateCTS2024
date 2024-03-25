package ro.ase.beludaniel.cts.restaurant8.program;

import ro.ase.beludaniel.cts.restaurant8.clase.*;
import ro.ase.beludaniel.cts.restaurant8.interfete.Consumatie;

public class Program {
    public static void main(String[] args) throws Exception {
        Consumatie bautura1 = new Item("Apa plata");
        Consumatie bautura2 = new Item("Suc");

        Consumatie sectiune1 = new Sectiune("Bauturi");
        sectiune1.adaugaConsumatie(bautura1);
        sectiune1.adaugaConsumatie(bautura2);

        Consumatie sectiune2 = new Sectiune("Alcohol");
        sectiune2.adaugaConsumatie(new Item("Vin"));
        sectiune2.adaugaConsumatie(new Item("Bere"));

        Consumatie meniu = new Sectiune("Meniu");
        meniu.adaugaConsumatie(sectiune1);
        meniu.adaugaConsumatie(sectiune2);

        bautura1.selecteaza();
        bautura2.selecteaza();

        sectiune1.selecteaza();
        sectiune2.selecteaza();

        meniu.selecteaza();

        meniu.getConsumatie(1).selecteaza();
        sectiune1.getConsumatie(0).selecteaza();
        sectiune2.stergeConsumatie(sectiune2.getConsumatie(0));
        sectiune2.selecteaza();

        sectiune2.stergeConsumatie(sectiune2.getConsumatie(0));
        sectiune2.selecteaza();
    }
}