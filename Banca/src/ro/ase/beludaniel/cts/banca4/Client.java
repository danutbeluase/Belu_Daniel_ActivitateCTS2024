package ro.ase.beludaniel.cts.banca4;

import java.util.Objects;

public class Client {
    private String nume;
    private String prenume;
    private String seriBuletin;
    private String cardCredit;

    public Client(String nume, String prenume, String serieBuletin, String cardCredit) {
        this.nume = nume;
        this.prenume = prenume;
        this.seriBuletin = serieBuletin;
        this.cardCredit = cardCredit;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, prenume);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Client client = (Client) obj;

        return nume.equals(client.nume) && prenume.equals(client.prenume);
    }

    public String getPrenume() {
        return prenume;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", seriBuletin='" + seriBuletin + '\'' +
                ", cardCredit='" + cardCredit + '\'' +
                '}';
    }
}