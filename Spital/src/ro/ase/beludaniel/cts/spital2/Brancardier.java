package ro.ase.beludaniel.cts.spital2;

public class Brancardier extends PersonalSpital {
    @Override
    public void angajeaza() {
        System.out.printf("Anagjeaza %s\n", this.toString());
    }

    @Override
    public String toString() {
        return "Brancardier";
    }
}