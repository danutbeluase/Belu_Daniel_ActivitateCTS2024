package ro.ase.beludaniel.cts.stb3;

public class Program {
    public static void main(String[] args) {
        AutobuzLinie.Builder builder = new AutobuzLinie.Builder();
        builder.setConducatorAuto("Gigel").setAnFabricatie(2014).setModel("5250");
        AutobuzLinie autobuzLinie = builder.build();
        System.out.println(autobuzLinie);

        builder = new AutobuzLinie.Builder();
        builder.setAnFabricatie(2020).setConducatorAuto("Dorel").setMesajIntampinare("Bine ati venit!");
        autobuzLinie = builder.build();
        System.out.println(autobuzLinie);
    }
}