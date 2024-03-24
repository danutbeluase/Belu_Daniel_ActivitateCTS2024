package ro.ase.beludaniel.cts.farmacie4.clase;

public interface PrototipReteta extends Cloneable {
    void adaugaSolutie(Solutie solutie);
    void afiseazaInformatii();

    PrototipReteta cloneaza();
}