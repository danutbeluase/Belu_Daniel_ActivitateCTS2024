package ro.ase.beludaniel.cts.restaurant2.clase;

import java.util.ArrayList;
import java.util.List;

public class Rezervare {
    private boolean locLaGeam;
    private boolean scauneErgonomice;
    private List<Decoratie> decoratii = new ArrayList<>();
    private boolean muzicaAmbientalaPersonalizata;
    private int genMuzica;

    public boolean areLocLaGeam() {
        return locLaGeam;
    }

    public void setLocLaGeam(boolean locLaGeam) {
        this.locLaGeam = locLaGeam;
    }

    public boolean areScauneErgonomice() {
        return scauneErgonomice;
    }

    public void setScauneErgonomice(boolean scauneErgonomice) {
        this.scauneErgonomice = scauneErgonomice;
    }

    public List<Decoratie> getDecoratii() {
        return decoratii;
    }

    public void setDecoratii(List<Decoratie> decoratii) {
        this.decoratii = decoratii;
    }

    public boolean isMuzicaAmbientalaPersonalizata() {
        return muzicaAmbientalaPersonalizata;
    }

    public void setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata) {
        this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
    }

    public int getGenMuzica() {
        return genMuzica;
    }

    public void setGenMuzica(int genMuzica) {
        this.genMuzica = genMuzica;
    }

    private void addDecoratie(Decoratie decoratie) {
        if (decoratie != null && this.decoratii != null) {
            this.decoratii.add(decoratie);
        }
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "are loc la geam ? " + (locLaGeam ? "Da" : "Nu") +
                ", dispune de scauneErgonomice ? " + (scauneErgonomice ? "Da" : "Nu") +
                ", decoratii=" + decoratii +
                ", are muzica ambientala personalizata ? " + (muzicaAmbientalaPersonalizata ? "Da" : "Nu") +
                ", genMuzica=" + genMuzica +
                '}';
    }

    public static class Builder implements IBuiler {
        private Rezervare restaurant;

        public Builder() {
            this.restaurant = new Rezervare();
        }

        public Builder setLocLaGeam(boolean locLaGeam) {
            this.restaurant.setLocLaGeam(locLaGeam);

            return this;
        }

        public Builder setScauneErgonomice(boolean scauneErgonomice) {
            this.restaurant.setScauneErgonomice(scauneErgonomice);

            return this;
        }

        public Builder addDecoratie(Decoratie decoratie) {
            this.restaurant.addDecoratie(decoratie);

            return this;
        }

        public Builder setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata) {
            this.restaurant.setMuzicaAmbientalaPersonalizata(muzicaAmbientalaPersonalizata);

            return this;
        }

        public Builder setGenMuzica(int genMuzica) {
            this.restaurant.setGenMuzica(genMuzica);

            return this;
        }

        @Override
        public Rezervare build() {
            return this.restaurant;
        }
    }
}