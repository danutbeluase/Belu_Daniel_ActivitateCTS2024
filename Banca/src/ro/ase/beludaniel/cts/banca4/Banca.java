package ro.ase.beludaniel.cts.banca4;

import java.util.HashSet;
import java.util.Set;

public class Banca {
    private Set<Client> clientiExistenti;

    private Banca() {
        this.clientiExistenti = new HashSet<>();
    }

    public static Banca getInstance() {
        return SingletonHelper.instance;
    }

    public void deschideCont(Client client) {
        this.clientiExistenti.add(client);
    }

    @Override
    public String toString() {
        return this.clientiExistenti.toString();
    }

    private static class SingletonHelper {
        public static final Banca instance = new Banca();
    }
}