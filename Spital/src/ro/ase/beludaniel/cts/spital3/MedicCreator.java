package ro.ase.beludaniel.cts.spital3;

public class MedicCreator extends PersonalCreator {
    @Override
    public Medic creazaPersonal() {
        return new Medic();
    }
}