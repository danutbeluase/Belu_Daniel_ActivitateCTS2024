package ro.ase.beludaniel.cts.spital3;

public class Client {

    private final PersonalCreator personalCreator;

    public Client(PersonalCreator personalCreator) {
        this.personalCreator = personalCreator;
    }

    public PersonalSpital getPersonal() {
        return this.personalCreator.creazaPersonal();
    }
}