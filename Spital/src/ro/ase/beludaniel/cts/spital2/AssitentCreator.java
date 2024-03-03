package ro.ase.beludaniel.cts.spital2;

public class AssitentCreator extends PersonalCreator {
    @Override
    public Asistent creazaPersonal() {
        return new Asistent();
    }
}