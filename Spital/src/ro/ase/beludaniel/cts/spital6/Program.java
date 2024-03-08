package ro.ase.beludaniel.cts.spital6;

public class Program {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Ion Ion", 30, 2);
        Medic medic = new Medic("Popescu Vasile", "interne");
        incearcaInternarePacient(pacient, medic);

        pacient = new Pacient("ALexandru Muresan", 30, 4);
        incearcaInternarePacient(pacient, medic);
    }

    private static void incearcaInternarePacient(Pacient pacient, Medic medic) {
        if (medic.confirmaInternarea(pacient.getStareSanatate())) {
            try {
                if(Salon.getInstanta().rezervaLoc(pacient)) {
                    System.out.println(String.format("Pacientul %s a fost internat.", pacient));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else {
            System.out.println(String.format("Pacientul %s nu are nevoie de spitalizare.", pacient));
        }
    }
}