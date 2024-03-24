package ro.ase.beludaniel.cts.restaurant5.clase;

public class BarBucatarieAdapter implements AplicatieBar {
    AplicatieBucatarie aplicatieBucatarie;

    public BarBucatarieAdapter(AplicatieBucatarie aplicatieBucatarie) {
        this.aplicatieBucatarie = aplicatieBucatarie;
    }

    @Override
    public void trimiteComanda(String comanda) {
        this.aplicatieBucatarie.imprimaFactura(comanda);
    }
}