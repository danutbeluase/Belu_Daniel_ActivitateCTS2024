package ro.ase.beludaniel.cts.stb4.clase;

import ro.ase.beludaniel.cts.stb4.interfete.SistemPlataMetrorex;

public class SistemMetrorex implements SistemPlataMetrorex {
    @Override
    public void achizitioneazaTichet(TipBiletMetrou tipBilet) {
        System.out.printf("Achizitioneaza bilet %s.\n", tipBilet.name());
    }
}