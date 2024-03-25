package ro.ase.beludaniel.cts.restaurant8.clase;

import ro.ase.beludaniel.cts.restaurant8.interfete.Consumatie;

public class Item implements Consumatie {

    private final String eticheta;

    public Item(String eticheta) {
        this.eticheta = eticheta;
    }

    public String getEticheta() {
        return eticheta;
    }

    @Override
    public Consumatie getConsumatie(int index) throws Exception {
        throw new UnsupportedOperationException("Operatia nu este implementata pentru acest tip.");
    }

    @Override
    public void adaugaConsumatie(Consumatie consumatie) throws Exception {
        throw new UnsupportedOperationException("Operatia nu este implementata pentru acest tip.");
    }

    @Override
    public void stergeConsumatie(Consumatie consumatie) throws Exception {
        throw new UnsupportedOperationException("Operatia nu este implementata pentru acest tip.");
    }

    @Override
    public String toString() {
        return this.eticheta;
    }

    @Override
    public void selecteaza() {
        System.out.printf("Selcteaza consumatie %s\n", this.eticheta);
    }
}