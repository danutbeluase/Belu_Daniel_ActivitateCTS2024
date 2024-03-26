package ro.ase.beludaniel.cts.farmacie6.clase;

public final class SistemIntegrat {
    private static SistemIntegrat instance = new SistemIntegrat();

    private final SistemGestiuneMedicamente sistemGestiuneMedicamente;
    private final SistemInformaticFarmacii sistemInformaticFarmacii;
    private final SistemSanatateCentralizat sistemSanatate;

    private SistemIntegrat() {
        System.out.println("Initializare sistem integrat farmacie.");
        this.sistemGestiuneMedicamente = new SistemGestiuneMedicamente();
        this.sistemInformaticFarmacii = new SistemInformaticFarmacii();
        this.sistemSanatate = new SistemSanatateCentralizat();
    }

    public static SistemIntegrat getInstance() {
        return instance;
    }

    public void verificaReteta(Reteta reteta, Client client) {
        this.sistemGestiuneMedicamente.verificareMedicamente(reteta);
        this.sistemInformaticFarmacii.verificaReteta(reteta);
        this.sistemSanatate.identificaClient(client);
    }
}