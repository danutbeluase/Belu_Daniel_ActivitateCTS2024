package ro.ase.beludaniel.cts.farmacie3;

public class Factura {
    private int nrPungi;

    private boolean plataCuCardul;
    private boolean areCardFidelitate;

    private int cotaTva;

    public Factura(int nrPungi, boolean plataCuCardul, boolean areCardFidelitate, int cotaTva) {
        this.nrPungi = nrPungi;
        this.plataCuCardul = plataCuCardul;
        this.areCardFidelitate = areCardFidelitate;
        this.cotaTva = cotaTva;
    }

    public int getCotaTva() {
        return cotaTva;
    }

    public void setCotaTva(int cotaTva) {
        this.cotaTva = cotaTva;
    }

    public boolean isAreCardFidelitate() {
        return areCardFidelitate;
    }

    public void setAreCardFidelitate(boolean areCardFidelitate) {
        this.areCardFidelitate = areCardFidelitate;
    }

    public boolean isPlataCuCardul() {
        return plataCuCardul;
    }

    public void setPlataCuCardul(boolean plataCuCardul) {
        this.plataCuCardul = plataCuCardul;
    }

    public int getNrPungi() {
        return nrPungi;
    }

    public void setNrPungi(int nrPungi) {
        this.nrPungi = nrPungi;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "nrPungi=" + nrPungi +
                ", plataCuCardul=" + (plataCuCardul ? "da" : "nu:") +
                ", areCardFidelitate=" + (areCardFidelitate ? "da" : "nu") +
                ", cotaTva=" + cotaTva + "%" +
                '}';
    }

    static class Builder implements ro.ase.beludaniel.cts.farmacie3.Builder {
        private int nrPungi;
        private boolean plataCuCardul;
        private boolean cardFidelitate;
        private int cotaTva;

        public Builder setNrPungi(int nrPungi) {
            this.nrPungi = nrPungi;
            return this;
        }

        public Builder plataCuCardul(boolean plataCuCardul) {
            this.plataCuCardul = plataCuCardul;
            return this;
        }

        public Builder cardFidelitate(boolean cardFidelitate) {
            this.cardFidelitate = cardFidelitate;
            return this;
        }

        public Builder cotaTva(int cotaTva) {
            this.cotaTva = cotaTva;
            return this;
        }

        @Override
        public Factura build() {
            return new Factura(this.nrPungi, this.plataCuCardul, this.cardFidelitate, this.cotaTva);
        }
    }
}