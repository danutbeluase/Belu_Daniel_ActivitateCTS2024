package ro.ase.beludaniel.cts.farmacie6.clase;

import java.util.ArrayList;
import java.util.List;

public final class Reteta {
    private final String identificator;
    private final List<String> medicamente = new ArrayList<>();

    public String getIdentificator() {
        return identificator;
    }

    public Reteta(String identificator) {
        this.identificator = identificator;
    }

    public void adaugaMedicament(String medicament) {
        this.medicamente.add(medicament);
    }

    public void adaugaMedicamente(List<String> medicamente) {
        this.medicamente.addAll(medicamente);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("Reteta nr: %s.\n", this.identificator));

        if(this.medicamente.size() > 0) {
            for(String medicament : this.medicamente) {
                stringBuilder.append(String.format("%s.\n", medicament));
            }
        }

        return stringBuilder.toString();
    }
}