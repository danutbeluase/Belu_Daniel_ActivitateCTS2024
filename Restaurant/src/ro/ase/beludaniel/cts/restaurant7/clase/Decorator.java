package ro.ase.beludaniel.cts.restaurant7.clase;

import ro.ase.beludaniel.cts.restaurant7.interfete.Nota;

public class Decorator implements Nota {
    protected final Nota nota;

    public Decorator(Nota nota) {
        this.nota = nota;
    }

    @Override
    public void imprimare() {
        this.nota.imprimare();
        System.out.println("Trimitere felicitare");
    }
}