package ro.ase.beludaniel.cts.farmacie5.interfete;

public interface Aplicatie {
    void setareMedicament(int idMedicament);

    boolean verificareDisponibilitate(int numarMedicamente);
}