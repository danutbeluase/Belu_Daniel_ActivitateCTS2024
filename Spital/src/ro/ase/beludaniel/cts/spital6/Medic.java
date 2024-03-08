package ro.ase.beludaniel.cts.spital6;

public class Medic {
    private final String nume;
    private final String specializare;

    public Medic(String nume, String specializare) {
        this.nume = nume;
        this.specializare = specializare;
    }

    public boolean confirmaInternarea(int stareSanatate) {
        return  stareSanatate <= 2;
    }
}