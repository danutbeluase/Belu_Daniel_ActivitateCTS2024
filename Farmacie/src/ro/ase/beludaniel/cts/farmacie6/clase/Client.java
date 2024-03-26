package ro.ase.beludaniel.cts.farmacie6.clase;

public final class Client {
    private final String nume;
    private final String prenume;

    private final String actIdentitate;

    public Client(String nume, String prenume, String actIdentitate) {
        this.nume = nume;
        this.prenume = prenume;
        this.actIdentitate = actIdentitate;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getActIdentitate() {
        return actIdentitate;
    }

    /**
     * @return Numele, prenumele si CNP-ul clientului
     */
    @Override
    public String toString() {
        return String.format("%s %s(%s).\n", this.nume, this.prenume, this.actIdentitate);
    }
}