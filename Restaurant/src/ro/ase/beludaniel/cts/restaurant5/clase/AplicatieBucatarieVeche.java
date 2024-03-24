package ro.ase.beludaniel.cts.restaurant5.clase;

public class AplicatieBucatarieVeche implements AplicatieBucatarie {
    @Override
    public void imprimaFactura(String nrFactura) {
        System.out.printf("Imprimare factura %s.\n", nrFactura);
    }
}