package ro.ase.beludaniel.cts.banca2;

public class CreditPersoaneFiziceFactory implements CrediteFactory {
    @Override
    public Credit acordaCredit(int valoare) {
        return new CreditPersoaneFizice(valoare);
    }
}