package ro.ase.beludaniel.cts.farmacie2;

public class FabricaMedicamenteRaceala implements FabricaMedicamente {
    @Override
    public Medicament creazaMedicament(double pret, String denumire) {
        return new MedicamentRaceala(pret, denumire);
    }
}