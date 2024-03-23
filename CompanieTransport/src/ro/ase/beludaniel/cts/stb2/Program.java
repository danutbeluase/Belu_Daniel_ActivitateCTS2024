package ro.ase.beludaniel.cts.stb2;

public class Program {
    public static void main(String[] args) {
        FabricaAutobuze fabrica = FabricaAutobuze.getInstance();
        Autobuz autobuz = fabrica.creaza();
        autobuz.porneste();
        autobuz = fabrica.creaza();
        autobuz.porneste();
    }
}