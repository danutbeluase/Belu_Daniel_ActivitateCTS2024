package ro.ase.beludaniel.cts.banca6.program;

import ro.ase.beludaniel.cts.banca6.clase.*;
import ro.ase.beludaniel.cts.banca6.interfete.*;

public class Program {
    public static void main(String[] args) {
        ContBancar contBancar = new ContClient("RO552200");
        contBancar.plataOnline();
        contBancar.plataCard();

        DecoratorContBancar decoratorContBancar = new DecoratorContClient(contBancar);
        decoratorContBancar.plataCard();
        decoratorContBancar.plataOnline();
        decoratorContBancar.plataContactLess();
    }
}