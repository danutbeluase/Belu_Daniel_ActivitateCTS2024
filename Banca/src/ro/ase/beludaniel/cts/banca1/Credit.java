package ro.ase.beludaniel.cts.banca1;

public abstract class Credit {
    protected int suma;

    public abstract void acorda();

    public Credit(int suma) {
        this.suma = suma;
    }
}