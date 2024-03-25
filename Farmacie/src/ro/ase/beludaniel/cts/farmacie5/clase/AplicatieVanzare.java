package ro.ase.beludaniel.cts.farmacie5.clase;

import ro.ase.beludaniel.cts.farmacie5.interfete.Aplicatie;

public class AplicatieVanzare implements Aplicatie {

    private int idMedicament;

    @Override
    public void setareMedicament(int idMedicament) {
        System.out.printf("Setare medicament %d.\n", this.idMedicament);
        this.idMedicament = idMedicament;
    }

    @Override
    public boolean verificareDisponibilitate(int numarMedicamente) {
        System.out.printf("Verificare disponibilitate %d bucati pentru medicamentul %d.\n", numarMedicamente, this.idMedicament);
        return true;
    }
}