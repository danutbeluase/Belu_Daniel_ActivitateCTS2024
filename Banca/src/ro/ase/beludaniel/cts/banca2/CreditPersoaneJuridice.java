package ro.ase.beludaniel.cts.banca2;

public class CreditPersoaneJuridice extends Credit {
    public CreditPersoaneJuridice(int valoare) {
        super(valoare);
    }

    @Override
    public void aproba() {
        System.out.printf("Aproba credit persoane juridice in valoare de %d RON.\n", this.valoare);
    }
}