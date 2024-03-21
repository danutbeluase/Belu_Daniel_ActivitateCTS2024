package ro.ase.beludaniel.cts.sportiv2;

public class Program {
    public static void main(String[] args) {
        CreatorJucator creator = new CreatorMijlocas();
        creator.creaza("Hagi").joaca();

        creator = new CreatorPortar();
        creator.creaza("Stelea").joaca();

        creator = new CreatorMijlocas();
        creator.creaza("Popescu").joaca();

        creator = new CreatorAtacant();
        creator.creaza("Lacatus").joaca();
    }
}