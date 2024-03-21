package ro.ase.beludaniel.cts.banca2;

public class CreditPersoaneFizice extends Credit {

    public CreditPersoaneFizice(int valoare) {
        super(valoare);
    }

    @Override
    public void aproba() {
        System.out.printf("Aproba credit persoane fizice in valoare de %d RON.\n", this.valoare);
    }
}