package ro.ase.beludaniel.cts.restaurant4.program;

import ro.ase.beludaniel.cts.restaurant4.clase.Restaurant;

public class Program {
    public static void main(String[] args) {
        Restaurant restaurant = Restaurant.getInstance();
        restaurant.adaugaClient("Belu Daniel");
        restaurant.adaugaClient("Belu Sorin");
        restaurant.adaugaClient("Belu Sorin");
        System.out.println(restaurant.toString());
    }
}
