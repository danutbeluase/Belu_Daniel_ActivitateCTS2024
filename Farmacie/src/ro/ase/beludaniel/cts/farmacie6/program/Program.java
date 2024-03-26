package ro.ase.beludaniel.cts.farmacie6.program;

import ro.ase.beludaniel.cts.farmacie6.clase.Client;
import ro.ase.beludaniel.cts.farmacie6.clase.Reteta;
import ro.ase.beludaniel.cts.farmacie6.clase.SistemIntegrat;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        SistemIntegrat sistemIntegrat = SistemIntegrat.getInstance();
        Client client = new Client("Belu", "Daniel", "1220033556699");
        Reteta reteta = new Reteta("WW223344");
        reteta.adaugaMedicamente(Arrays.asList("Medicament 1", "Medicament 2"));
        sistemIntegrat.verificaReteta(reteta, client);
    }
}