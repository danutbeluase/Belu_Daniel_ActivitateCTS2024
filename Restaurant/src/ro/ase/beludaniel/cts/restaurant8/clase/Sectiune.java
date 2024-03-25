package ro.ase.beludaniel.cts.restaurant8.clase;

import ro.ase.beludaniel.cts.restaurant8.interfete.Consumatie;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements Consumatie {
    private final String eticheta;

    private final List<Consumatie> items = new ArrayList<>();

    public Sectiune(String eticheta) {
        this.eticheta = eticheta;
    }

    public String getEticheta() {
        return eticheta;
    }

    @Override
    public Consumatie getConsumatie(int index) throws Exception {
        return 0 <= index && index <= this.items.size() ? items.get(index) : null;
    }

    @Override
    public void adaugaConsumatie(Consumatie consumatie) throws Exception {
        this.items.add(consumatie);
    }

    @Override
    public void stergeConsumatie(Consumatie consumatie) throws Exception {
        if (this.items.contains(consumatie)) {
            this.items.remove(consumatie);
        }
    }

    @Override
    public void selecteaza() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Selcteaza urmatoarele:");
        stringBuilder.append('\n');
        if (this.items.size() > 0) {
            for (Consumatie consumatie : this.items) {
                stringBuilder.append(String.format("%s\n", consumatie));
            }
        } else {
            stringBuilder.append("Lista este goala.\n");
        }

        return stringBuilder.toString();
    }
}