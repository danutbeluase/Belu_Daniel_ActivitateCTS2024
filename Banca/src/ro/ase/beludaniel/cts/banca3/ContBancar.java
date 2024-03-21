package ro.ase.beludaniel.cts.banca3;

public class ContBancar {
    private boolean esteContSalariu;
    private boolean areCardAtasat;
    private boolean areInternetBanking;

    public ContBancar(boolean esteContSalariu, boolean areCardAtasat, boolean areInternetBanking) {
        this.esteContSalariu = esteContSalariu;
        this.areCardAtasat = areCardAtasat;
        this.areInternetBanking = areInternetBanking;
    }

    public boolean isEsteContSalariu() {
        return esteContSalariu;
    }

    public void setEsteContSalariu(boolean esteContSalariu) {
        this.esteContSalariu = esteContSalariu;
    }

    public boolean isAreCardAtasat() {
        return areCardAtasat;
    }

    public void setAreCardAtasat(boolean areCardAtasat) {
        this.areCardAtasat = areCardAtasat;
    }

    public boolean isAreInternetBanking() {
        return areInternetBanking;
    }

    public void setAreInternetBanking(boolean areInternetBanking) {
        this.areInternetBanking = areInternetBanking;
    }

    @Override
    public String toString() {
        return "ContBancar{" +
                "este cont salariu ? " + (esteContSalariu ? "da" : "nu") +
                ", are card atasat ? " + (areCardAtasat ? "da" : "nu") +
                ", areInternetBanking ? " + (areInternetBanking ? "da" : "nu") +
                '}';
    }

    public static class Builder implements ContaBancarBuilder {

        private boolean esteContSalariu;
        private boolean areCardAtasat;
        private boolean areInternetBanking;

        public Builder setEstContSalariu(boolean estContSalariu) {
            this.esteContSalariu = estContSalariu;

            return this;
        }

        public Builder setAreCardAtasat(boolean areCardAtasat) {
            this.areCardAtasat = areCardAtasat;

            return this;
        }

        public Builder setAreInternetBanking(boolean areInternetBanking) {
            this.areInternetBanking = areInternetBanking;

            return this;
        }

        @Override
        public ContBancar build() {
            return new ContBancar(this.esteContSalariu, this.areCardAtasat, this.areInternetBanking);
        }
    }
}