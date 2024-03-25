package ro.ase.beludaniel.cts.farmacie5.program;

import ro.ase.beludaniel.cts.farmacie5.adaptor.AdaptorSoftware;
import ro.ase.beludaniel.cts.farmacie5.clase.AplicatieVanzare;
import ro.ase.beludaniel.cts.farmacie5.clase.SoftwareNou;
import ro.ase.beludaniel.cts.farmacie5.interfete.Aplicatie;
import ro.ase.beludaniel.cts.farmacie5.interfete.Software;

public class Program {
    public static void main(String[] args) {
        Aplicatie aplicatie = new AplicatieVanzare();
        aplicatie.setareMedicament(25);
        aplicatie.verificareDisponibilitate(2);

        Software software = new SoftwareNou();
        software.verificaStocPentruMedicament(22, 4);

        AdaptorSoftware adaptorSoftware = new AdaptorSoftware(software, aplicatie);
        adaptorSoftware.setareMedicament(11);
        adaptorSoftware.verificareDisponibilitate(11);
        adaptorSoftware.verificaStocPentruMedicament(11, 10);
    }
}