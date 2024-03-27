package ro.ase.beludaniel.cts.farmacie8.interfete;

public interface Compus {
    Compus get(int index);
    void adaugaCompus(Compus compus) throws UnsupportedOperationException;
    void stergeCompus(Compus compus) throws UnsupportedOperationException;
    void prezentare();
}