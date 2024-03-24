package ro.ase.beludaniel.cts.banca5.clase;

public class SoftwareNou implements SoftwareLeasing {
    private final SoftwareLeasing softwareVechi;
    private final int valoare;

    public SoftwareNou(SoftwareLeasing softwareVechi, int valoare) {
        this.softwareVechi = softwareVechi;
        this.valoare = valoare;
    }

    @Override
    public int getValoare() {
        return this.valoare;
    }

    @Override
    public void acorda() {
        System.out.println("Acorda credit folosind software nou adaptat la cel vechi.");
        this.softwareVechi.acorda();
    }

    public void prioritizeazaCredit() {
        if(this.getValoare() >= 99999) {
            System.out.println("Creditele mari au prioritate.");
        }
    }
}