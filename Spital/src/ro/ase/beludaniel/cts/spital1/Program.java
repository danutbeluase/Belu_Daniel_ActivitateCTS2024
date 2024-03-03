package ro.ase.beludaniel.cts.spital1;

public class Program {
    public static void main(String[] args) {
        ConstruireFacilitate facilitateBuilder = new FacilitateBuilder();
        facilitateBuilder.includeMicDejun();
        facilitateBuilder.includePatRabatabil();
        facilitateBuilder.includeSlapi();

        Pacient pacient = new Pacient("Danut", 46, facilitateBuilder.getFacilitate());
        System.out.println(pacient);
    }
}