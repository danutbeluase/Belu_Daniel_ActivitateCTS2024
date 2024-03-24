package ro.ase.beludaniel.cts.restaurant3.program;

import ro.ase.beludaniel.cts.restaurant3.clase.Supa;
import ro.ase.beludaniel.cts.restaurant3.clase.SupaFactory;
import ro.ase.beludaniel.cts.restaurant3.clase.TipSupa;

public class Program {
    public static void main(String[] args) {
        SupaFactory factory = SupaFactory.getInstance();
        for(TipSupa tipSupa: TipSupa.values()) {
            Supa supa =  factory.createSupa(tipSupa);
            supa.prepara();
        }
    }
}