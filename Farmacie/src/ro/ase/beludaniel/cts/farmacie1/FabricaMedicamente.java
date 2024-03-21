package ro.ase.beludaniel.cts.farmacie1;

public class FabricaMedicamente {
    public Medicament creazaMedicament(CategorieMedicamente categorie, double pret, String denumire) {
        switch (categorie) {
            case Body -> {
                return  new MedicamentBody( pret, denumire);
            }

            case Raceala -> {
                return new MedicamentRaceala(pret, denumire);
            }

            case Durere -> {
                return new MedicamentDurere(pret, denumire);
            }

            default -> {
                return null;
            }
        }
    }
}