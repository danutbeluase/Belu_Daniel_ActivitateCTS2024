package ro.ase.beludaniel.cts.spital2;

public class MedicCreator extends PersonalCreator {
    @Override
    public Medic creazaPersonal() {
        return new Medic();
    }
}