package ro.ase.beludaniel.cts.farmacie9.clase;

import ro.ase.beludaniel.cts.farmacie9.interfete.SistemAchizitie;

public class SistemAchizitieMedicamente implements SistemAchizitie {
    /**
     * @param medicament
     */
    @Override
    public void achizitioneaza(String medicament) {
        System.out.printf("Achizitioneaza medicament %s.\n", medicament);
    }
}