package ro.ase.beludaniel.cts.spital7;

public class Program {

    public static void main(String[] args) {
        try {
            RezultatAnalize rezultatAnalize = RezultateAnalizeFactory.getInstanta().furnizeazaRezultat(TipRezultate.Tiparit);
            rezultatAnalize.afiseaza();
            rezultatAnalize = RezultateAnalizeFactory.getInstanta().furnizeazaRezultat(TipRezultate.Digital);
            rezultatAnalize.afiseaza();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}