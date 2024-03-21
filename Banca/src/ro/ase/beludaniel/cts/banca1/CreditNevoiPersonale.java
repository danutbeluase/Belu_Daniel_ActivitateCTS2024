package ro.ase.beludaniel.cts.banca1;

public class CreditNevoiPersonale extends Credit {
    @Override
    public void acorda() {
        System.out.printf("Acord credit nevoi personale in valoare de %d RON.\n", this.suma);
    }

    public CreditNevoiPersonale(int suma) {
        super(suma);
    }
}