package ro.ase.beludaniel.cts.stb4.adaptor;

import ro.ase.beludaniel.cts.stb4.clase.SistemMetrorex;
import ro.ase.beludaniel.cts.stb4.clase.SistemStb;
import ro.ase.beludaniel.cts.stb4.clase.TipBiletMetrou;
import ro.ase.beludaniel.cts.stb4.clase.TipBiletStb;
import ro.ase.beludaniel.cts.stb4.interfete.SistemPlataMetrorex;
import ro.ase.beludaniel.cts.stb4.interfete.SistemPlataStb;

public class AdaptorSistemPlata extends SistemMetrorex implements SistemPlataStb {
    private final SistemPlataMetrorex sistemPlataMetrorex;

    public AdaptorSistemPlata(SistemPlataMetrorex sistemPlataMetrorex) {
        this.sistemPlataMetrorex = sistemPlataMetrorex;
    }

    @Override
    public void achizitioneazaTichet(TipBiletMetrou tipBilet) {
        System.out.println("Sistem de plata adaptat");
        this.sistemPlataMetrorex.achizitioneazaTichet(tipBilet);
    }

    @Override
    public void achizitioneaza(TipBiletStb tipBilet) {
        SistemPlataStb sistemPlataStb = new SistemStb();
        sistemPlataStb.achizitioneaza(tipBilet);
    }
}