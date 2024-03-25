package ro.ase.beludaniel.cts.restaurant8.interfete;

public interface Consumatie {
    Consumatie getConsumatie(int index) throws Exception;

    void adaugaConsumatie(Consumatie consumatie) throws Exception;

    void stergeConsumatie(Consumatie consumatie) throws Exception;
    void selecteaza();
}