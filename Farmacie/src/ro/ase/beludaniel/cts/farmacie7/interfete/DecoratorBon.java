package ro.ase.beludaniel.cts.farmacie7.interfete;

public class DecoratorBon implements PrototipBon {
    private final PrototipBon bon;

    public DecoratorBon(PrototipBon bon) {
        this.bon = bon;
    }
    /**
     * Tipareste bon personalizat
     */
    @Override
    public void tipareste() {
        System.out.println("Tiparire personalizata.");
        this.bon.tipareste();
        System.out.println("La multi ani !!!");
    }
}