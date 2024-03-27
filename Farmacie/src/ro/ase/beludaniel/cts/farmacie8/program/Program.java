package ro.ase.beludaniel.cts.farmacie8.program;

import ro.ase.beludaniel.cts.farmacie8.clase.Medicament;
import ro.ase.beludaniel.cts.farmacie8.clase.Sectiune;
import ro.ase.beludaniel.cts.farmacie8.interfete.Compus;

public class Program {
    public static void main(String[] args) {
        Compus compus = new Medicament("Medicament 1");
        compus.prezentare();

        try {
            compus.get(0);
        }
        catch (UnsupportedOperationException exception) {
            exception.printStackTrace();
        }

        Compus sectiune = new Sectiune("Sectiune 1");
        sectiune.adaugaCompus(new Medicament("Medicament 2"));
        sectiune.adaugaCompus(new Medicament("Medicament 3"));

        sectiune.get(0).prezentare();
        sectiune.prezentare();

        Sectiune medicamenteRaceala = new Sectiune("Medicamente medicamenteRaceala");
        medicamenteRaceala.adaugaCompus(sectiune);
        medicamenteRaceala.prezentare();
    }
}