package ro.ase.beludaniel.cts.banca4;

public class Program {
    public static void main(String[] args) {
        Banca banca = Banca.getInstance();
        banca.deschideCont(new Client("Belu", "Daniel", "XD112200", "RO55555"));
        banca.deschideCont(new Client("Belu", "Daniel", "XD112200", "RO55555"));

        System.out.println(banca);
    }
}