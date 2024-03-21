package ro.ase.beludaniel.cts.banca2;

public abstract class Credit {
    protected int valoare;

    public Credit(int valoare) {
        this.valoare = valoare;
    }

    public abstract void aproba();

    @Override
    public String toString() {
        return "Credit{" +
                "valoare=" + valoare +
                '}';
    }
}
