package ro.ase.beludaniel.cts.farmacie9.clase;

import ro.ase.beludaniel.cts.farmacie9.interfete.SistemAchizitie;

public class SistemAchizitieMedicamenteFaraReteta extends SistemAchizitieMedicamente implements SistemAchizitie {
    private final SistemAchizitie sistemAchizitieMedicamenteReteta;
    public SistemAchizitieMedicamenteFaraReteta(SistemAchizitie sistemAchizitieMedicamenteCompensate) {
        this.sistemAchizitieMedicamenteReteta = sistemAchizitieMedicamenteCompensate;
    }

    /**
     * @param medicament
     */
    @Override
    public void achizitioneaza(String medicament) {
        System.out.println("Sistemul nu acorda medicamente fara reteta.");
    }
}
