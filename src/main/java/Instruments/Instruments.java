package Instruments;

public abstract class Instruments {

    private String name;
    private String type;
    private String brand;

    public Instruments(String name, String type, String brand) {
        this.name = name;
        this.type = type;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }
}
