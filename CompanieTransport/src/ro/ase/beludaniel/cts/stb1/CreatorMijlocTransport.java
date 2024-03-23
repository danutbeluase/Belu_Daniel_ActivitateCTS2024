package ro.ase.beludaniel.cts.stb1;

public class CreatorMijlocTransport {
    public MijlocTransport creaza(TipMijlocTransport tip) {
        switch (tip) {
            case Autobuz -> {
                return new Autobuz();
            }

            case Tramvai -> {
                return new Tramvai();
            }

            case Troleibuz -> {
                return new Troleibuz();
            }

            default -> {
                return null;
            }
        }
    }
}