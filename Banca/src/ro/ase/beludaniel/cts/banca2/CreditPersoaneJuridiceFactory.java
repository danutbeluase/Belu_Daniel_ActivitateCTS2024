package ro.ase.beludaniel.cts.banca2;

public class CreditPersoaneJuridiceFactory implements CrediteFactory {
    @Override
    public Credit acordaCredit(int valoare) {
        return new CreditPersoaneJuridice(valoare);
    }
}