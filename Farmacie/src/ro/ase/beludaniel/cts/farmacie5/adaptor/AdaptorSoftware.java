package ro.ase.beludaniel.cts.farmacie5.adaptor;

import ro.ase.beludaniel.cts.farmacie5.clase.SoftwareNou;
import ro.ase.beludaniel.cts.farmacie5.interfete.Aplicatie;
import ro.ase.beludaniel.cts.farmacie5.interfete.Software;

public class AdaptorSoftware extends SoftwareNou implements Aplicatie {
    private final Software software;
    private final Aplicatie aplicatie;

    public AdaptorSoftware(Software software, Aplicatie aplicatie) {
        this.software = software;
        this.aplicatie = aplicatie;
    }

    @Override
    public void verificaStocPentruMedicament(int idMedicament, int numarMedicamente) {
        System.out.println("Verificare stoc pentru medicamente folosind adaptorul software.");
        this.software.verificaStocPentruMedicament(idMedicament, numarMedicamente);
    }

    @Override
    public void setareMedicament(int idMedicament) {
        this.aplicatie.setareMedicament(idMedicament);
    }

    @Override
    public boolean verificareDisponibilitate(int numarMedicamente) {
        return this.aplicatie.verificareDisponibilitate(numarMedicamente);
    }
}