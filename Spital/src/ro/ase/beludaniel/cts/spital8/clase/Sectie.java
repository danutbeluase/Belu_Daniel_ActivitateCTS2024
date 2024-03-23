package ro.ase.beludaniel.cts.spital8.clase;

import ro.ase.beludaniel.cts.spital8.clase.Unitate;

public class Sectie implements Unitate {
    private String nume;
    private Integer numarMedici;

    public Sectie(String nume) {
        this.nume = nume;
    }

    @Override
    public String getNume() {
        return this.nume;
    }

    @Override
    public Integer getNumarMedici() {
        return this.numarMedici;
    }

    @Override
    public String toString() {
        return String.format("Sectie %s", this.getNume());
    }

    @Override
    public void deschide() {
        System.out.println(this);
    }
}
