package ro.ase.beludaniel.cts.farmacie4.clase;

public class Solutie {
    private final String denumire;
    private final Integer cantitate;

    public Solutie(String denumire, Integer cantitate) {
        this.denumire = denumire;
        this.cantitate = cantitate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Solutie{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", cantitate=").append(cantitate);
        sb.append('}');

        return sb.toString();
    }
}