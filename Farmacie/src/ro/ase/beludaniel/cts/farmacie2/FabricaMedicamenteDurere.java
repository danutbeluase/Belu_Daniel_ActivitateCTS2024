package ro.ase.beludaniel.cts.farmacie2;

public class FabricaMedicamenteDurere implements FabricaMedicamente {
    @Override
    public Medicament creazaMedicament(double pret, String denumire) {
        return new MedicamentDurere(pret, denumire);
    }
}