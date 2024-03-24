package ro.ase.beludaniel.cts.banca5.program;

import ro.ase.beludaniel.cts.banca5.clase.SoftwareExistent;
import ro.ase.beludaniel.cts.banca5.clase.SoftwareLeasing;
import ro.ase.beludaniel.cts.banca5.clase.SoftwareNou;

public class Program {
    public static void main(String[] args) {
        SoftwareLeasing oldApp = new SoftwareExistent(10000);
        oldApp.acorda();

        SoftwareNou newApp = new SoftwareNou(oldApp, 100000);
        newApp.acorda();
        newApp.prioritizeazaCredit();

        newApp = new SoftwareNou(oldApp, 45000);
        newApp.acorda();
        newApp.prioritizeazaCredit();
    }
}