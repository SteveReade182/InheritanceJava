package Vehicles;

public class Bike extends Vehicle{
    private boolean hasSideCar;

    public Bike(String make, String model, String colour, int speed, int numbDoors, boolean hasSideCar) {
        super(make, model, colour, speed, numbDoors);
        this.hasSideCar = hasSideCar;
    }

    public Bike(boolean hasSideCar) {
        this.hasSideCar = hasSideCar;
    }

    public boolean getHasSideCar() {
        return hasSideCar;
    }

    public void setHasSideCar(boolean hasSideCar) {
        this.hasSideCar = hasSideCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + getMake() + '\'' +
                ", model='" + getModel() + '\'' +
                ", colour='" + getColour() + '\'' +
                ", speed=" + getSpeed() + '\'' +
                ", numDoors=" + getNumDoors() + '\'' +
                ", hasSideCar=" + hasSideCar +
                '}';
    }

}
