package ro.ase.beludaniel.cts.restaurant1;

public class Program {
    public static void main(String[] args) {
        TipSupa tipSupa = TipSupa.SupaLegume;

        switch (tipSupa) {
            case SupaVita -> new Client(new SupaVitaCreator()).prepara().serveste();
            case SupaCiuperci -> new Client(new SuparCiuperciCreator()).prepara().serveste();
            case SupaLegume -> new Client(new SuparLegumeCreator()).prepara().serveste();
            case SupaRosii -> new Client(new SupaRosiiCreator()).prepara().serveste();
            case SupaCrema -> new Client(new SupaCremaCreator()).prepara().serveste();
        }
    }
}