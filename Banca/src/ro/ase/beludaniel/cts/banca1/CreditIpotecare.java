package ro.ase.beludaniel.cts.banca1;

public class CreditIpotecare extends Credit {
    public CreditIpotecare(int suma) {
        super(suma);
    }

    @Override
    public void acorda() {
        System.out.printf("Acord credit ipotecar in valoare de %d ron.\n", this.suma);
    }
}