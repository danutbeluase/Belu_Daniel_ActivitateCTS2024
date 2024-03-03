package ro.ase.beludaniel.cts.spital4;

import java.util.List;

public class Program {
    public static void main(String[] args) {
        Reteta reteta = Reteta.getInstance();
        reteta.adaugaSolutii(new Integer[] { 1, 2, 3});
        List<Integer> solutii = reteta.getSolutii();
        solutii.stream().forEach(s -> System.out.println(s));

        reteta.adaugaSolutii(new Integer[] { 4, 5});
        solutii = reteta.getSolutii();
        solutii.stream().forEach(s -> System.out.println(s));
    }
}