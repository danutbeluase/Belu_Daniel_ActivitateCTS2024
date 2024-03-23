package ro.ase.beludaniel.cts.spital8.program;

import ro.ase.beludaniel.cts.spital8.clase.Departament;
import ro.ase.beludaniel.cts.spital8.clase.Sectie;

public class Program {
    public static void main(String[] args) {
        Departament spital = new Departament("Spital");
        Departament pediatrie = new Departament("Pediatrie");

        Sectie sectiePediatrie1 = new Sectie("Pediatrie 1"),
                sectiePediatrie2 = new Sectie("Pediatrie 2");
        pediatrie.adaugaSectie(sectiePediatrie1);
        pediatrie.adaugaSectie(sectiePediatrie2);

        Departament chirurgie = new Departament("Chirurgie");
        Sectie sectieChirurgie1 = new Sectie("Chirurgie 1");
        chirurgie.adaugaSectie(sectieChirurgie1);

        spital.configureazaDepartament(pediatrie);
        spital.adaugaDeapartament(chirurgie);
        spital.deschide();
    }
}