package ro.ase.beludaniel.cts.stb4.program;

import ro.ase.beludaniel.cts.stb4.clase.*;

public class Program {
    public static void main(String[] args) {
        SistemBilete sistemBileteMetrou = new SistemBileteMetrou();
        sistemBileteMetrou.valideaza(TipBilet.DouaCalatorii);

        SistemBileteStbAdapter sistemBileteStb  = new SistemBileteStbAdapter(sistemBileteMetrou, true);
        sistemBileteStb.valideaza(TipBilet.Simplu);

        SistemBilete sistemSimplu = new SistemBileteStb();
        sistemSimplu.valideaza(TipBilet.ZeceCalatorii);

        sistemBileteStb = new SistemBileteStbAdapter(sistemSimplu, false);
        sistemBileteStb.valideaza(TipBilet.Simplu);

        try {
            sistemBileteStb = new SistemBileteStbAdapter(sistemBileteStb, false);
        }
        catch (UnsupportedOperationException exception) {
            System.out.println(exception.getMessage());
        }
    }
}