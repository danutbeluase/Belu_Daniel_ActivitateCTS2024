package ro.ase.beludaniel.cts.spital8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Departament implements Unitate {
    protected List<Unitate> subDepartamente = new ArrayList<>();

    public Departament(String nume) {
        this.nume = nume;
    }

    private String nume;
    private Integer numarMedici;

    @Override
    public String getNume() {
        return this.nume;
    }

    @Override
    public Integer getNumarMedici() {
        return this.numarMedici;
    }

    @Override
    public void deschide() {
        for(Unitate unitate: this.subDepartamente) {
            unitate.deschide();
        }

        System.out.println(this);
    }

    @Override
    public String toString() {
        long totalSectii = this.subDepartamente.stream().filter(d -> d.getClass().getCanonicalName().contains("Sectie")).count(),
            totalDepartamente = this.subDepartamente.stream().filter(d -> d.getClass().getCanonicalName().contains("Departament")).count();

        return String.format("Departamentul %s contine %d sectii si %d subdepartamente", this.getNume(),
                totalSectii,
                totalDepartamente);
    }

    public void adaugaDeapartament(Departament departament) {
        this.subDepartamente.add(departament);
    }

    public void adaugaDeapartamente(List<Departament> departamente) {
        this.subDepartamente.addAll(departamente);
    }

    public void adaugaSectie(Sectie sectie) {
        this.subDepartamente.add(sectie);
    }

    public void adaugaSectii(List<Sectie> sectii) {
        this.subDepartamente.addAll(sectii);
    }

    public void configureazaDepartament(Departament... departamente) {
        this.subDepartamente.clear();
        this.adaugaDeapartamente(Arrays.asList(departamente));
    }
}
