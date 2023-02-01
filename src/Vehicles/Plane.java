package Vehicles;

public class Plane extends Vehicle{
    private boolean hasWings;

    public Plane(String make, String model, String colour, int speed, int numbDoors, boolean hasWings) {
        super(make, model, colour, speed, numbDoors);
        this.hasWings = hasWings;
    }

    public Plane(boolean hasWings) {
        this.hasWings = hasWings;
    }

    public boolean getHasWings() {
        return hasWings;
    }

    public void setHasWings(boolean hasWings) {
        this.hasWings = hasWings;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + getMake() + '\'' +
                ", model='" + getModel() + '\'' +
                ", colour='" + getColour() + '\'' +
                ", speed=" + getSpeed() + '\'' +
                ", numDoors=" + getNumDoors() + '\'' +
                ", hasWings=" + hasWings +
                '}';
    }

}
