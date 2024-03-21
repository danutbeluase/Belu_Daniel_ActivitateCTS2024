package ro.ase.beludaniel.cts.banca3;

public class Program {
    public static void main(String[] args) {
        var builder = new ContBancar.Builder();
        builder.setEstContSalariu(false).setAreCardAtasat(true).setAreInternetBanking(true);
        ContBancar contBancar = builder.build();
        System.out.println(contBancar);

        System.out.println(new ContBancar.Builder().setEstContSalariu(true).setAreCardAtasat(true).build());
    }
}