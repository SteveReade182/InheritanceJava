package Vehicles;

import abstraction.Flyable;

public class Plane extends Vehicle implements Flyable{
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

    @Override
    public void fly() {
        System.out.println("I can Fly!!! It's a Plane!!!");
    }


    @Override
    public int getBill() {
        return (! hasWings) ? 10000:1000;
    }
}
