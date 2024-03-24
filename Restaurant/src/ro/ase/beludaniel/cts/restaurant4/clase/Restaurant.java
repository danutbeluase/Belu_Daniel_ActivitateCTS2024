package ro.ase.beludaniel.cts.restaurant4.clase;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Restaurant {
    private static Restaurant instance = new Restaurant();

    private Set<String> clienti;
    private Restaurant() {
        this.clienti = new HashSet<>();
    }

    public void adaugaClient(String nume) {
        this.clienti.add(nume);
    }

    public static Restaurant getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for(String client : this.clienti) {
            stringBuilder.append(String.format("%s\n", client));
        }

        return stringBuilder.toString();
    }
}