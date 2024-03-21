package ro.ase.beludaniel.cts.banca1;

public class Program {
    public static void main(String[] args) {
        for(TipCredit tipCredit : TipCredit.values()) {
            CreditFactory creatorCredite = new CreditFactory();
            creatorCredite.creazaCredit(tipCredit, 20000).acorda();
        }
    }
}