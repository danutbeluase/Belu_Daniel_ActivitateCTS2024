package ro.ase.beludaniel.cts.restaurant2.program;

import ro.ase.beludaniel.cts.restaurant2.clase.Decoratie;
import ro.ase.beludaniel.cts.restaurant2.clase.Rezervare;

public class Program {
    public static void main(String[] args) {
        Rezervare.Builder builder = new Rezervare.Builder();
        builder.addDecoratie(new Decoratie("Decoratie1"));
        builder.setGenMuzica(1);
        Rezervare rezervare = builder.build();
        System.out.println(rezervare);

        builder = new Rezervare.Builder();
        builder.setLocLaGeam(true).setMuzicaAmbientalaPersonalizata(true).setScauneErgonomice(true);
        rezervare = builder.build();
        System.out.println(rezervare);
    }
}