package ro.ase.beludaniel.cts.farmacie5.clase;

import ro.ase.beludaniel.cts.farmacie5.interfete.Software;

public class SoftwareNou implements Software {
    @Override
    public void verificaStocPentruMedicament(int idMedicament, int numarMedicamente) {
        System.out.printf("Verificare stoc medicmanet %d cantiate %d.\n", idMedicament, numarMedicamente);
    }
}