package ro.ase.beludaniel.cts.spital3;

public class Program {
    public static void main(String[] args) {
        //Se va modifica valoarea variabile tipPersonal
        TipPersonal tipPersonal = TipPersonal.Asistent;

        switch (tipPersonal) {
            case Brancardier -> new Client(new BrancardierCreator()).getPersonal().angajeaza();
            case Asistent -> new Client(new AssitentCreator()).getPersonal().angajeaza();
            case Medic -> new Client(new MedicCreator()).getPersonal().angajeaza();
            default -> System.out.println("Nu a fost implementat");
        }
    }
}