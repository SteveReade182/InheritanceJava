package Vehicles;

public class Car extends Vehicle{
    public boolean bootOpen;

    public Car(String make, String model, String colour, int speed, int numbDoors, boolean bootOpen) {
        super(make, model, colour, speed, numbDoors);
        this.bootOpen = bootOpen;
    }

    public Car(boolean bootOpen) {
        this.bootOpen = bootOpen;
    }

    public boolean isBootOpen() {
        return bootOpen;
    }

    public void setBootOpen(boolean bootOpen) {
        this.bootOpen = bootOpen;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + getMake() + '\'' +
                ", model='" + getModel() + '\'' +
                ", colour='" + getColour() + '\'' +
                ", speed=" + getSpeed() + '\'' +
                ", numDoors=" + getNumDoors() + '\'' +
                ", bootOpen=" + bootOpen +
                '}';
    }
}
