package ro.ase.beludaniel.cts.stb2;

import java.awt.event.WindowStateListener;

public class FabricaAutobuze  {
    private static FabricaAutobuze instance;
    private FabricaAutobuze() {
        System.out.println("Initializare proces de fabricare...");
    }

    public Autobuz creaza() {
        return new Autobuz();
    }

    public static FabricaAutobuze getInstance() {
        if(instance == null) {
            instance = new FabricaAutobuze();
        }

        return instance;
    }
}