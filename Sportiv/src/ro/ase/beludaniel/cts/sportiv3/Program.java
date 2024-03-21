package ro.ase.beludaniel.cts.sportiv3;

public class Program {
    public static void main(String[] args) {
        Rezervare.Builder builder = new Rezervare.Builder();
        builder.areMuzicaAmbientala(true).genMuzica(2);
        System.out.println(builder.build().toString());

        builder = new Rezervare.Builder();
        Rezervare rezervare = builder.areScanErgonomic(true).includeMasa(true).build();
        System.out.println(rezervare);

        builder = new Rezervare.Builder();
        rezervare = builder.includeBautaraRacoritoare(true).includeMasa(true).build();
        System.out.println(rezervare);
    }
}