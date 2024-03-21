package ro.ase.beludaniel.cts.sportiv1;

public class CreatorJucator {
    public Jucator creaza(PostJucator post) {
        switch (post) {
            case Portar -> {
                return new Portar();
            }

            case Fundas -> {
                return new Fundas();
            }

            case Mijlocas -> {
                return new Mijlocas();
            }

            case Atacant -> {
                return new Atacant();
            }

            default -> {
                return null;
            }
        }
    }
}