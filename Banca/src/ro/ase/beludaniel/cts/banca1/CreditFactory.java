package ro.ase.beludaniel.cts.banca1;

public class CreditFactory {
    public Credit creazaCredit(TipCredit tipCredit, int suma) {
        switch (tipCredit) {
            case Ipotecar -> {
                return new CreditIpotecare(suma);
            }

            case NevoiPersonale -> {
                return new CreditNevoiPersonale(suma);
            }

            default -> {
                return null;
            }
        }
    }
}
