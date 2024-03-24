package ro.ase.beludaniel.cts.restaurant5.program;

import ro.ase.beludaniel.cts.restaurant5.clase.*;

public class Program {
    public static void main(String[] args) {
        AplicatieBucatarie aplicatieBucatarie = new AplicatieBucatarieVeche();
        aplicatieBucatarie.imprimaFactura("FF0002232");
        AplicatieBar aplicatieBar = new AplicatieBarVeche(aplicatieBucatarie);
        aplicatieBar.trimiteComanda("CC552233");

        BarBucatarieAdapter barBucatarieAdapter = new BarBucatarieAdapter(aplicatieBucatarie);
        barBucatarieAdapter.trimiteComanda("aaa");
    }
}