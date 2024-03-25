package ro.ase.beludaniel.cts.banca6.interfete;

import ro.ase.beludaniel.cts.banca6.clase.ContBancar;

public abstract class DecoratorContBancar implements ContBancar {
    protected final ContBancar contBancar;

    protected DecoratorContBancar(ContBancar contBancar) {
        this.contBancar = contBancar;
    }

    @Override
    public String getNumarCont() {
        return this.contBancar.getNumarCont();
    }

    @Override
    public void plataCard() {
        System.out.println("Plata cu cardul este acum securizata.");
        this.contBancar.plataCard();
    }

    @Override
    public void plataOnline() {
        System.out.println("Plata online cu cardul este acum securizata.");
        this.contBancar.plataOnline();
    }

    public abstract void plataContactLess();
}