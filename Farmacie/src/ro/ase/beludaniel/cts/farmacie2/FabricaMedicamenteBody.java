package ro.ase.beludaniel.cts.farmacie2;

public class FabricaMedicamenteBody implements FabricaMedicamente {
    @Override
    public Medicament creazaMedicament(double pret, String denumire) {
        return new MedicamentBody(pret, denumire);
    }
}