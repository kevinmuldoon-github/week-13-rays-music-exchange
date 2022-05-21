package Instruments;

import Behaviours.IPlay;

public class Piano extends Instruments implements IPlay {

    private int numberOfKeys;
    private int numberOfTones;

    public Piano(String name, String type, String brand, int numberOfKeys, int numberOfTones) {
        super(name, type, brand);
        this.numberOfKeys = numberOfKeys;
        this.numberOfTones = numberOfTones;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public int getNumberOfTones() {
        return numberOfTones;
    }

    public String play(){
        return "Beautiful Melody";
    }
}
