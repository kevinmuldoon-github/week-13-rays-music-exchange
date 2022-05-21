package Instruments;

import Behaviours.IPlay;

public class Drums extends Instruments implements IPlay {

    private int numberOfPieces;

    public Drums(String name, String type, String brand, int numberOfPieces) {
        super(name, type, brand);
        this.numberOfPieces = numberOfPieces;
    }

    public int getNumberOfPieces() {
        return numberOfPieces;
    }

    public String play(){
        return "Dum Dum Dum";
    }
}
