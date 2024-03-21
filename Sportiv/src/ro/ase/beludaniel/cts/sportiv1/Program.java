package ro.ase.beludaniel.cts.sportiv1;

public class Program  {
    public static void main(String[] args) {
        for(PostJucator rol : PostJucator.values()) {
            CreatorJucator creator = new CreatorJucator();
            Jucator jucator = creator.creaza(rol);
            jucator.joaca();
        }
    }
}