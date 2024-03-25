package ro.ase.beludaniel.cts.restaurant7.clase;

import ro.ase.beludaniel.cts.restaurant7.interfete.Nota;

public class NotaDePlata implements Nota {
    private final String numarFactura;
    private final float valoare;

    public NotaDePlata(String numarFactura, float valoare) {
        this.numarFactura = numarFactura;
        this.valoare = valoare;
    }

    public String getNumarFactura() {
        return numarFactura;
    }

    public float getValoare() {
        return valoare;
    }

    @Override
    public void imprimare() {
        System.out.printf("Imprimare nota de plata numarul %s in valoare de %5.2f.\n", this.numarFactura, this.valoare);
    }
}