package ro.ase.beludaniel.cts.stb3;

public final class AutobuzLinie {
    private final String model;
    private final String conducatorAuto;
    private final boolean areOpririLinie;

    private final boolean deschideUsileAutomat;
    private final String mesajIntampinare;
    private final Integer anFabricatie;

    public AutobuzLinie(String model, String conducatorAuto, boolean areOpririLinie, boolean deschideUsileAutomat, String mesajIntampinare, Integer anFabricatie) {
        this.model = model;
        this.conducatorAuto = conducatorAuto;
        this.areOpririLinie = areOpririLinie;
        this.deschideUsileAutomat = deschideUsileAutomat;
        this.mesajIntampinare = mesajIntampinare;
        this.anFabricatie = anFabricatie;
    }

    @Override
    public String toString() {
        return "AutobuzLinie{" +
                "model='" + model + '\'' +
                ", conducatorAuto='" + conducatorAuto + '\'' +
                ", areOpririLinie=" + areOpririLinie +
                ", deschideUsileAutomat=" + deschideUsileAutomat +
                ", mesajIntampinare='" + mesajIntampinare + '\'' +
                ", anFabricatie=" + anFabricatie +
                '}';
    }

    public static class Builder implements AutobuzLinieBuilder {
        private String model;
        private String conducatorAuto;
        private boolean areOpririLinie;
        private boolean deschideUsileAutomat;
        private String mesajIntampinare;
        private Integer anFabricatie;

        public Builder setModel(String model) {
            this.model = model;

            return this;
        }

        public Builder setConducatorAuto(String conducatorAuto) {
            this.conducatorAuto = conducatorAuto;

            return this;
        }

        public Builder setAreOpririLinie(boolean areOpririLinie) {
            this.areOpririLinie = areOpririLinie;

            return this;
        }

        public Builder setDeschideUsileAutomat(boolean deschideUsileAutomat) {
            this.deschideUsileAutomat = deschideUsileAutomat;

            return this;
        }

        public Builder setMesajIntampinare(String mesajIntampinare) {
            this.mesajIntampinare = mesajIntampinare;

            return this;
        }

        public Builder setAnFabricatie(Integer anFabricatie) {
            this.anFabricatie = anFabricatie;

            return this;
        }

        @Override
        public AutobuzLinie build() {
            return new AutobuzLinie(this.model, this.conducatorAuto, this.areOpririLinie, this.deschideUsileAutomat,
                    this.mesajIntampinare, this.anFabricatie);
        }
    }
}