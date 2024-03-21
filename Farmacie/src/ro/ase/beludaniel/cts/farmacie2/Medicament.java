package ro.ase.beludaniel.cts.farmacie2;

public abstract class Medicament {
    abstract void fabricare();
    double pret;
    String denumire;

    @Override
    public String toString() {
        return String.format("%s %.2f", this.denumire, this.pret);
    }

    public Medicament(double pret, String denumire) {
        this.pret = pret;
        this.denumire = denumire;
    }
}