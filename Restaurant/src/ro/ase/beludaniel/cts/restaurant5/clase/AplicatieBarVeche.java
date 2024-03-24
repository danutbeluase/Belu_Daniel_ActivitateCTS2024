package ro.ase.beludaniel.cts.restaurant5.clase;

public class AplicatieBarVeche implements AplicatieBar {
    private AplicatieBucatarie aplicatieBucatarie;

    public AplicatieBarVeche(AplicatieBucatarie aplicatieBucatarie) {
        this.aplicatieBucatarie = aplicatieBucatarie;
    }

    @Override
    public void trimiteComanda(String comanda) {
        System.out.println("Trimite comanda folosind aplicatia veche.");
        this.aplicatieBucatarie.imprimaFactura(comanda);
    }

    public void pregatesteComanda(String comanda) {
        System.out.println("Pregatire comanda.");
    }
}