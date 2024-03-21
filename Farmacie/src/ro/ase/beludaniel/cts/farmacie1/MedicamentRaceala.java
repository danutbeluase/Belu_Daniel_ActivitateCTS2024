package ro.ase.beludaniel.cts.farmacie1;

public class MedicamentRaceala extends Medicament {
    public MedicamentRaceala(double pret, String denumire) {
        super(pret, denumire);
    }

    @Override
    public void fabricare() {
        System.out.printf("Fabricare medicament raceala %s.\n", this.toString());
    }
}