package ro.ase.beludaniel.cts.farmacie3;

public class Program {
    public static void main(String[] args) {
        var builder = new Factura.Builder();
        builder.cardFidelitate(true);

        System.out.println(builder.build());

        builder = new Factura.Builder();
        builder.cotaTva(5).setNrPungi(1).plataCuCardul(true);
        Factura factura = builder.build();
        System.out.println(factura);
    }
}
