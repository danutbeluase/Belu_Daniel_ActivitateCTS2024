package ro.ase.beludaniel.cts.stb1;

public class Program {
    public static void main(String[] args) {
        for(TipMijlocTransport tip : TipMijlocTransport.values()) {
            new CreatorMijlocTransport().creaza(tip).proneste();
        }
    }
}