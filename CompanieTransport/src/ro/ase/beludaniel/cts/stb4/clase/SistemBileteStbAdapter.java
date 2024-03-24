package ro.ase.beludaniel.cts.stb4.clase;

public class SistemBileteStbAdapter extends SistemBileteStb implements SistemBilete {
    private final SistemBilete sistemBileteMetrou;
    private final boolean esteBiletMetrou;

    public SistemBileteStbAdapter(SistemBilete sistemBileteMetrou, boolean esteBiletMetrou) {
        if (sistemBileteMetrou instanceof SistemBileteStbAdapter) {
            throw new UnsupportedOperationException("Operatia nu este suportata.");
        }

        this.sistemBileteMetrou = sistemBileteMetrou;
        this.esteBiletMetrou = esteBiletMetrou;
    }

    @Override
    public void valideaza(TipBilet tipBilet) {
        if (!this.esteBiletMetrou) {
            super.valideaza(tipBilet);
        } else {
            this.valideazaBiletMetrou(tipBilet);
        }
    }

    private void valideazaBiletMetrou(TipBilet tipBilet) {
        this.sistemBileteMetrou.valideaza(tipBilet);
    }
}