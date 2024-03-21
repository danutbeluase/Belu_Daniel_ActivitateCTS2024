package ro.ase.beludaniel.cts.farmacie2;

public class MedicamentBody extends Medicament {
    public MedicamentBody(double pret, String denumire) {
        super(pret, denumire);
    }

    @Override
    public void fabricare() {
        System.out.printf("Fabricare medicament body %s.\n", this.toString());
    }
}