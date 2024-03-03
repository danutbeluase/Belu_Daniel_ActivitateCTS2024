package ro.ase.beludaniel.cts.spital2;

public class Client {
    private final TipPersonal tipPersonal;

    public Client(TipPersonal tipPersonal) {
        this.tipPersonal = tipPersonal;
    }

    public PersonalCreator getCreator() {
        PersonalCreator personalCreator = null;
        switch (this.tipPersonal) {
            case Brancardier -> personalCreator = new BrancardierCreator();
            case Asistent -> personalCreator = new AssitentCreator();
            case Medic -> personalCreator = new MedicCreator();
        }

        return  personalCreator;
    }
}