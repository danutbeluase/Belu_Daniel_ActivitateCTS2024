package ro.ase.beludaniel.cts.sportiv6.program;

import ro.ase.beludaniel.cts.sportiv6.clase.AplicatieStadion;

public class Program {
    public static void main(String[] args) {
        AplicatieStadion aplicatieStadion = AplicatieStadion.getInstance();
        aplicatieStadion.verificaEligibilitate("BC 52653", "Belu Daniel");
    }
}