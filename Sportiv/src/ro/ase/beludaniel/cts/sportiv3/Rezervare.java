package ro.ase.beludaniel.cts.sportiv3;

public class Rezervare {
    private boolean includeMasa;
    private boolean areScaunErgonomic;
    private boolean includeBautaraRacoritoare;

    public void setIncludeBautaraRacoritoare(boolean includeBautaraRacoritoare) {
        this.includeBautaraRacoritoare = includeBautaraRacoritoare;
    }

    private boolean areMuzicaAmbientala;
    private int genMuzica = 0;

    public Rezervare(boolean includeMasa, boolean areScaunErgonomic, boolean includeBautaraRacoritoare, boolean areMuzicaAmbientala, int genMuzica) {
        this.includeMasa = includeMasa;
        this.areScaunErgonomic = areScaunErgonomic;
        this.includeBautaraRacoritoare = includeBautaraRacoritoare;
        this.areMuzicaAmbientala = areMuzicaAmbientala;
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "include masa ? " + (this.includeMasa ? "da" : "nu") +
                ", are scaun ergonomic ? " + (this.areScaunErgonomic ? "da" : "nu") +
                ", include bautura racoritoare ? " + (this.includeBautaraRacoritoare ? "da" : "nu") +
                ", are muzica ambientala ? " + (this.areMuzicaAmbientala ? "da" : "nu") +
                ", genMuzica=" + this.genMuzica +
                '}';
    }

    public boolean isIncludeMasa() {
        return includeMasa;
    }

    public void setIncludeMasa(boolean includeMasa) {
        this.includeMasa = includeMasa;
    }

    public boolean isAreScaunErgonomic() {
        return areScaunErgonomic;
    }

    public void setAreScaunErgonomic(boolean areScaunErgonomic) {
        this.areScaunErgonomic = areScaunErgonomic;
    }

    public boolean isAreMuzicaAmbientala() {
        return areMuzicaAmbientala;
    }

    public void setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
        this.areMuzicaAmbientala = areMuzicaAmbientala;
    }

    public int getGenMuzica() {
        return genMuzica;
    }

    public void setGenMuzica(int genMuzica) {
        this.genMuzica = genMuzica;
    }

    public static class Builder implements RezervareBuilder {

        private boolean includeMasa;
        private boolean areScanErgonomic;
        private boolean includeBautaraRacoritoare;

        private boolean areMuzicaAmbientala;
        private int genMuzica;

        public Builder includeMasa(boolean includeMasa) {
            this.includeMasa = includeMasa;

            return this;
        }

        public Builder areScanErgonomic(boolean areScanErgonomic) {
            this.areScanErgonomic = areScanErgonomic;

            return this;
        }

        public Builder includeBautaraRacoritoare(boolean includeBautaraRacoritoare) {
            this.includeBautaraRacoritoare = includeBautaraRacoritoare;

            return this;
        }

        public Builder areMuzicaAmbientala(boolean areMuzicaAmbientala) {
            this.areMuzicaAmbientala = areMuzicaAmbientala;

            return this;
        }

        public Builder genMuzica(int genMuzica) {
            this.genMuzica = genMuzica;

            return this;
        }

        @Override
        public Rezervare build() {
            return new Rezervare(includeMasa, areScanErgonomic, includeBautaraRacoritoare, areMuzicaAmbientala, genMuzica);
        }
    }
}