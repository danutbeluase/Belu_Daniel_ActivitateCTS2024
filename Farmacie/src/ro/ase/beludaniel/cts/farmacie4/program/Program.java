package ro.ase.beludaniel.cts.farmacie4.program;

import ro.ase.beludaniel.cts.farmacie4.clase.PrototipReteta;
import ro.ase.beludaniel.cts.farmacie4.clase.Reteta;
import ro.ase.beludaniel.cts.farmacie4.clase.Solutie;

public class Program {
    public static void main(String[] args) {
        PrototipReteta reteta = new Reteta("AA", 1250256);
        reteta.afiseazaInformatii();

        reteta.adaugaSolutie(new Solutie("Solutie 1", 100));
        reteta.adaugaSolutie(new Solutie("Solutie 2", 125));
        reteta.afiseazaInformatii();

        PrototipReteta retetaNoua = reteta.cloneaza();
        retetaNoua.afiseazaInformatii();
    }
}