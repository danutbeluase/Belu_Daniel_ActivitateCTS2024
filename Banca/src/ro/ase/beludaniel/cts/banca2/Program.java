package ro.ase.beludaniel.cts.banca2;

public class Program {
    public static void main(String[] args) {
        CrediteFactory factory = new CreditPersoaneFiziceFactory();
        Credit credit = factory.acordaCredit(25000);
        credit.aproba();

        factory = new CreditPersoaneJuridiceFactory();
        credit = factory.acordaCredit(100000);
        credit.aproba();
    }
}