package ro.ase.beludaniel.cts.spital1;

public class FacilitateBuilder implements ConstruireFacilitate {
    private final Facilitate facilitate;

    public void adaugaFacilitate(TipFacilitate tipFacilitate) {
        switch (tipFacilitate) {
            case MicDejun -> this.includeMicDejun();
            case PatRabatabil -> this.includePatRabatabil();
            case Slapi -> this.includeSlapi();
        }
    }

    @Override
    public void includeMicDejun() {
        this.facilitate.micDejun();
    }

    @Override
    public void includePatRabatabil() {
        this.facilitate.patRabatabil();
    }

    @Override
    public void includeSlapi() {
        this.facilitate.slapi();
    }

    @Override
    public Facilitate getFacilitate() {
        return this.facilitate;
    }

    public FacilitateBuilder() {
        this.facilitate = new FacilitatePacient();
    }
}