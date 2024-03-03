package ro.ase.beludaniel.cts.spital2;

public class Program {
    public static void main(String[] args) {
        TipPersonal tipPersonal = TipPersonal.Asistent;
        Client client = new Client(tipPersonal);
        client.getCreator().creazaPersonal().angajeaza();
    }
}