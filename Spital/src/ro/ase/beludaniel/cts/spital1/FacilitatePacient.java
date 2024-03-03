package ro.ase.beludaniel.cts.spital1;

public final class FacilitatePacient implements Facilitate {
    private boolean micDejunInclus;
    private boolean slapiInclusi;
    private boolean patRabatabilInclus;

    @Override
    public String toString() {
        return String.format("FacilitatiPacient: micDejunInclus=%s, slapiInclusi=%s, patRabatabilInclus=%s",
                micDejunInclus ? "Da" : "Nu",
                slapiInclusi ? "Da" : "Nu",
                patRabatabilInclus ? "Da" : "Nu");
    }

    @Override
    public void micDejun() {
        this.micDejunInclus = true;
    }

    @Override
    public void slapi() {
        this.slapiInclusi = true;
    }

    @Override
    public void patRabatabil() {
        this.patRabatabilInclus = true;
    }

    public boolean isMicDejunInclus() {
        return micDejunInclus;
    }

    public boolean isSlapiInclusi() {
        return slapiInclusi;
    }

    public boolean isPatRabatabilInclus() {
        return patRabatabilInclus;
    }
}