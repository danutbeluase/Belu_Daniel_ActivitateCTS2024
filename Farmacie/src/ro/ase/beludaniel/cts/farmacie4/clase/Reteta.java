package ro.ase.beludaniel.cts.farmacie4.clase;

import java.util.ArrayList;
import java.util.List;

public class Reteta implements PrototipReteta {
    private String serie;
    private Integer numar;

    private List<Solutie> solutii = new ArrayList<>();

    public Reteta(String serie, Integer numar) {
        this.serie = serie;
        this.numar = numar;
    }

    @Override
    public void adaugaSolutie(Solutie solutie) {
        if (solutie != null) {
            this.solutii.add(solutie);
        }
    }

    @Override
    public void afiseazaInformatii() {
        System.out.println(this.toString());
        StringBuilder stringBuilder = new StringBuilder();
        if (this.solutii.size() == 0) {
            stringBuilder.append("Nu exista solutii adaugate pe reteta.\n");
        }
        else {
            stringBuilder.append("Reteta contine urmatoarele solutii:\n");
            for (Solutie solutie : this.solutii) {
                stringBuilder.append(String.format("%s\n", solutie));
            }
        }

        System.out.println(stringBuilder.toString());
    }

    @Override
    public PrototipReteta cloneaza() {
        Reteta reteta = new Reteta(this.serie, this.numar);
        for (Solutie solutie : this.solutii) {
            reteta.adaugaSolutie(solutie);
        }

        return reteta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("serie='").append(serie).append('\'');
        sb.append(", numar=").append(numar);
        sb.append('}');

        return sb.toString();
    }
}