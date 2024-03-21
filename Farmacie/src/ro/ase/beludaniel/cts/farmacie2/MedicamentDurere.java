package ro.ase.beludaniel.cts.farmacie2;

public class MedicamentDurere extends Medicament {
    public MedicamentDurere(double pret, String denumire) {
        super(pret, denumire);
    }

    @Override
    public void fabricare() {
        System.out.printf("Fabricare medicament durere %s.\n", this.toString());
    }
}