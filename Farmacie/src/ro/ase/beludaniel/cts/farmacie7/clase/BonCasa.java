package ro.ase.beludaniel.cts.farmacie7.clase;

import ro.ase.beludaniel.cts.farmacie7.interfete.PrototipBon;

public class BonCasa implements PrototipBon {
    private final String serie;
    private final Integer numar;

    public BonCasa(String serie, Integer numar) {
        this.serie = serie;
        this.numar = numar;
    }

    public String getSerie() {
        return serie;
    }

    public Integer getNumar() {
        return numar;
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return String.format("%s %d", this.serie, this.numar);
    }

    /**
     * Tipareste bonul de casa
     */
    @Override
    public void tipareste() {
        System.out.printf("Tiparire bon de casa %s.\n", this.toString());
    }
}