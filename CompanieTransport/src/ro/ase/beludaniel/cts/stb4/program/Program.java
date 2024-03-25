package ro.ase.beludaniel.cts.stb4.program;

import ro.ase.beludaniel.cts.stb4.adaptor.*;
import ro.ase.beludaniel.cts.stb4.clase.*;
import ro.ase.beludaniel.cts.stb4.interfete.*;

public class Program {
    public static void main(String[] args) {
        SistemPlataMetrorex sistemMetrorex = new SistemMetrorex();
        sistemMetrorex.achizitioneazaTichet(TipBiletMetrou.AbonamentLunar);

        SistemPlataStb sistemPlataStb = new SistemStb();
        sistemPlataStb.achizitioneaza(TipBiletStb.ToateLiniile);

        AdaptorSistemPlata sistemUnic = new AdaptorSistemPlata(sistemMetrorex);
        sistemUnic.achizitioneaza(TipBiletStb.LiniSimpla);
        sistemUnic.achizitioneazaTichet(TipBiletMetrou.CalatoriiZece);
    }
}