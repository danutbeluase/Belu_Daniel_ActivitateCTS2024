package ro.ase.beludaniel.cts.banca6.interfete;

import ro.ase.beludaniel.cts.banca6.clase.ContBancar;

public class DecoratorContClient extends DecoratorContBancar {
    public DecoratorContClient(ContBancar contBancar) {
        super(contBancar);
    }

    @Override
    public void plataContactLess() {
        System.out.printf("Plata contact less din contul %s.\n", this.contBancar.getNumarCont());
    }
}