package Instruments;

import Behaviours.IPlay;

public class Guitar extends Instruments implements IPlay {

    private int numberOfStrings;
    private String material;

    public Guitar(String name, String type, String brand, int numberOfStrings, String material) {
        super(name, type, brand);
        this.numberOfStrings = numberOfStrings;
        this.material = material;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String getMaterial() {
        return material;
    }

    public String play(){
        return "Wah Wah Wee Wah";
    }
}
