package ro.ase.beludaniel.cts.restaurant7.program;

import ro.ase.beludaniel.cts.restaurant7.clase.*;
import ro.ase.beludaniel.cts.restaurant7.interfete.Nota;

public class Program {
    public static void main(String[] args) {
        Nota nota = new NotaDePlata("XD 856320", 100);
        nota.imprimare();

        Decorator decorator = new Decorator(nota);
        decorator.imprimare();
    }
}