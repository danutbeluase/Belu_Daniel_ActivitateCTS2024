package ro.ase.beludaniel.cts.farmacie9.program;

import ro.ase.beludaniel.cts.farmacie9.clase.SistemAchizitieMedicamente;
import ro.ase.beludaniel.cts.farmacie9.clase.SistemAchizitieMedicamenteFaraReteta;
import ro.ase.beludaniel.cts.farmacie9.interfete.SistemAchizitie;

public class Program {
    public static void main(String[] args) {
        SistemAchizitie sistemAchizitie = new SistemAchizitieMedicamente();
        sistemAchizitie.achizitioneaza("Medicament 1");

        SistemAchizitie sistemAchizitieFarmacie =new SistemAchizitieMedicamenteFaraReteta(sistemAchizitie);
        sistemAchizitieFarmacie.achizitioneaza("Alt medicament");
    }
}